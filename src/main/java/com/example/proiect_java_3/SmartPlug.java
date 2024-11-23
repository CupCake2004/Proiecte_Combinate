package com.example.proiect_java_3;

public class SmartPlug extends Gadget {
    private static final long serialVersionUID = 7619238194839204832L;
    private int capacitateMaxima; // în wați
    private boolean areMonitorizareConsum;

    // Constructor cu parametri
    public SmartPlug(String model, String brand, int yearOfManufacture, boolean isOn, double price, double rating, int stock, String description, int capacitateMaxima, boolean areMonitorizareConsum) {
        super(model, brand, yearOfManufacture, isOn, price, rating, stock, description); // Apelăm constructorul clasei părinte
        this.capacitateMaxima = capacitateMaxima;
        this.areMonitorizareConsum = areMonitorizareConsum;
    }

    @Override
    public String toString() {
        return super.toString() + " [Capacitate Maxima=" + capacitateMaxima + " W, Monitorizare Consum=" + areMonitorizareConsum + "]";
    }

    // Getters și Setters
    public int getCapacitateMaxima() {
        return capacitateMaxima;
    }

    public void setCapacitateMaxima(int capacitateMaxima) {
        this.capacitateMaxima = capacitateMaxima;
    }

    public boolean isAreMonitorizareConsum() {
        return areMonitorizareConsum;
    }

    public void setAreMonitorizareConsum(boolean areMonitorizareConsum) {
        this.areMonitorizareConsum = areMonitorizareConsum;
    }
}
