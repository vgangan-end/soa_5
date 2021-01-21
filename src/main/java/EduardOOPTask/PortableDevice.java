package EduardOOPTask;

public abstract class PortableDevice {
    public void deviceNotification() {
        System.out.println("Device notification received.");
    }

    abstract void deviceVibration();
}
