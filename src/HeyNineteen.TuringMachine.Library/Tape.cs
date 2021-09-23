namespace HeyNineteen.TuringMachine.Library
{
    using System;
    using System.Collections.Generic;
    using System.Linq;

    public class Tape
    {
        private int _position;
        
        // value at position 0 is held at index 0 of _positiveIndexValues
        private readonly List<char?> _positiveIndexValues = new() {null};

        // value at index 0 is ignored
        private readonly List<char?> _negativeIndexValues = new() {null};

        public void MoveLeft()
        {
            _position--;
            EnsureCapacity();
        }

        public void MoveRight()
        {
            _position++;
            EnsureCapacity();
        }

        private void EnsureCapacity()
        {
            if (_position < 0)
            {
                var absolutePosition = Math.Abs(_position);
                while (absolutePosition > _negativeIndexValues.Count - 1)
                {
                    _negativeIndexValues.Add(null);
                }
            }
            else if (_position > 0)
            {
                while (_position > _positiveIndexValues.Count - 1)
                {
                    _positiveIndexValues.Add(null);
                }
            }
        }

        public void Erase()
        {
            if (_position >= 0)
                _positiveIndexValues[_position] = null;
            else
                _negativeIndexValues[Math.Abs(_position)] = null;
        }

        public void Print(char value)
        {
            if (_position >= 0)
                _positiveIndexValues[_position] = value;
            else
                _negativeIndexValues[Math.Abs(_position)] = value;
        }

        public char? Read()
        {
            return _position >= 0
                ? _positiveIndexValues[_position]
                : _negativeIndexValues[Math.Abs(_position)];
        }

        public List<char?> State => new(_negativeIndexValues.Skip(1).Reverse().Concat(_positiveIndexValues));

        public int Position => _position;
    }
}