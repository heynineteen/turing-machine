namespace HeyNineteen.TuringMachine.Library
{
    using System;
    using System.Collections.Generic;

    public class Tape
    {
        private int _position;
        private readonly List<char?> _values = new() { null };

        public void MoveLeft()
        {
            if (_position == 0)
                throw new InvalidOperationException( "Cannot move left when at the beginning of the tape." );

            _position--;
        }

        public void MoveRight()
        {
            if (++_position > _values.Count - 1)
                _values.Add( null );
        }

        public void Erase()
        {
            _values[ _position ] = null;
        }

        public void Print( char value )
        {
            _values[ _position ] = value;
        }

        public char? Read()
        {
            return _values[ _position ];
        }

        public List<char?> State => new( _values );

        public int Position => _position;
    }
}