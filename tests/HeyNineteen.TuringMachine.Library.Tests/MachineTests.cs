namespace HeyNineteen.TuringMachine.Library.Tests
{
    using FluentAssertions;
    using NUnit.Framework;
    using System.Reflection;

    [TestFixture]
    public class MachineTests 
    {
        [TestCase( "ComputeAlternate0sAnd1s.machine", "ComputeAlternate0sAnd1s.state", 12 )] // p.81 compute alternate 0s and 1s
        [TestCase( "ComputeIncreasinglyLongerRuns.machine", "ComputeIncreasinglyLongerRuns.state", 224 )] // p.87
        [TestCase("AllPositiveIntegers.machine", "AllPositiveIntegers.state", 100)] // p.99
        [TestCase("SquareRootOf2.machine", "SquareRootOf2.state", 100000)] // p.102
        public void Test(string machineFile, string stateFile, int iterations)
        {
            var input = ResourceHelpers.GetResourceAsString(machineFile, Assembly.GetExecutingAssembly());
            var expected = ResourceHelpers.GetResourceAsString(stateFile, Assembly.GetExecutingAssembly());

            var builder = new MachineBuilder();

            var machine = builder.Build(input).Machine;

            machine.Should().NotBeNull();

            for(int i = 0; i < iterations; i++)
                machine.Tick();

            FileHelpers.WriteToTempFile(machineFile, input);
            FileHelpers.WriteToTempFile(stateFile, expected);

            machine.State.Should().Be(expected);
        }
    }
}