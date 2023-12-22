namespace HeyNineteen.TuringMachine.ConsoleApp;

using Library;
using System.IO;
using System;

public static class FileX
{
    public static void WriteToFile(int stepCount, Machine machine)
    {
        var state = machine.State;

        var metaDataText = 
            $"StepCount: {stepCount}, MConfiguration: {state.MConfiguration}," +
            $" Position: {state.TapeAdjustedPosition}, CurrentValue: {state.TapeValues[state.TapePosition]}";

        var fileName = $"{typeof(FileX).Assembly.GetName().Name}-{DateTime.Now.ToString("yyyy-MM-dd-hh-mm-ss-ffff")}";

        var fullPath = Path.Combine(Path.GetTempPath(), fileName);

        using var streamWriter = new StreamWriter(fullPath);
        streamWriter.WriteLine(metaDataText);
        streamWriter.WriteLine(machine.State.TapeAdjustedValues.ToString());
    }
}