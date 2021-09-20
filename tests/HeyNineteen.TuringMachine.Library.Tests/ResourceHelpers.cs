namespace HeyNineteen.TuringMachine.Library.Tests
{
    using System;
    using System.IO;
    using System.Linq;
    using System.Reflection;

    public static class ResourceHelpers
    {
        public static string GetResourceAsString( string filename, Assembly assembly )
        {
            try
            {
                var resourceName = GetResourceName( filename, assembly );
                return ReadResourceString( resourceName, assembly );
            }
            catch (Exception ex)
            {
                throw new Exception( $"GetResourceAsString: Failed to load {filename} from {assembly.FullName}", ex );
            }
        }

        public static byte[] GetResourceAsBytes( string filename, Assembly assembly )
        {
            try
            {
                var resourceName = GetResourceName( filename, assembly );
                return ReadResourceBytes( resourceName, assembly );
            }
            catch (Exception ex)
            {
                throw new Exception( $"GetResourceAsBytes: Failed to load {filename} from {assembly.FullName}", ex );
            }
        }

        private static string GetResourceName( string filename, Assembly assembly )
        {
            var names = assembly.GetManifestResourceNames();
            return names.Single( n => n.EndsWith( filename ) );
        }

        private static string ReadResourceString( string resourceName, Assembly assembly )
        {
            using (var stream = assembly.GetManifestResourceStream( resourceName ))
            using (var reader = new StreamReader( stream ))
                return reader.ReadToEnd();
        }

        private static byte[] ReadResourceBytes( string resourceName, Assembly assembly )
        {
            using (var stream = assembly.GetManifestResourceStream( resourceName ))
            {
                var buffer = new byte[ stream.Length ];
                stream.Read( buffer, 0, buffer.Length );
                return buffer;
            }
        }
    }
}