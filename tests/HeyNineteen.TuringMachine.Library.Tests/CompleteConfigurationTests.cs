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

    [Test]
    public void ToStringTest()
    {
        var tape = new Tape();

        MConfiguration mConfiguration1 = "a";
        MConfiguration mConfiguration2 = "b";

        var completeConfiguration = new CompleteConfiguration(tape, mConfiguration1);
        completeConfiguration.ToString().Should().Be(string.Concat("[" + mConfiguration1 + "]", " "));

        tape.Print('w');
        completeConfiguration.ToString().Should().Be(string.Concat("[" + mConfiguration1 + "]", "w"));

        tape.MoveRight();
        completeConfiguration.ToString().Should().Be(string.Concat("w", "[" + mConfiguration1 + "]", " "));

        tape.MoveRight();
        completeConfiguration.ToString().Should().Be(string.Concat("w", " ", "[" + mConfiguration1 + "]", " "));

        tape.MoveRight();
        completeConfiguration.ToString().Should().Be(string.Concat("w", " ", " ", "[" + mConfiguration1 + "]", " "));

        tape.Print('x');
        completeConfiguration.ToString().Should().Be(string.Concat("w", " ", " ", "[" + mConfiguration1 + "]", "x"));

        completeConfiguration.With(mConfiguration2);
        completeConfiguration.ToString().Should().Be(string.Concat("w", " ", " ", "[" + mConfiguration2 + "]", "x"));

        tape.MoveLeft();
        completeConfiguration.ToString().Should().Be(string.Concat("w", " ", "[" + mConfiguration2 + "]", " ", "x"));
    }
}