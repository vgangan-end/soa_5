package IOStreamsAndExceptionHandling;

import java.io.*;

public class SerializeObject {
    public static void serializeObject(Calculator calculator, String file) throws IOException {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(("src/main/resources/SerializedFile")));
        outputStream.writeObject(calculator);
        outputStream.close();
    }

    public static Calculator deserializeObject(String file) {
        Calculator calculator = null;
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
            calculator = (Calculator) inputStream.readObject();
            inputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return calculator;
    }
}