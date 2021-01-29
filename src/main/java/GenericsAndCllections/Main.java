package GenericsAndCllections;

import java.util.*;

import static GenericsAndCllections.OrderFilter.orderFilteredByItemType;

public class Main {
    public static void main(String[] args) {
        Map<String, Address> userAddress = new HashMap<>();
        userAddress.put("Home", new Address("Moldova", "Chisinau", "Ciocana 10"));
        userAddress.put("Work", new Address("Roamnia", "Bucuresti", "Stefan cel Mare 124"));

        User user1 = new User("Ionica", userAddress);
        user1.addAddress("FriendAddress", new Address("Germany", "Berlin", "Central Street 32"));

        User user2 = new User("Vasilica");
        user2.addAddress("Home", new Address("Germany", "Orhei", "Street 104"));
        user2.addAddress("Work", new Address("Poland", "Soroca", "Albisoara 65"));

        User user3 = new User("Petrica");
        user3.addAddress("Home", new Address("Romania", "Iasi", "Palas street 98/7"));

        Item shoes = new Item("ghete", Type.CLOTHES);
        Item tShort = new Item("maiou", Type.CLOTHES);
        Item phone = new Item("iPhone", Type.SMARTPHONE);
        Item phoneCase = new Item("husa", Type.ACCESSORIES);
        Item uglyToy = new Item("toy", Type.TOY);
        Item pants = new Item("blugi", Type.CLOTHES);
        Item watch = new Item("appleWatch", Type.GADGET);

        List<Item> allItems = new ArrayList<>();
        Collections.addAll(allItems, shoes, tShort, pants, phone, phoneCase, uglyToy, watch);

        Order order1 = new Order(user1);
        order1.setShippingAddress(order1.getUser().getAddress("FriendAddress"));
        Collections.addAll(order1.items, phoneCase, shoes);
        System.out.println(order1.toString());

        Order order2 = new Order(user2);
        order2.setShippingAddress(order2.getUser().getAddress("Work"));
        Collections.addAll(order2.items, phone, uglyToy);
        System.out.println(order2.toString());

        Order order3 = new Order(user2);
        order3.setShippingAddress(order3.getUser().getAddress("Home"));
        Collections.addAll(order3.items, shoes, phone, phone, uglyToy);
        System.out.println(order3.toString());

        Order order4 = new Order(user3);
        order4.setShippingAddress(order4.getUser().getAddress("Home"));
        Collections.addAll(order4.items, watch, uglyToy);
        System.out.println(order4.toString());

        System.out.println("Default list size: " + allItems.size());
        System.out.println("Get item from index 4: " + allItems.get(4));
        allItems.remove(4);

        List<Item> newCopiedList = new ArrayList<>();
        Collections.addAll(newCopiedList, shoes, shoes, shoes, shoes, shoes, shoes);
        Collections.copy(newCopiedList, allItems);
        System.out.println("Copied List size: " + newCopiedList.size() + "\nThis is a copied list: \n" + newCopiedList);

        System.out.println("List size after removing an element: " + allItems.size());
        System.out.println("Get item from index 3: " + allItems.get(3));
        allItems.add(watch);
        System.out.println("List size after adding back removed element: " + allItems.size());
        System.out.println("Get item from index 4: " + allItems.get(4));

        Collections.sort(allItems);
        System.out.println("********************* Sorted Items by Title *********************\n");
        System.out.println(allItems);

        List<User> users = new ArrayList<>();
        Collections.addAll(users, user1, user2, user3);

        Order listOfOrders = new Order(users);
        listOfOrders.setItems(allItems);
        List<Item> tempList = listOfOrders.filterItemsByType(Type.CLOTHES);
        System.out.println("********************* Get only Items by Type CLOTHES *********************\n");
        System.out.println(tempList);

        List<Order> orders = new ArrayList<>();
        Collections.addAll(orders, order1, order2, order3, order4);

        System.out.println("********************* Filtered Items by Type CLOTHES *********************\n");
        System.out.println(orderFilteredByItemType(Type.CLOTHES, orders));

        System.out.println("\n********************* Filtered Items by Type SMARTPHONE *********************\n");
        System.out.println(orderFilteredByItemType(Type.SMARTPHONE, orders));
    }
}