package model;

import java.util.stream.Stream;

public class Phone {
    private String producer;
    private String model;
    private int price;

    public Phone(String producer, String model, int price) {
        this.producer = producer;
        this.model = model;
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public static Stream<Phone> getPhones() {
        return Stream.of(new Phone("iPhone", "8", 19849), new Phone("iPhone", "XS Max", 61899),
                new Phone("HTC", "U12", 21990), new Phone("HTC", "Desire 12", 5395),
                new Phone("Huawei", "Nexus 6P", 12280), new Phone("Huawei", "P Smart Plus 4", 7999),
                new Phone("Huawei", "P20 Peo", 24999), new Phone("Samsung ", "Galaxy S9", 16999),
                new Phone("Samsung ", "Galaxy S9+", 27999), new Phone("Samsung ", "Galaxy S8 Plus", 22999),
                new Phone("Samsung ", "Galaxy Note 9", 34999), new Phone("Samsung ", "Galaxy A8", 13999),
                new Phone("LG", "G6", 5999), new Phone("Xiaomi", "Mi6", 9999), new Phone("Xiaomi", "Mi8", 12799),
                new Phone("Xiaomi", "Black Shark", 18999), new Phone("Asus", "Zenfone 2", 4483),
                new Phone("Asus", "Zenfone 5Z", 19999), new Phone("Sony", "Xperia Z5", 7494),
                new Phone("Meizu", "15 Plus 6", 15599), new Phone("Meizu", "Pro 6", 5999),
                new Phone("Meizu", "15 Life", 9199), new Phone("Meizu", "Pro 7", 7199),
                new Phone("Lenovo", "A588t", 3999), new Phone("Lenovo", "S850", 3294), new Phone("iPhone", "7", 15509));
    }

    @Override
    public String toString() {
        return "producer = '" + producer + '\'' +
                ", model = '" + model + '\'' +
                ", price = " + price;
    }
}
