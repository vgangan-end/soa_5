package IOStreamsAndExceptionHandling;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadWrtieTResult {
    private int fistNumber;
    private int secondNumber;
    private int sum;

    public ReadWrtieTResult(int fistNumber, int secondNumber) {
        this.fistNumber = fistNumber;
        this.secondNumber = secondNumber;
    }
//trebuie sa citesc datele din fiesier pentru ficare int

    public int getFistNumber() {


        return fistNumber;

    }

    public void setFistNumber(int fistNumber) {
        this.fistNumber = fistNumber;

    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void readWithChars(String file) throws IOException {
        Reader fileReader;
        fileReader = new FileReader(file);
        int readValue;
        while ((readValue = fileReader.read()) >= 0) {
            String readChar = String.valueOf((char) readValue);
            if (readChar.endsWith(";")) firstNumber = true;
            System.out.print(readChar);
        }
    }
}
