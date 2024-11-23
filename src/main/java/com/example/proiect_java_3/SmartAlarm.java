package com.example.proiect_java_3;

public class SmartAlarm extends Gadget {
    private static final long serialVersionUID = 3894923120413839387L;
    private boolean esteCompatibilCuAplicatia;
    private int durataBaterie; // în ore

    // Constructor cu parametri
    public SmartAlarm(String model, String brand, int yearOfManufacture, boolean isOn, double price, double rating, int stock, String description, boolean esteCompatibilCuAplicatia, int durataBaterie) {
        super(model, brand, yearOfManufacture, isOn, price, rating, stock, description); // Apelăm constructorul clasei părinte
        this.esteCompatibilCuAplicatia = esteCompatibilCuAplicatia;
        this.durataBaterie = durataBaterie;
    }

    @Override
    public String toString() {
        return super.toString() + " [Compatibil cu Aplicatia=" + esteCompatibilCuAplicatia + ", Durata Baterie=" + durataBaterie + " ore]";
    }

    // Getters și Setters
    public boolean isEsteCompatibilCuAplicatia() {
        return esteCompatibilCuAplicatia;
    }

    public void setEsteCompatibilCuAplicatia(boolean esteCompatibilCuAplicatia) {
        this.esteCompatibilCuAplicatia = esteCompatibilCuAplicatia;
    }

    public int getDurataBaterie() {
        return durataBaterie;
    }

    public void setDurataBaterie(int durataBaterie) {
        this.durataBaterie = durataBaterie;
    }
}
