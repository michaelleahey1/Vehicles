package com.example.demo;

public class Car {
    //objects

    private String model;
    private String make;
    private double price;
    private int year;
    private String color;

    //constructors

    public Car(String model, String make, double price, int year, String color) {
        this.model = model;
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
    }


    // getters/setters


    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    /*
    this was not needed for this project, but overriding the toString method will be handy in the future.
    This method is overridden so that the object values can be returned.
    @Override
    public String toString() {
      return "Car{" +
            "model='" + model + '\'' +
            ", make='" + make + '\'' +
            ", price=" + price +
            ", year=" + year +
            ", color='" + color + '\'' +
            '}';
    }
    */
}
