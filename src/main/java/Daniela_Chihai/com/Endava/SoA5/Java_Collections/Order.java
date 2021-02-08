package Daniela_Chihai.com.Endava.SoA5.Java_Collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private long id;
    private Date date;
    private User user;
    private List<Item> items;
    private static long nextID = 100000L;
    private static int numbersOfOrdersCreated = 0;

    public Order(User user, List<Item> items) {
        this.id = nextID;
        nextID++;
        this.date = new Date();
        this.user = user;
        this.items = items;
        numbersOfOrdersCreated++;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + date +
                ", user=" + user +
                ", items=" + items +
                '}';
    }

    public List<Item> filterItemsByType(Type filteredType) {
        List<Item> filteredItemByType = new ArrayList<Item>();
        for (Item item : items) { //Item - tip de date/ items - colectia prin care se itereaza. item = 0
            if (item.getType().equals(filteredType)) {
                filteredItemByType.add(item);
            }
        }
        return filteredItemByType;
    }
}
