package com.gff.zy;

public class Computer {
    private double price;
    private String color;
    private String typeName;

/*    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", typeName='" + typeName + '\'' +
                '}';
    }*/

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}

