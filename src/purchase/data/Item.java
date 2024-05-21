package purchase.data;

import java.util.Objects;

public class Item {
    private String name;
    private int quantity;
    private int price;

    public Item(String name, int quantity, int price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public int getTotalPrice() {
        return quantity * price;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public void updatePrice(int price) {
        this.price = price;
    }

}

