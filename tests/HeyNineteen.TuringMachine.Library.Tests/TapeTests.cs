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

        tape.GetState().Values.Should().BeEquivalentTo(new char?[] { null }, opts => opts.WithStrictOrdering());

        tape.Print('w');
        tape.GetState().Values.Should().BeEquivalentTo(new char?[] { 'w' }, opts => opts.WithStrictOrdering());

        tape.MoveLeft();
        tape.GetState().Values.Should().BeEquivalentTo(new char?[] { null, 'w' }, opts => opts.WithStrictOrdering());

        tape.Print('x');
        tape.GetState().Values.Should().BeEquivalentTo(new char?[] { 'x', 'w' }, opts => opts.WithStrictOrdering());

        tape.MoveLeft();
        tape.GetState().Values.Should().BeEquivalentTo(new char?[] { null, 'x', 'w' }, opts => opts.WithStrictOrdering());

        tape.Print('y');
        tape.GetState().Values.Should().BeEquivalentTo(new char?[] { 'y', 'x', 'w' }, opts => opts.WithStrictOrdering());

        tape.Erase();
        tape.GetState().Values.Should().BeEquivalentTo(new char?[] { null, 'x', 'w' }, opts => opts.WithStrictOrdering());

        tape.MoveRight();
        tape.Erase();
        tape.GetState().Values.Should().BeEquivalentTo(new char?[] { null, 'w' }, opts => opts.WithStrictOrdering());
    }

    [Test]
    public void MovingRightStateTest()
    {
        var tape = new Tape();

        tape.GetState().Values.Should().BeEquivalentTo(new char?[] { null }, opts => opts.WithStrictOrdering());

        tape.Print('w');
        tape.GetState().Values.Should().BeEquivalentTo(new char?[] { 'w' }, opts => opts.WithStrictOrdering());

        tape.MoveRight();
        tape.GetState().Values.Should().BeEquivalentTo(new char?[] { 'w', null }, opts => opts.WithStrictOrdering());

        tape.Print('x');
        tape.GetState().Values.Should().BeEquivalentTo(new char?[] { 'w', 'x' }, opts => opts.WithStrictOrdering());

        tape.MoveRight();
        tape.GetState().Values.Should().BeEquivalentTo(new char?[] { 'w', 'x', null }, opts => opts.WithStrictOrdering());

        tape.Print('y');
        tape.GetState().Values.Should().BeEquivalentTo(new char?[] { 'w', 'x', 'y' }, opts => opts.WithStrictOrdering());

        tape.Erase();
        tape.GetState().Values.Should().BeEquivalentTo(new char?[] { 'w', 'x', null }, opts => opts.WithStrictOrdering());

        tape.MoveLeft();
        tape.Erase();
        tape.GetState().Values.Should().BeEquivalentTo(new char?[] { 'w', null }, opts => opts.WithStrictOrdering());
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

        tape.GetState().Values.Should().BeEquivalentTo(new char?[] { 'a', 'b', 'c', 'd', 'e', 'f' }, opts => opts.WithStrictOrdering());
    }
}