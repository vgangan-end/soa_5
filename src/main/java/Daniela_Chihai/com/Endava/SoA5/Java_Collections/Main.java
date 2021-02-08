package Daniela_Chihai.com.Endava.SoA5.Java_Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // ITEMS CREATED
        Item itemNrOne = new Item(3000L, "Azura Dress", Type.CLOTHES);//call enum Enum.Value
        Item itemNrTwo = new Item(3000L, "Swimsuit", Type.CLOTHES);
        Item itemNrThree = new Item(3000L, "Leather Jacket", Type.CLOTHES);
        Item itemNrFour = new Item(3000L, "Fur Coat", Type.CLOTHES);
        Item itemNrFive = new Item(3000L, "VR Station", Type.GADGETS);
        Item itemNrSix = new Item(3000L, "Kindle 10th Generation", Type.GADGETS);
        Item itemNrSeven = new Item(4000L, "LEGO", Type.TOYS);
        Item itemNrEight = new Item(4000L, "JENGA", Type.TOYS);

        // LIST OF ITEMS CREATED
        // ----------LIST OF ITEMS BOUGHT FOR ONE USER
        List<Item> firstItemList = new ArrayList<Item>();
        firstItemList.addAll(Arrays.asList(itemNrEight, itemNrOne, itemNrSix));
        System.out.println(firstItemList);

        // ----------LIST OF ITEMS BOUGHT FOR SECOND USER
        List<Item> secondItemList = new ArrayList<Item>();
        secondItemList.addAll(Arrays.asList(itemNrFive));
        System.out.println(secondItemList);

        // ----------LIST OF ITEMS BOUGHT FOR A THIRD USER
        List<Item> thirdItemList = new ArrayList<Item>();
        thirdItemList.addAll(Arrays.asList(itemNrThree, itemNrFive));
        System.out.println(thirdItemList);

        // ----------LIST OF ITEMS BOUGHT FOR A FOURTH USER
        List<Item> fourthItemList = new ArrayList<Item>();
        fourthItemList.addAll(Arrays.asList(itemNrOne, itemNrSix, itemNrTwo));
        System.out.println(fourthItemList);

        // ----------LIST OF ITEMS BOUGHT FOR A FIFTH USER
        List<Item> fifthItemList = new ArrayList<Item>();
        fifthItemList.addAll(Arrays.asList(itemNrFour));
        System.out.println(fifthItemList);

        // ATTACH ADDRESS FOR A USER. USER CREATED
        //-----------USER1
        Map userOneAddress = new HashMap<String, Address>(); //tip de date pentru Keys si valorile care le va primi la crearea adresei din clasa care ne trebuie
        userOneAddress.put("HOME ADDRESS", new Address("MD", "Chisinau", "Rozelor 5A"));
        User userNrOne = new User(11111L, "user1", userOneAddress);

        //-----------USER2
        Map userTwoAddress = new HashMap<String, Address>();
        userTwoAddress.put("WORK ADDRESS", new Address("RO", "Timisoara", "Operei 4"));
        User userNrTwo = new User(11112L, "user2", userTwoAddress);

        //-----------USER3
        Map userThreeAddress = new HashMap<String, Address>();
        userThreeAddress.put("TEMPORARY ADDRESS", new Address("NL", "Arnhem", "Velperweg 41"));
        User userNrThree = new User(11113L, "user3", userThreeAddress);

        // ORDERS
        Order orderNrOne = new Order(userNrTwo, fifthItemList);
        System.out.println(orderNrOne);
        Order orderNrTwo = new Order(userNrThree, fourthItemList);
        System.out.println(orderNrTwo);

        System.out.println(orderNrTwo.filterItemsByType(Type.CLOTHES));

        List<User> listOfUsers = Arrays.asList(userNrOne,userNrOne, userNrThree,userNrTwo);
        System.out.println(userNrOne.filterUserByCity(listOfUsers, "Chisinau"));
    }
}
