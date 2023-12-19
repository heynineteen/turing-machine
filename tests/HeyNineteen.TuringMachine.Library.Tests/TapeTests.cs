namespace HeyNineteen.TuringMachine.Library.Tests;

using FluentAssertions;
using NUnit.Framework;

[TestFixture]
public class TapeTests
{

    [Test]
    public void MovingLeftStateTest()
    {
        var tape = new Tape();

        tape.AdjustedValues.ToArray().Should().BeEquivalentTo(new char?[] { ' ' }, opts => opts.WithStrictOrdering());

        tape.Print('w');
        tape.AdjustedValues.ToArray().Should().BeEquivalentTo(new char?[] { 'w' }, opts => opts.WithStrictOrdering());

        tape.MoveLeft();
        tape.AdjustedValues.ToArray().Should().BeEquivalentTo(new char?[] { ' ', 'w' }, opts => opts.WithStrictOrdering());

        tape.Print('x');
        tape.AdjustedValues.ToArray().Should().BeEquivalentTo(new char?[] { 'x', 'w' }, opts => opts.WithStrictOrdering());

        tape.MoveLeft();
        tape.AdjustedValues.ToArray().Should().BeEquivalentTo(new char?[] { ' ', 'x', 'w' }, opts => opts.WithStrictOrdering());

        tape.Print('y');
        tape.AdjustedValues.ToArray().Should().BeEquivalentTo(new char?[] { 'y', 'x', 'w' }, opts => opts.WithStrictOrdering());

        tape.Erase();
        tape.AdjustedValues.ToArray().Should().BeEquivalentTo(new char?[] { ' ', 'x', 'w' }, opts => opts.WithStrictOrdering());

        tape.MoveRight();
        tape.Erase();
        tape.AdjustedValues.ToArray().Should().BeEquivalentTo(new char?[] { ' ', 'w' }, opts => opts.WithStrictOrdering());
    }

    [Test]
    public void MovingRightStateTest()
    {
        var tape = new Tape();

        tape.AdjustedValues.ToArray().Should().BeEquivalentTo(new char?[] { ' ' }, opts => opts.WithStrictOrdering());

        tape.Print('w');
        tape.AdjustedValues.ToArray().Should().BeEquivalentTo(new char?[] { 'w' }, opts => opts.WithStrictOrdering());

        tape.MoveRight();
        tape.AdjustedValues.ToArray().Should().BeEquivalentTo(new char?[] { 'w', ' ' }, opts => opts.WithStrictOrdering());

        tape.Print('x');
        tape.AdjustedValues.ToArray().Should().BeEquivalentTo(new char?[] { 'w', 'x' }, opts => opts.WithStrictOrdering());

        tape.MoveRight();
        tape.AdjustedValues.ToArray().Should().BeEquivalentTo(new char?[] { 'w', 'x', ' ' }, opts => opts.WithStrictOrdering());

        tape.Print('y');
        tape.AdjustedValues.ToArray().Should().BeEquivalentTo(new char?[] { 'w', 'x', 'y' }, opts => opts.WithStrictOrdering());

        tape.Erase();
        tape.AdjustedValues.ToArray().Should().BeEquivalentTo(new char?[] { 'w', 'x', ' ' }, opts => opts.WithStrictOrdering());

        tape.MoveLeft();
        tape.Erase();
        tape.AdjustedValues.ToArray().Should().BeEquivalentTo(new char?[] { 'w', ' ' }, opts => opts.WithStrictOrdering());
    }

    [Test]
    public void StateTest()
    {
        var tape = new Tape();

        tape.MoveLeft();
        tape.MoveLeft();
        tape.MoveLeft();
        tape.Print('a');
        tape.MoveRight();
        tape.Print('b');
        tape.MoveRight();
        tape.Print('c');
        tape.MoveRight();
        tape.Print('d');
        tape.MoveRight();
        tape.Print('e');
        tape.MoveRight();
        tape.Print('f');

        tape.AdjustedValues.ToArray().Should().BeEquivalentTo(new char?[] { 'a', 'b', 'c', 'd', 'e', 'f' }, opts => opts.WithStrictOrdering());
    }
}