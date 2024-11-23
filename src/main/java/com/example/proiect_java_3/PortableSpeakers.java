package com.example.proiect_java_3;

public class PortableSpeakers extends Gadget {
    private static final long serialVersionUID = 7631423589531487624L;
    private String tipConectare;
    private int putere; // în wați
    private boolean suntRezistenteLaApa;

    // Constructor cu parametri
    public PortableSpeakers(String model, String brand, int yearOfManufacture, boolean isOn, double price, double rating, int stock, String description, String tipConectare, int putere, boolean suntRezistenteLaApa) {
        super(model, brand, yearOfManufacture, isOn, price, rating, stock, description); // Apelăm constructorul clasei părinte
        this.tipConectare = tipConectare;
        this.putere = putere;
        this.suntRezistenteLaApa = suntRezistenteLaApa;
    }

    @Override
    public String toString() {
        return super.toString() + " [Tip Conectare=" + tipConectare + ", Putere=" + putere + " W, Rezistente la Apă=" + suntRezistenteLaApa + "]";
    }

    // Getters și Setters
    public String getTipConectare() {
        return tipConectare;
    }

    public void setTipConectare(String tipConectare) {
        this.tipConectare = tipConectare;
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
}
