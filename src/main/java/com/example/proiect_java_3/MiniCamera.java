package com.example.proiect_java_3;

public class MiniCamera extends Gadget {
    private String tipObiectiv;
    private int capacitateBaterie; // în mAh
    private boolean areWiFi;

    // Constructor cu parametri
    public MiniCamera(String model, String brand, int yearOfManufacture, boolean isOn, double price, double rating, int stock, String description, String tipObiectiv, int capacitateBaterie, boolean areWiFi) {
        super(model, brand, yearOfManufacture, isOn, price, rating, stock, description); // Apelăm constructorul clasei părinte
        this.tipObiectiv = tipObiectiv;
        this.capacitateBaterie = capacitateBaterie;
        this.areWiFi = areWiFi;
    }

    @Override
    public String toString() {
        return super.toString() + " [Tip Obiectiv=" + tipObiectiv + ", Capacitate Baterie=" + capacitateBaterie + " mAh, WiFi=" + areWiFi + "]";
    }

    // Getters și Setters
    public String getTipObiectiv() {
        return tipObiectiv;
    }

    public void setTipObiectiv(String tipObiectiv) {
        this.tipObiectiv = tipObiectiv;
    }

    public int getCapacitateBaterie() {
        return capacitateBaterie;
    }

    public void setCapacitateBaterie(int capacitateBaterie) {
        this.capacitateBaterie = capacitateBaterie;
    }

    public boolean isAreWiFi() {
        return areWiFi;
    }

    public void setAreWiFi(boolean areWiFi) {
        this.areWiFi = areWiFi;
    }
}
