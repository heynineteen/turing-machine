namespace HeyNineteen.TuringMachine.Library.Tests;

using FluentAssertions;
using NUnit.Framework;
using System.Reflection;

[TestFixture]
public class MachineTests
{
    [TestCase("ComputeAlternate0sAnd1s.machine", "ComputeAlternate0sAnd1s.state", 12, "b", 12)] // p.81 compute alternate 0s and 1s
    [TestCase("ComputeIncreasinglyLongerRuns.machine", "ComputeIncreasinglyLongerRuns.state", 2, "f", 224)] // p.87
    [TestCase("AllPositiveIntegers.machine", "AllPositiveIntegers.state", 0, "i", 100)] // p.99
    [TestCase("SquareRootOf2.machine", "SquareRootOf2.state", 28, "add-zero", 100000)] // p.102
    public void Test(string machineFile, string stateFile, int expectectedHeadPosition, string expectedMConfiguration, int iterations)
    {
        var input = ResourceHelpers.GetResourceAsString(machineFile, Assembly.GetExecutingAssembly());
        var expectedTapeValues = ResourceHelpers.GetResourceAsString(stateFile, Assembly.GetExecutingAssembly());

        var builder = new MachineBuilder();

        var machine = builder.Build(input).Machine;

        machine.Should().NotBeNull();

        for (int i = 0; i < iterations; i++)
            machine.Tick();

        FileHelpers.WriteToTempFile(machineFile, input);
        FileHelpers.WriteToTempFile(stateFile, expectedTapeValues);

        machine.State.TapeValues.Should().Be(expectedTapeValues);
        machine.State.TapePosition.Should().Be(expectectedHeadPosition);
        machine.State.MConfiguration.Should().Be(expectedMConfiguration);
    }
}