namespace HeyNineteen.TuringMachine.Library.Tests;

using FluentAssertions;
using NUnit.Framework;
using System.Diagnostics.CodeAnalysis;

[TestFixture]
public class MConfigurationTests
{

    [Test]
    [SuppressMessage("ReSharper", "EqualExpressionComparison")]
    public void EqualityTests()
    {
        MConfiguration configuration1 = "a";
        MConfiguration configuration2 = "a";
        MConfiguration configuration3 = "b";

#pragma warning disable CS1718
        (configuration1 == configuration1).Should().BeTrue();
#pragma warning restore CS1718
        (configuration1 == configuration2).Should().BeTrue();
        (configuration1 == configuration3).Should().BeFalse();
    }

}