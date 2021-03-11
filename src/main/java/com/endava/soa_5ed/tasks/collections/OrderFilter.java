package com.endava.soa_5ed.tasks.collections;

import java.util.ArrayList;
import java.util.List;

public class OrderFilter {

    private OrderFilter() {
    }

    public static List<Order> filterOrdersByItemType(List<Order> orderList, Type type) {
        List<Order> filteredOrderList = new ArrayList<>();
        for (Order order : orderList) {
            List<Item> filteredItemList = filterItemsByType(order.getItems(), type);
            if (!filteredItemList.isEmpty()) {
                filteredOrderList.add(order);
            }
        }
        return filteredOrderList;
    }

    protected static List<Item> filterItemsByType(List<Item> itemList, Type type) {
        List<Item> filteredItems = new ArrayList<>();
        for (Item item : itemList) {
            if (item.getType().equals(type)) {
                filteredItems.add(item);
            }
        }
        return filteredItems;
    }
}
