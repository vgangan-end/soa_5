package Daniela_Chihai.com.Endava.SoA5.Java_OOP;

public class Main {
    public static void main(String[] args) {
        Feline pantera = new Feline("F", true, "pantera", "sharp");
        Feline tigru = new Feline("M", true, "Tiger", "sharp round");
        Feline jaguar = new Feline("M", true, "Jaguar", "sharp");
        Feline leu = new Feline("M", true, "Lion", "round");
        Feline ras = new Feline("F", true, "Lynx", "sharp");

        Human olav = new Human("M", "Vegan", 1.90, 82, "Blue", "Blonde");
        System.out.println(olav.getFoodSource());
        Human steve = new Human("M", "Raw Vegan");
        System.out.println(steve.toString());

        System.out.println("\n #################################### \n");

        System.out.println(pantera);
        System.out.println(tigru);
        System.out.println(jaguar);
        System.out.println(leu);
        System.out.println(ras);

        System.out.println("\n #################################### \n");
        Cat murzik = new Cat("M", "Petite Cat", "Round");
        System.out.println(murzik);
        System.out.println(murzik.getNR_OF_EYES());
        System.out.println(murzik.getNR_OF_HEARTS());

        System.out.println("\n #################################### \n");
        System.out.println("PRESENCE OF FUR ON ANIMALS");
        pantera.setHasFur(true);
        tigru.setHasFur(false);

        System.out.println("\n #################################### \n");

        System.out.println("INVALID GENDER");
        jaguar.setGender("L");

        System.out.println("VALID GENDER CHECK");
        olav.setGender("M");
        System.out.println(olav.getGender());

        murzik.drinkWater();
        olav.sleep();
        tigru.eat();
        murzik.setFoodSource("");
        murzik.playsWithBalls();
        steve.playsWithBalls();
    }
}
