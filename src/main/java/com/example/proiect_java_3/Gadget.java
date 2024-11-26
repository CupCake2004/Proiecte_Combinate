package com.example.proiect_java_3;

import java.io.Serializable;

public class Gadget implements Serializable {
    private static final long serialVersionUID = 1L;
    private static int nextId = 1; // Variabilă statică pentru ID generat automat

    private int id; // ID unic generat pentru fiecare gadget
    private String model;
    private String brand;
    private int yearOfManufacture;
    private boolean isOn;
    private double price;
    private double rating; // Rating între 1 și 5
    private int stock; // Stoc disponibil
    private String description; // Descrierea gadgetului

    // Constructor fără parametri
    public Gadget() {
        this.id = nextId++;
        this.model = "Unknown";
        this.brand = "Unknown";
        this.yearOfManufacture = 0;
        this.isOn = false;
        this.price = 0.0;
        this.rating = 0.0; // Rating implicit 0
        this.stock = 0; // Stoc implicit 0
        this.description = "No description available"; // Descriere implicită
    }

    // Constructor cu parametri
    public Gadget(String model, String brand, int yearOfManufacture, double price, double rating, int stock, String description) {
        this.id = nextId++;
        this.model = model;
        this.brand = brand;
        this.yearOfManufacture = yearOfManufacture;
        this.isOn = isOn;
        this.price = price;
        this.rating = rating;
        this.stock = stock;
        this.description = description;
    }

    // Constructor de copiere
    public Gadget(Gadget other) {
        this.id = other.id;
        this.model = other.model;
        this.brand = other.brand;
        this.yearOfManufacture = other.yearOfManufacture;
        this.isOn = other.isOn;
        this.price = other.price;
        this.rating = other.rating;
        this.stock = other.stock;
        this.description = other.description;
    }

    // Metoda toString
    @Override
    public String toString() {
        return "Gadget [ID=" + id + ", Model=" + model + ", Brand=" + brand + ", Year=" + yearOfManufacture +
                ", Is On=" + isOn + ", Price=" + price + ", Rating=" + rating + ", Stock=" + stock +
                ", Description=" + description + "]";
    }

    // Getters și Setters
    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating >= 1 && rating <= 5) {
            this.rating = rating;
        } else {
            throw new IllegalArgumentException("Rating-ul trebuie să fie între 1 și 5.");
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
