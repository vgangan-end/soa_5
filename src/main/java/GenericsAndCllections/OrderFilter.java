package GenericsAndCllections;

import java.util.ArrayList;
import java.util.List;

public class OrderFilter {
    public static List<Order> orderFilteredByItemType(Type type, List<Order> orderList) {
        List<Order> filteredItemByType = new ArrayList<>();
        for (Order order : orderList) {
            List<Item> itemsList = order.filterItemsByType(type);
            if (!itemsList.isEmpty()) {
                filteredItemByType.add(order);
            }
        }
        return filteredItemByType;
    }

}
