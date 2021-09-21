namespace HeyNineteen.TuringMachine.Library
{
    using System;
    using System.Linq;

    public class SymbolSpecificationWildcard
    {
        public static SymbolSpecificationWildcard None = new SymbolSpecificationWildcard("None");
        public static SymbolSpecificationWildcard NotNone = new SymbolSpecificationWildcard( "NotNone" );
        public static SymbolSpecificationWildcard Any = new SymbolSpecificationWildcard( "Any" );

        private static readonly SymbolSpecificationWildcard[] All = new SymbolSpecificationWildcard[] {None, NotNone, Any};

        public string Name { get; }

        private SymbolSpecificationWildcard(string name)
        {
            Name = name;
        }

        public static SymbolSpecificationWildcard FromName( string name)
        {
            return All.FirstOrDefault(s => s.Name.Equals(name, StringComparison.InvariantCultureIgnoreCase));
        }

        public override string ToString() => Name;
    }
}