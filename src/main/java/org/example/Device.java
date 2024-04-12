package org.example;

public class Device {
    private String name;
    private int year;
    private int price;
    private String color;
    private String type;

    public Device(String name, int year, int price, String color, String type) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.color = color;
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
