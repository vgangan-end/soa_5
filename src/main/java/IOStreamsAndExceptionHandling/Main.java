package IOStreamsAndExceptionHandling;
import java.io.IOException;

import static IOStreamsAndExceptionHandling.IOStreamsReadBytes.readWithBytes;
import static IOStreamsAndExceptionHandling.IOStreamsReadChars.readWithChars;
import static IOStreamsAndExceptionHandling.SerializeObject.deserializeObject;
import static IOStreamsAndExceptionHandling.SerializeObject.serializeObject;

public class Main {
    public static void main(String[] args) {
        String file = "src/main/resources/IOStreamData";
//        String serializeObjectFile = "src/main/resources/SerializedFile";
//        Calculator calculator = new Calculator(4, "Lenovo", true, false);
        try {
            readWithChars(file);
//            readWithBytes(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        Calculator thinkPad;
//        try {
//            serializeObject(calculator, serializeObjectFile);
//            thinkPad = deserializeObject(serializeObjectFile);
//            System.out.println("\nIs manufacturere the same?: " + thinkPad.getManufacturer().equals(calculator.getManufacturer()));
//            System.out.println("Is number of cores the same?: " + (thinkPad.getNumberOfCores() == (calculator.getNumberOfCores())));
//            System.out.println("Is keyboard the same?: " + (thinkPad.isKeyboardQwerty() == (calculator.isKeyboardQwerty())));
//            System.out.println("Is HDMI the same?: " + (thinkPad.isHasHDMIPort() == (calculator.isHasHDMIPort())));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
