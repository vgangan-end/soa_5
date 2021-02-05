package IOStreamsAndExceptionHandling;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class IOStreamsReadBytes {
    public static void readWithBytes(String file) throws IOException {
        InputStream inputStream;
        int numberOfElements = 0;
        inputStream = new FileInputStream(file);
        int readValue;
        while ((readValue = inputStream.read()) >= 0) {
            numberOfElements++;
            byte readChar = (byte) readValue;
            System.out.print(readChar);
        }
        System.out.println("\nNumber of elements fount is: " + numberOfElements);
    }
}
