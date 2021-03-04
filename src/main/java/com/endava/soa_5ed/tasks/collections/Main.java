package com.endava.soa_5ed.tasks.collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Item item1 = new Item("OnePlus 8 Pro", Type.PHONE);
        Item item2 = new Item("Big Expectations", Type.BOOK);
        Item item3 = new Item("Nike Air Max 270", Type.SHOES);
        Item item4 = new Item("Apple iPhone 11 Pro Max", Type.PHONE);
        Item item5 = new Item("Black suede jacket", Type.CLOTHES);
        Item item6 = new Item("Apple iPad", Type.GADGET);

        User galeBrown = new User("Gale Brown");
        Address chisinauBucurestiSt = new Address("Moldova", "Chisinau", "Bucuresti st.");
        Address portlandYaleSt = new Address("U.S.A", "Portland", "Yale st.");
        galeBrown.addAddress("Home", chisinauBucurestiSt);
        galeBrown.addAddress("Work", portlandYaleSt);
        Order galeBrownOrder = new Order(galeBrown);


        galeBrownOrder.setItems(Arrays.asList(
                item1, item2, item3, item4)
        );
        User andrewThornton = new User("Andrew Thornton");
        Address portlandWashingtonSt = new Address("U.S.A", "Portland", "Washington st.");
        andrewThornton.addAddress("Home", portlandWashingtonSt);
        andrewThornton.addAddress("Work", portlandYaleSt);
        Order andrewThorntonOrder = new Order(andrewThornton);
        andrewThorntonOrder.setItems(Arrays.asList(
                item5, item6)
        );
        List<Order> ordersList;
        ordersList = Arrays.asList(
                galeBrownOrder,
                andrewThorntonOrder
        );
        List<User> usersList = Arrays.asList(
                galeBrown,
                andrewThornton
        );

        System.out.println(OrderFilter.filterOrdersByItemType(ordersList, Type.CLOTHES));
        System.out.println(UsersFilter.filterUsersByCity(usersList, "Chisinau"));
    }
}
