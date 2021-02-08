package com.endava.soa_5.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Samsung", Type.PHONE);
        Item item2 = new Item("Barbie", Type.TOY);
        Item item3 = new Item("Monitor", Type.GADGET);
        Item item4 = new Item("Nike", Type.HAT);
        Item item5 = new Item("Siemens", Type.PHONE);
        Item item6 = new Item("iphone", Type.PHONE);
        Item item7 = new Item("Nokiq", Type.TOY);
        Item item8 = new Item("Hitachi", Type.PHONE);
        Item item9 = new Item("sony", Type.PHONE);
        Item item10 = new Item("Scanner", Type.GADGET);
        Item item11 = new Item("Adidu", Type.HAT);
        Address address1 = new Address("Moldova", "Chisinau", "Zimbrului");
        Address address2 = new Address("Romania", "Iasi", "Cucului");
        Address address3 = new Address("Ukraina", "Odessa", "Kohana");
        Address address4 = new Address("Romania", "Chisinau", "CHISIOR");
        Address address5 = new Address("Ukraina", "Odessa", "poltava");
        Address address6 = new Address("Molovata", "Chisinau", "poltava");

        User user1 = new User("Mihail");
        User user2 = new User("Petea");
        User user3 = new User("Marcel");

        user1.setAddresses("home", address1);
        user2.setAddresses("home", address2);
        user2.setAddresses("work", address3);
        user3.setAddresses("work", address4);
        user3.setAddresses("home", address5);
        user3.setAddresses("job", address6);


        Order order1 = new Order(user1);
        Order order2 = new Order(user1);
        Order order3 = new Order(user1);
        Order order4 = new Order(user1);
        Order order5 = new Order(user3);
        Order order6 = new Order(user1);
        Order order7 = new Order(user2);
        Order order8 = new Order(user2);
        Order order9 = new Order(user3);
        Order order10 = new Order(user3);
        Order order11 = new Order(user2);
        Order order12 = new Order(user3);

        order1.addItem(item1);
        order1.addItem(item4);
        order2.addItem(item5);
        order3.addItem(item6);
        order4.addItem(item2);
        order5.addItem(item3);
        order6.addItem(item4);
        order7.addItem(item7);
        order7.addItem(item11);
        order9.addItem(item8);
        order10.addItem(item9);
        order11.addItem(item10);
        order12.addItem(item11);

        List<Order> orders = new ArrayList<>();
        orders.addAll(Arrays.asList(order1, order2, order3, order4, order5, order6));
        orders.addAll(Arrays.asList(order7, order8, order9, order10, order11, order12));
        System.out.println(filterItemsByType(orders, Type.TOY));

        List<User> users = new ArrayList<>();
        users.addAll(Arrays.asList(user1, user2, user3));
        System.out.println(filteringUsersByCity(users, "Chisinau"));
    }

    public static List<User> filteringUsersByCity(List<User> users, String city) {
        List<User> filteredUserList = new ArrayList<>();

        for (User user : users) {
            if (user.isUserFrom(city)) {
                filteredUserList.add(user);
            }
        }
        return filteredUserList;
    }

    public static List<Order> filterItemsByType(List<Order> orders, Type type) {
        List<Order> filteredOrderList = new ArrayList<>();

        for (Order order : orders) {
            if (order.isOrderType(type)) {
                filteredOrderList.add(order);
            }
        }
        return filteredOrderList;
    }
}
