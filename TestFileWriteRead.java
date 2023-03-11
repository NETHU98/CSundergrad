import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class TestFileWriteRead {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("sampleFile.txt");
            writeUsingNIO(path);
            readUsingNIO(path);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void writeUsingNIO(Path Xpath) throws IOException {
        BufferedWriter bufferedWriter = Files.newBufferedWriter(Xpath);
        try {
            System.out.println("Writing contents to file.");
            //Type your code here
            bufferedWriter.write("Soccer");
            bufferedWriter.newLine();
            bufferedWriter.write("Tennis");
            bufferedWriter.newLine();
            bufferedWriter.write("Badminton");
            bufferedWriter.newLine();
            bufferedWriter.write("Hockey");
        }
        catch (IOException ioe) {
            bufferedWriter.close();
            ioe.printStackTrace();
        }
        finally {
            bufferedWriter.close();
        }
    }
    private static void readUsingNIO(Path Xpath) throws IOException {
        BufferedReader bufferedReader = Files.newBufferedReader(Xpath);
        try {
            String line;
            System.out.println("Reading file"+ Xpath.getFileName().toString());
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException ioe) {
            bufferedReader.close();
            ioe.printStackTrace();
        }
        finally {
            bufferedReader.close();
        }
    }
}
