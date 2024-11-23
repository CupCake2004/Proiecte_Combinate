package com.example.proiect_java_3;

public class Boxe extends Gadget {
    private String tipConectare;
    private boolean areMicrofon;
    private int putere;
    private boolean suntRezistenteLaApa;
    private boolean suntWireless;

    // Constructor cu parametri
    public Boxe(String model, String brand, int yearOfManufacture, boolean isOn, double price, double rating, int stock, String description, String tipConectare, boolean areMicrofon, int putere, boolean suntRezistenteLaApa, boolean suntWireless) {
        super(model, brand, yearOfManufacture, isOn, price, rating, stock, description); // Apelăm constructorul clasei părinte
        this.tipConectare = tipConectare;
        this.areMicrofon = areMicrofon;
        this.putere = putere;
        this.suntRezistenteLaApa = suntRezistenteLaApa;
        this.suntWireless = suntWireless;
    }

    @Override
    public String toString() {
        return super.toString() + " [Tip Conectare=" + tipConectare + ", Are Microfon=" + areMicrofon + ", Putere=" + putere + ", Rezistente la Apa=" + suntRezistenteLaApa + ", Wireless=" + suntWireless + "]";
    }

    // Getters și Setters
    public String getTipConectare() {
        return tipConectare;
    }

    public void setTipConectare(String tipConectare) {
        this.tipConectare = tipConectare;
    }

    public boolean isAreMicrofon() {
        return areMicrofon;
    }

    public void setAreMicrofon(boolean areMicrofon) {
        this.areMicrofon = areMicrofon;
    }

    public int getPutere() {
        return putere;
    }

    public void setPutere(int putere) {
        this.putere = putere;
    }

    public boolean isSuntRezistenteLaApa() {
        return suntRezistenteLaApa;
    }

    public void setSuntRezistenteLaApa(boolean suntRezistenteLaApa) {
        this.suntRezistenteLaApa = suntRezistenteLaApa;
    }

    public boolean isSuntWireless() {
        return suntWireless;
    }

    public void setSuntWireless(boolean suntWireless) {
        this.suntWireless = suntWireless;
    }
}
