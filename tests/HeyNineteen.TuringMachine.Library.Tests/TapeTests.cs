namespace HeyNineteen.TuringMachine.Library.Tests
{
    using FluentAssertions;
    using NUnit.Framework;
    using System;

    [TestFixture]
    public class TapeTests
    {

        [Test]
        public void MoveBeforeBeginningOfTapeTest()
        {
            ((Action)(() => new Tape().MoveLeft()))
                .Should().Throw<InvalidOperationException>();

            ((Action)(() =>
                {
                    var tape = new Tape();
                    tape.MoveRight();
                    tape.MoveRight();
                    tape.MoveLeft();
                    tape.MoveLeft();
                    tape.MoveLeft();
                }))
                .Should().Throw<InvalidOperationException>();
        }

        [Test]
        public void StateTest()
        {
            var tape = new Tape();

            tape.State.Should().BeEquivalentTo( new char?[] { null }, opts => opts.WithStrictOrdering() );

            tape.Print( 'w' );
            tape.State.Should().BeEquivalentTo( new char?[] { 'w' }, opts => opts.WithStrictOrdering() );

            tape.MoveRight();
            tape.State.Should().BeEquivalentTo( new char?[] { 'w', null }, opts => opts.WithStrictOrdering() );

            tape.Print( 'x' );
            tape.State.Should().BeEquivalentTo( new char?[] { 'w', 'x' }, opts => opts.WithStrictOrdering() );

            tape.MoveRight();
            tape.State.Should().BeEquivalentTo( new char?[] { 'w', 'x', null }, opts => opts.WithStrictOrdering() );

            tape.Print( 'y' );
            tape.State.Should().BeEquivalentTo( new char?[] { 'w', 'x', 'y' }, opts => opts.WithStrictOrdering() );

            tape.Erase();
            tape.State.Should().BeEquivalentTo( new char?[] { 'w', 'x', null }, opts => opts.WithStrictOrdering() );

            tape.MoveLeft();
            tape.Erase();
            tape.State.Should().BeEquivalentTo( new char?[] { 'w', null, null }, opts => opts.WithStrictOrdering() );
        }


    }
}