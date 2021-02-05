package Daniela_Chihai.com.Endava.SoA5.Java_OOP;

public class Cat extends Feline implements Play{
    private String name;
    private int age;

    public Cat(String gender, boolean hasFur, String felineSpecies, String earsShape, String name, int age) {
        super(gender, hasFur, felineSpecies, earsShape);
        this.name = name;
        this.age = age;
    }

    public Cat(String gender, String felineSpecies, String earsShape) {
        super(gender, true, felineSpecies, earsShape);
        this.name = "Murzik";
        this.age = 5;
    }

    @Override
    public void drinkWater() {
        System.out.println("Our cats are drinking water.");
    }

    @Override
    public void setFoodSource(String foodSource) {
        if (foodSource.isEmpty()) {
            System.out.println(" The cat is hungry!");
        } else {
            System.out.println("The cat is full!");
        }
        super.setFoodSource(foodSource);
    }

    public void playsWithBalls() {
        System.out.println("Cats make a mess in the house.");
    }
}
