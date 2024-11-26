package com.example.proiect_java_3;

public class MiniCamera extends Gadget {
    private String connectionType;
    private int batteryCapacity;
    private boolean motionDetection;

    // Constructor fără parametri
    public MiniCamera() {
        super();  // Apelează constructorul fără parametri al clasei părinte
        this.connectionType = "Wi-Fi";
        this.batteryCapacity = 3000;  // mAh
        this.motionDetection = false;
    }

    // Constructor cu parametri
    public MiniCamera(String model, String brand, int year , double price, double rating, int quantity, String description, String connectionType, int batteryCapacity, boolean motionDetection) {
        super(model, brand, year , price, rating, quantity, description);  // Apelează constructorul cu parametri al clasei părinte
        this.connectionType = connectionType;
        this.batteryCapacity = batteryCapacity;
        this.motionDetection = motionDetection;
    }

    // Constructor de copiere
    public MiniCamera(MiniCamera other) {
        super(other);  // Apelează constructorul de copiere al clasei părinte
        this.connectionType = other.connectionType;
        this.batteryCapacity = other.batteryCapacity;
        this.motionDetection = other.motionDetection;
    }

    // Gettere și settere pentru câmpuri
    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public boolean isMotionDetection() {
        return motionDetection;
    }

    public void setMotionDetection(boolean motionDetection) {
        this.motionDetection = motionDetection;
    }
}