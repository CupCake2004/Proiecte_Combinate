package com.example.proiect_java_3;

public class Casti extends Gadget {
    private static final long serialVersionUID = 2L;
    private String tipConectare;
    private boolean suntNoiseCancelling;
    private boolean suntWireless;

    // Constructor cu parametri
    public Casti(String model, String brand, int yearOfManufacture, boolean isOn, double price, double rating, int stock, String description, String tipConectare, boolean suntNoiseCancelling, boolean suntWireless) {
        super(model, brand, yearOfManufacture, isOn, price, rating, stock, description); // Apelăm constructorul clasei părinte
        this.tipConectare = tipConectare;
        this.suntNoiseCancelling = suntNoiseCancelling;
        this.suntWireless = suntWireless;
    }

    @Override
    public String toString() {
        return super.toString() + " [Tip Conectare=" + tipConectare + ", Noise Cancelling=" + suntNoiseCancelling + ", Wireless=" + suntWireless + "]";
    }

    // Getters și Setters
    public String getTipConectare() {
        return tipConectare;
    }

    public void setTipConectare(String tipConectare) {
        this.tipConectare = tipConectare;
    }

    public boolean isSuntNoiseCancelling() {
        return suntNoiseCancelling;
    }

    public void setSuntNoiseCancelling(boolean suntNoiseCancelling) {
        this.suntNoiseCancelling = suntNoiseCancelling;
    }

    public boolean isSuntWireless() {
        return suntWireless;
    }

    public void setSuntWireless(boolean suntWireless) {
        this.suntWireless = suntWireless;
    }
}
