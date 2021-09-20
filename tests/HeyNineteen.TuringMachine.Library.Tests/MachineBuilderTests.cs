namespace HeyNineteen.TuringMachine.Library.Tests
{
    using System.Reflection;
    using System.Resources;
    using FluentAssertions;
    using NSubstitute;
    using NUnit.Framework;

    [TestFixture]
    public class MachineBuilderTests
    {
        [Test]
        public void ComputeAlternate0sAnd1sTest()
        {
            var input = ResourceHelpers.GetResourceAsString("ComputeAlternate0sAnd1s.turing", Assembly.GetExecutingAssembly());

            var builder = new MachineBuilder();

            var machine = builder.Build(input);

            true.Should().BeFalse();
        }
    }
}