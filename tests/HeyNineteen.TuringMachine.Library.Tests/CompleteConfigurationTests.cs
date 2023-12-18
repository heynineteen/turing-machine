namespace HeyNineteen.TuringMachine.Library.Tests;

using FluentAssertions;
using NUnit.Framework;
using System;
using System.Diagnostics.CodeAnalysis;

[TestFixture]
[SuppressMessage("ReSharper", "ObjectCreationAsStatement")]
public class CompleteConfigurationTests
{
    [Test]
    public void ConstructorTest()
    {
        var tape = new Tape();
        MConfiguration mConfiguration = "a";

        ((Action)(() => new CompleteConfiguration(tape, null)))
            .Should().Throw<ArgumentNullException>();

        ((Action)(() => new CompleteConfiguration(null, mConfiguration)))
            .Should().Throw<ArgumentNullException>();
    }
}