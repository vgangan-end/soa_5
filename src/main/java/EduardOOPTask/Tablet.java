package EduardOOPTask;

public class Tablet extends PortableDevice implements StandardSpecs {

    @Override
    public void devicePowerOn() {
        System.out.println("Tablet PowerOn");
    }

    @Override
    public void deviceSound() {
        System.out.println("Tablet notification \"Tinki\"");
    }

    @Override
    public void inputType() {
        System.out.println("Tablet touchScreen input received");
    }

    @Override
    void deviceVibration() {
        System.out.println("Tablet tablet VibrationON");
    }
}
