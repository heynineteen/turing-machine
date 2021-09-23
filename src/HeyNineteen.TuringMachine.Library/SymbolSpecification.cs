namespace HeyNineteen.TuringMachine.Library
{
    using System;

    public class SymbolSpecification
    {
        public SymbolSpecification(SymbolSpecificationWildcard wildcard)
        {
            Wildcard = wildcard ?? throw new ArgumentNullException(nameof(wildcard));
        }

        public SymbolSpecification(char symbol)
        {
            Symbol = symbol;
        }

        public SymbolSpecificationWildcard Wildcard { get; }

        public char? Symbol { get; }

        public bool IsWildcard => Wildcard != null;

        public bool IsSatisfiedBy(char? symbol)
        {
            if (!IsWildcard)
                return Symbol == symbol;

            if (Wildcard == SymbolSpecificationWildcard.AnyOrNone)
                return true;

            if (Wildcard == SymbolSpecificationWildcard.Any)
                return symbol != null;

            if (Wildcard == SymbolSpecificationWildcard.None)
                return symbol == null;

            return false;
        }

        public static implicit operator SymbolSpecification(SymbolSpecificationWildcard wildcard) => new(wildcard);

        public static implicit operator SymbolSpecification(char symbol) => new(symbol);

        public override string ToString() =>
            $"{Symbol?.ToString() ?? string.Empty}{Wildcard?.ToString() ?? string.Empty}";
    }
}