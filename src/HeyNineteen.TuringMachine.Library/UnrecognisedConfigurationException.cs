namespace HeyNineteen.TuringMachine.Library
{
    using System;
    using System.Runtime.Serialization;

    [Serializable]
    public class UnrecognisedConfigurationException : Exception
    {
        public UnrecognisedConfigurationException(Configuration configuration)
            : this($"Unrecognised configuration: MConfiguration:'{configuration?.MConfiguration.Value}', Symbol: '{configuration?.Symbol}'")
        {
        }

        private UnrecognisedConfigurationException(string message) : base(message)
        {
        }

        protected UnrecognisedConfigurationException(
            SerializationInfo info,
            StreamingContext context) : base(info, context)
        {
        }
    }
}