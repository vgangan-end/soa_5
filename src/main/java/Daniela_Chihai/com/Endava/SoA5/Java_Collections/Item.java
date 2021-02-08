package Daniela_Chihai.com.Endava.SoA5.Java_Collections;

public class Item {
    private long id;
    private String title;
    private Type type;

    public Item(long id, String title, Type type) {
        this.id = id;
        this.title = title;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type=" + type +
                '}';
    }
}
