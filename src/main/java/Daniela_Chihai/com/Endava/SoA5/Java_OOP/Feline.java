package Daniela_Chihai.com.Endava.SoA5.Java_OOP;

public class Feline extends Mammal {
    private String felineSpecies;
    private String earsShape;

    public Feline(String gender, boolean hasFur, String felineSpecies, String earsShape) {
        super(gender, hasFur, "Carnivore");
        this.felineSpecies = felineSpecies;
        this.earsShape = earsShape;
    }

    public String getFelineSpecies() {
        return felineSpecies;
    }

    public String getEarsShape() {
        return earsShape;
    }

    public void setFelineSpecies(String felineSpecies) {
        this.felineSpecies = felineSpecies;
    }

    public void setEarsShape(String earsShape) {
        this.earsShape = earsShape;
    }

    @Override
    public String toString() {
        return "Feline{" +
                "felineSpecies='" + felineSpecies + '\'' +
                ", earsShape='" + earsShape + '\'' +
                ", gender='" + super.getGender() + '\'' +
                ", hasFur='" + super.getHasFur() + '\'' +
                ", foodSource='" + super.getFoodSource() + '\'' +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("Felines love meat.");
    }
}
