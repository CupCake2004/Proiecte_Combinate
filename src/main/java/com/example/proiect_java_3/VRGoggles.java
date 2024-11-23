package com.example.proiect_java_3;

public class VRGoggles extends Gadget {
    private static final long serialVersionUID = 6823740192387415872L;
    private int rezolutie; // în pixeli
    private boolean esteCompatibilCuPC;

    // Constructor cu parametri
    public VRGoggles(String model, String brand, int yearOfManufacture, boolean isOn, double price, double rating, int stock, String description, int rezolutie, boolean esteCompatibilCuPC) {
        super(model, brand, yearOfManufacture, isOn, price, rating, stock, description); // Apelăm constructorul clasei părinte
        this.rezolutie = rezolutie;
        this.esteCompatibilCuPC = esteCompatibilCuPC;
    }

    @Override
    public String toString() {
        return super.toString() + " [Rezoluție=" + rezolutie + "p, Compatibil cu PC=" + esteCompatibilCuPC + "]";
    }

    // Getters și Setters
    public int getRezolutie() {
        return rezolutie;
    }

    public void setRezolutie(int rezolutie) {
        this.rezolutie = rezolutie;
    }

    public boolean isEsteCompatibilCuPC() {
        return esteCompatibilCuPC;
    }

    public void setEsteCompatibilCuPC(boolean esteCompatibilCuPC) {
        this.esteCompatibilCuPC = esteCompatibilCuPC;
    }
}
