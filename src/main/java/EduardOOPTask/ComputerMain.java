package EduardOOPTask;

public class ComputerMain {
    public static void main(String[] args) {
        Computer desktopComputer = new Computer("desktop",
                "i3", 8, 17);
        Computer iMac = new Computer();
        Computer laptop = new Notebook();
        Computer thinkPad = new Notebook("Laptop", "i9", 16, 17.0);

        Tablet iPad = new Tablet();

        iPad.devicePowerOn();
        iPad.deviceSound();
        iPad.inputType();
        iPad.deviceNotification();
        System.out.println();

        desktopComputer.setTypeOfProcessor("i5");
        desktopComputer.setComputerType("desktopComputer");
        desktopComputer.setRamGb(8);
        desktopComputer.setScreenSize(15.6);

        iMac.setTypeOfProcessor("i7");
        iMac.setComputerType("iMac");
        iMac.setRamGb(10);
        iMac.setScreenSize(20);

        laptop.setTypeOfProcessor("i7");
        laptop.setComputerType("Lenovo laptop");
        laptop.setRamGb(6);
        laptop.setScreenSize(20);

        System.out.println("Computer Type: " + desktopComputer.getComputerType());
        System.out.println("Type of processor: " + desktopComputer.getTypeOfProcessor());
        System.out.println("Ram: " + desktopComputer.getRamGb());
        System.out.println("Screen size: " + desktopComputer.getScreenSize());
        System.out.println("###################################");

        System.out.println("Computer Type: " + iMac.getComputerType());
        System.out.println("Type of processor: " + iMac.getTypeOfProcessor());
        System.out.println("Ram: " + iMac.getRamGb());
        System.out.println("Screen size: " + iMac.getScreenSize());
        System.out.println("###################################");

        System.out.println("Computer Type: " + laptop.getComputerType());
        System.out.println("Type of processor: " + laptop.getTypeOfProcessor());
        System.out.println("Ram: " + laptop.getRamGb());
        System.out.println("Screen size: " + laptop.getScreenSize());
        System.out.println("###################################");

        System.out.println("Computer Type: " + thinkPad.getComputerType());
        System.out.println("Ram: " + thinkPad.getRamGb());
        System.out.println("Screen size: " + thinkPad.getScreenSize());
        System.out.println("Type of processor: " + thinkPad.getTypeOfProcessor());
    }
}
