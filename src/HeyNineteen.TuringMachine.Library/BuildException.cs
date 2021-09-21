namespace HeyNineteen.TuringMachine.Library
{
    using System;
    using System.Net.NetworkInformation;
    using System.Runtime.Serialization;

    [Serializable]
    public class BuildException : Exception
    {
        private const string Prefix = "Failed to build machine with input: ";

        public BuildException(string input) : base(Prefix + input)
        {
        }

        public BuildException(string input, Exception inner) : base(Prefix + input, inner)
        {
        }

        protected BuildException(
            SerializationInfo info,
            StreamingContext context) : base(info, context)
        {
        }
    }
}