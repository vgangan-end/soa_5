package Daniela_Chihai.com.Endava.SoA5.Java_OOP;

public class Human extends Mammal implements Play{
    private double height;
    private double weight;
    private String colourOfEyes;
    private String colourofHair;
    private final int NR_OF_LEGS = 2;
    private final int NR_OF_ARMS = 2;

    public Human(String gender, String foodSource, double height, double weight, String colourOfEyes, String colourofHair) {
        super(gender, false, foodSource);
        this.height = height;
        this.weight = weight;
        this.colourOfEyes = colourOfEyes;
        this.colourofHair = colourofHair;
    }

    public Human(String gender, String foodSource) {
        super(gender, false, foodSource);
        this.height = 2.00;
        this.weight = 90;
        this.colourOfEyes = "Hazel";
        this.colourofHair = "White";
    }

    @Override
    public String toString() {
        return "Human{" +
                "height=" + height +
                ", weight=" + weight +
                ", gender='" + super.getGender() + '\'' +
                ", foodSource='" + super.getFoodSource() + '\'' +
                ", colourOfEyes='" + colourOfEyes + '\'' +
                ", colourofHair='" + colourofHair + '\'' +
                ", NR_OF_LEGS='" + NR_OF_LEGS + '\'' +
                ", NR_OF_ARMS='" + NR_OF_ARMS + '\'' +
                ", NR_OF_EYES='" + super.getNR_OF_EYES() + '\'' +
                ", NR_OF_HEARTS='" + super.getNR_OF_HEARTS() + '\'' +
                '}';
    }

    @Override
    public void sleep() {
        System.out.println("The person is sleeping.");
    }

    public void playsWithBalls() {
        System.out.println("Humans love volleyball.");
    }
}
