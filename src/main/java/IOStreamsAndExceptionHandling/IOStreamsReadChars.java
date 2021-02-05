package IOStreamsAndExceptionHandling;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class IOStreamsReadChars {
    public static void readWithChars(String file) throws IOException {
        Reader fileReader;
        fileReader = new FileReader(file);
        int readValue;
        while ((readValue = fileReader.read()) >= 0) {
            char readChar = (char) readValue;
            System.out.print(readChar);
        }
    }
}
