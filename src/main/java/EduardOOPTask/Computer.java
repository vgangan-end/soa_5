package EduardOOPTask;

public class Computer {
    private String computerType;
    private String typeOfProcessor;
    private int ramGb;
    private double screenSize;

    public Computer(String computerType, String typeOfProcessor, int ramGb, double screenSize) {
        this.typeOfProcessor = typeOfProcessor;
        this.computerType = computerType;
        this.ramGb = ramGb;
        this.screenSize = screenSize;
    }

    public Computer() {
    }

    public String getTypeOfProcessor() {
        return this.typeOfProcessor;
    }

    public String getComputerType() {
        return this.computerType;
    }

    public int getRamGb() {
        return this.ramGb;
    }

    public double getScreenSize() {
        return this.screenSize;
    }

    public void setTypeOfProcessor(String typeOfProcessor) {
        this.typeOfProcessor = typeOfProcessor;
    }

    public void setComputerType(String computerType) {
        this.computerType = computerType;
    }

    public void setRamGb(int ramGb) {
        if (ramGb < 1) {
            System.out.println(computerType + " > RAM parameter cannot be lower than 1Gb");
        } else {
            this.ramGb = ramGb;
        }
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
}
