package warehouse.model;

import java.util.Objects;

public class Item {
    private final int number;
    private final String name;
    private final String unit;
    private int quantity;
    private final int price;
    private final int sum;

    public Item(int number, String name, String unit, int quantity, int price) {
        this.number = number;
        this.name = name;
        this.unit = unit;
        this.quantity = quantity;
        this.price = price;
        this.sum = price * quantity;
    }

    public void renewItem(int quantity) {
        this.quantity += quantity;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return price == item.price && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name, unit, quantity, price, sum);
    }

    @Override
    public String toString() {
        return "Item{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", unit='" + unit + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", sum=" + sum +
                '}';
    }
}
