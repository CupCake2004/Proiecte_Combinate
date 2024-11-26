package com.example.proiect_java_3;

public class SmartAlarm extends Gadget {
    private boolean smartSensors;
    private int batteryBackup;

    // Constructor fără parametri
    public SmartAlarm() {
        super();  // Apelează constructorul fără parametri al clasei părinte
        this.smartSensors = false;
        this.batteryBackup = 24;  // ore
    }

    // Constructor cu parametri
    public SmartAlarm(String model, String brand, int year , double price, double rating, int quantity, String description, boolean smartSensors, int batteryBackup) {
        super(model, brand, year , price, rating, quantity, description);  // Apelează constructorul cu parametri al clasei părinte
        this.smartSensors = smartSensors;
        this.batteryBackup = batteryBackup;
    }

    // Constructor de copiere
    public SmartAlarm(SmartAlarm other) {
        super(other);  // Apelează constructorul de copiere al clasei părinte
        this.smartSensors = other.smartSensors;
        this.batteryBackup = other.batteryBackup;
    }

    // Gettere și settere pentru câmpuri
    public boolean isSmartSensors() {
        return smartSensors;
    }

    public void setSmartSensors(boolean smartSensors) {
        this.smartSensors = smartSensors;
    }

    public int getBatteryBackup() {
        return batteryBackup;
    }

    public void setBatteryBackup(int batteryBackup) {
        this.batteryBackup = batteryBackup;
    }
}