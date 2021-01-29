package GenericsAndCllections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order {
    public long orderId;
    private LocalDate date;
    public User user;
    public List<Item> items;
    private Address shippingAddress;

    public Order(User user) {
        Random rand = new Random();
        this.orderId = rand.nextInt(9999);
        this.user = user;
        this.date = LocalDate.now();
        items = new ArrayList<>();
    }

    public Order(List<User> listOfUsers) {
        Random rand = new Random();
        this.orderId = rand.nextInt(9999);
        this.date = LocalDate.now();
        items = new ArrayList<>();
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Item> filterItemsByType(Type type) {
        List<Item> filteredItem = new ArrayList<>();
        for (Item item : this.items) {
            if (type.equals(item.itemType)) {
                filteredItem.add(item);
            }
        }
        return filteredItem;
    }

    public String itemsToString() {
        String itemsDetails = "";
        for (Item item : items) {
            itemsDetails += "Item Title: " + item.itemTitle + ", type: " + item.itemType + "\n";
        }
        return itemsDetails;
    }

    @Override
    public String toString() {
        return user.username + "'s order:\n" +
                "orderId=" + orderId + ", date=" + date +
                "\n items: \n" + itemsToString() +
                "\nShipping Address: " + shippingAddress + "\n\n";
    }

    public User getUser() {
        return this.user;
    }
}
