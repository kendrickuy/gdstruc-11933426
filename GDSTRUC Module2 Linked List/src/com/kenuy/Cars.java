package com.kenuy;

public class Cars {
    private int Price;
    private String Make;
    private int Model;

    public Cars(int price, String make, int model) {
        Price = price;
        Make = make;
        Model = model;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public int getModel() {
        return Model;
    }

    public void setModel(int model) {
        Model = model;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "Price=" + Price +
                ", Make='" + Make + '\'' +
                ", Model=" + Model +
                '}';
    }
}
