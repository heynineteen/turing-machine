namespace HeyNineteen.TuringMachine.Library;

using System;
using System.Diagnostics;
using System.Linq;

public class Tape
{
    private const int DefaultCapacity = 4;
    private const char DefaultValue = ' ';
    private static readonly Predicate<char> IsRelevantValue = c => c != DefaultValue;

    private char[] _buffer = Enumerable.Repeat(DefaultValue, DefaultCapacity).ToArray();

    public int Position { get; private set; }

    /// <summary>
    /// Raw values in the internal buffer.
    ///
    /// The returned span should only be considered valid
    /// until a state changing method is called:
    /// <see cref="MoveLeft"/>, <see cref="MoveRight"/>
    /// <see cref="Erase"/> or <see cref="Print"/>.
    /// At that point, the internal buffer may be re-allocated.
    /// </summary>
    public ReadOnlySpan<char> Values => new(_buffer);

    public int AdjustedPosition => Position - GetLowestRelevantPosition();

    /// <summary>
    /// Values in the internal buffer adjusted to only include
    /// relevant values. I.e. excludes default values at either
    /// extreme of the tape.
    ///
    /// The returned span should only be considered valid
    /// until a state changing method is called:
    /// <see cref="MoveLeft"/>, <see cref="MoveRight"/>
    /// <see cref="Erase"/> or <see cref="Print"/>.
    /// At that point, the internal buffer may be re-allocated.
    /// </summary>
    public ReadOnlySpan<char> AdjustedValues
    {
        get
        {
            var lowestRelevantPosition = GetLowestRelevantPosition();
            var highestRelevantPosition = GetHighestRelevantPosition();
            return new(_buffer, lowestRelevantPosition, highestRelevantPosition - lowestRelevantPosition + 1);
        }
    }

    private void EnsureCapacity()
    {
        if (Position < 0)
        {
            Debug.Assert(Position == -1);
            ExpandLeft();
        }
        else if (Position >= _buffer.Length)
        {
            Debug.Assert(Position == _buffer.Length);
            ExpandRight();
        }
    }

    private void ExpandRight()
    {
        // TODO Overflow check
        var newBuffer = new char[_buffer.Length * 2];
        Array.Fill(newBuffer, DefaultValue, _buffer.Length, _buffer.Length);
        Array.Copy(_buffer, newBuffer, _buffer.Length);
        _buffer = newBuffer;
    }

    private void ExpandLeft()
    {
        // TODO Overflow check
        var newBuffer = new char[_buffer.Length * 2];
        Array.Fill(newBuffer, DefaultValue, 0, _buffer.Length);
        Array.Copy(_buffer, 0, newBuffer, _buffer.Length, _buffer.Length);
        Position = _buffer.Length - 1;
        _buffer = newBuffer;
    }

    private int GetLowestRelevantPosition()
    {
        var lowestRelevantPosition = Array.FindIndex(_buffer, IsRelevantValue);

        if (lowestRelevantPosition == -1)
            return Position;

        return Math.Min(lowestRelevantPosition, Position);
    }

    private int GetHighestRelevantPosition()
    {
        var highestRelevantPosition = Array.FindLastIndex(_buffer, IsRelevantValue);

        return Math.Max(highestRelevantPosition, Position);
    }

    public void MoveLeft()
    {
        Position--;
        EnsureCapacity();
    }

    public void MoveRight()
    {
        Position++;
        EnsureCapacity();
    }

    public void Erase() => _buffer[Position] = DefaultValue;

    public void Print(char value) => _buffer[Position] = value;

    public char? Read() => _buffer[Position] == DefaultValue ? null : _buffer[Position];
}