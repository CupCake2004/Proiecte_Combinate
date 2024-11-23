package com.example.proiect_java_3;

public class Reportofon extends Gadget {
    private static final long serialVersionUID = 983510295838478535L;
    private int capacitateMemorie; // în GB
    private boolean areReducereZgomot;

    // Constructor cu parametri
    public Reportofon(String model, String brand, int yearOfManufacture, boolean isOn, double price, double rating, int stock, String description, int capacitateMemorie, boolean areReducereZgomot) {
        super(model, brand, yearOfManufacture, isOn, price, rating, stock, description); // Apelăm constructorul clasei părinte
        this.capacitateMemorie = capacitateMemorie;
        this.areReducereZgomot = areReducereZgomot;
    }

    @Override
    public String toString() {
        return super.toString() + " [Memorie=" + capacitateMemorie + " GB, Reducere Zgomot=" + areReducereZgomot + "]";
    }

    // Getters și Setters
    public int getCapacitateMemorie() {
        return capacitateMemorie;
    }

    public void setCapacitateMemorie(int capacitateMemorie) {
        this.capacitateMemorie = capacitateMemorie;
    }

    public boolean isAreReducereZgomot() {
        return areReducereZgomot;
    }

    public void setAreReducereZgomot(boolean areReducereZgomot) {
        this.areReducereZgomot = areReducereZgomot;
    }
}
