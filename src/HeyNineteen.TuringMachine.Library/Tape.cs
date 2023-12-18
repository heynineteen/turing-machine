namespace HeyNineteen.TuringMachine.Library;

using Core.Collections;
using System;
using System.Collections.Generic;
using System.Linq;

public class Tape
{
    private readonly Dictionary<int, char> _values2 = new();

    public TapeState GetState() => GenerateState();

    private TapeState GenerateState()
    {

        return new TapeState(GenerateCharacterArray(), TranslatePosition());

        char?[] GenerateCharacterArray()
        {
            var result = new char?[HighestPosition - LowestPosition + 1];
            var arrayIndex = 0;
            for (var i = LowestPosition; i <= HighestPosition; i++, arrayIndex++)
            {
                if (_values2.TryGetValue(i, out var value))
                    result[arrayIndex] = value;
            }

            return result;
        }

        int TranslatePosition() =>
            Position + Math.Abs(Math.Min(LowestPosition, 0));
    }

    public int Position { get; private set; }

    public int LowestPosition => Math.Min(Position, _values2.Any() ? _values2.Keys.Min() : Position);

    public int HighestPosition => Math.Max(Position, _values2.Any() ? _values2.Keys.Max() : Position);

    public void MoveLeft() => Position--;

    public void MoveRight() => Position++;

    public void Erase() => _values2.Remove(Position);

    public void Print(char value) => _values2[Position] = value;

    public char? Read() => _values2.ContainsKey(Position) ? _values2[Position] : null;
}