namespace HeyNineteen.TuringMachine.Library.Tests
{
    using FluentAssertions;
    using NUnit.Framework;

    [TestFixture]
    public class SymbolSpecificationTests
    {
        [Test]
        public void MatchSymbolTest()
        {
            SymbolSpecification specification = 'a';

            specification.IsSatisfiedBy('a').Should().BeTrue();
            specification.IsSatisfiedBy( 'b' ).Should().BeFalse();
            specification.IsSatisfiedBy( 'c' ).Should().BeFalse();
            specification.IsSatisfiedBy( null ).Should().BeFalse();
        }

        [Test]
        public void MatchAnyTest()
        {
            SymbolSpecification specification = SymbolSpecificationWildcard.Any;

            specification.IsSatisfiedBy( 'a' ).Should().BeTrue();
            specification.IsSatisfiedBy( 'b' ).Should().BeTrue();
            specification.IsSatisfiedBy( 'c' ).Should().BeTrue();
            specification.IsSatisfiedBy( null ).Should().BeFalse();
        }

        [Test]
        public void MatchNoneTest()
        {
            SymbolSpecification specification = SymbolSpecificationWildcard.None;

            specification.IsSatisfiedBy( 'a' ).Should().BeFalse();
            specification.IsSatisfiedBy( 'b' ).Should().BeFalse();
            specification.IsSatisfiedBy( 'c' ).Should().BeFalse();
            specification.IsSatisfiedBy( null ).Should().BeTrue();
        }

        [Test]
        public void MatchAnyOrNoneTest()
        {
            SymbolSpecification specification = SymbolSpecificationWildcard.AnyOrNone;

            specification.IsSatisfiedBy( 'a' ).Should().BeTrue();
            specification.IsSatisfiedBy( 'b' ).Should().BeTrue();
            specification.IsSatisfiedBy( 'c' ).Should().BeTrue();
            specification.IsSatisfiedBy( null ).Should().BeTrue();
        }
    }
}