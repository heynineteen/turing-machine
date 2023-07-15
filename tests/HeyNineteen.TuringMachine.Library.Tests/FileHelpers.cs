namespace HeyNineteen.TuringMachine.Library.Tests;

using System.Diagnostics;
using System.IO;

public static class FileHelpers
{
    [Conditional("DEBUG")]
    public static void WriteToTempFile(string filename, string content)
    {
        File.WriteAllText(Path.Combine(Path.GetTempPath(), filename), content);
    }

    [Conditional("DEBUG")]
    public static void WriteToTempFile(string filename, byte[] content)
    {
        File.WriteAllBytes(Path.Combine(Path.GetTempPath(), filename), content);
    }
}