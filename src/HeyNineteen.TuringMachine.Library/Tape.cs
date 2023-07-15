namespace HeyNineteen.TuringMachine.Library;

using Core.Collections;
using System.Collections.Generic;
using System.Linq;

public class Tape
{
    private readonly TwoWayList<char?> _values = new(new char?[] { null }, null);

    public List<char?> State => _values.ToList();

    public int Position { get; private set; }

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

    private void EnsureCapacity()
    {
        if (Position < _values.LowestIndex)
            _values.AddBack(null);
        else if (Position > _values.HightestIndex)
            _values.AddForward(null);
    }

    public void Erase() => _values[Position] = null;

    public void Print(char value) => _values[Position] = value;

    public char? Read() => _values[Position];
}