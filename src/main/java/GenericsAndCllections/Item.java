package GenericsAndCllections;

import java.util.Random;

public class Item implements Comparable<Item> {
    public long itemId;
    public String itemTitle;
    public Type itemType;

    public Item(String itemTitle, Type itemType) {
        Random rand = new Random();
        this.itemId = rand.nextInt(99999);
        this.itemTitle = itemTitle;
        this.itemType = itemType;
    }

    @Override
    public String toString() {
        return "itemTitle='" + itemTitle + '\'' +
                ", itemType=" + itemType + "\n";
    }

    @Override
    public int compareTo(Item comparedItem) {
        return this.itemTitle.toLowerCase().compareTo(comparedItem.itemTitle);
    }
}