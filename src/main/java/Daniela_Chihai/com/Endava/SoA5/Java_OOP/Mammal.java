package Daniela_Chihai.com.Endava.SoA5.Java_OOP;

public abstract class Mammal {
    private final int NR_OF_EYES = 2;
    private final int NR_OF_HEARTS = 1;
    private String gender;
    private boolean hasFur;
    private String foodSource;

    public Mammal(String gender, boolean hasFur, String foodSource) {
        this.gender = gender;
        this.hasFur = hasFur;
        this.foodSource = foodSource;
    }

    public int getNR_OF_EYES() {
        return NR_OF_EYES;
    }

    public int getNR_OF_HEARTS() {
        return NR_OF_HEARTS;
    }

    public String getGender() {
        return gender;
    }

    public boolean getHasFur() {
        return hasFur;
    }

    public String getFoodSource() {
        return foodSource;
    }

    public void setGender(String gender) {
        if (gender.equals("M") || gender.equals("F")) {
            this.gender = gender;
        } else {
            System.out.println(gender + " is not a valid gender, please choose between F or M");
        }
    }

    public void setHasFur(boolean hasFur) {
        if ((hasFur)) {
            System.out.println("This Animal has fur.");
        } else {
            System.out.println("This is not a fury animal.");
        }
        this.hasFur = hasFur;
    }

    public void setFoodSource(String foodSource) {
        this.foodSource = foodSource;
    }

    public void drinkWater() {
        System.out.println("The animal is drinking some water.");
    }

    public void eat() {
        System.out.println("The animal is eating.");
    }

    public void sleep() {
        System.out.println("The animal is sleeping.");
    }
}
