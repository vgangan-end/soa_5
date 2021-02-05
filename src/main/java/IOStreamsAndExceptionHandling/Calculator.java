package IOStreamsAndExceptionHandling;

import java.io.Serializable;

public class Calculator implements Serializable {
    private int numberOfCores;
    private String manufacturer;
    private boolean isKeyboardQwerty;
    private boolean hasHDMIPort;

    public Calculator(int numberOfCores, String manufacturer, boolean isKeyboardQwerty, boolean hasHDMIPort) {
        this.numberOfCores = numberOfCores;
        this.manufacturer = manufacturer;
        this.isKeyboardQwerty = isKeyboardQwerty;
        this.hasHDMIPort = hasHDMIPort;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public boolean isKeyboardQwerty() {
        return isKeyboardQwerty;
    }

    public boolean isHasHDMIPort() {
        return hasHDMIPort;
    }
}
