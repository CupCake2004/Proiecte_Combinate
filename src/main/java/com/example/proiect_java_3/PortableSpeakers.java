package com.example.proiect_java_3;

public class PortableSpeakers extends Gadget {
    private int batteryLife;
    private boolean waterproof;

    // Constructor fără parametri
    public PortableSpeakers() {
        super();  // Apelează constructorul fără parametri al clasei părinte
        this.batteryLife = 12;  // ore
        this.waterproof = false;
    }

    // Constructor cu parametri
    public PortableSpeakers(String model, String brand, int year , double price, double rating, int quantity, String description, int batteryLife, boolean waterproof) {
        super(model, brand, year
                , price, rating, quantity, description);  // Apelează constructorul cu parametri al clasei părinte
        this.batteryLife = batteryLife;
        this.waterproof = waterproof;
    }

    // Constructor de copiere
    public PortableSpeakers(PortableSpeakers other) {
        super(other);  // Apelează constructorul de copiere al clasei părinte
        this.batteryLife = other.batteryLife;
        this.waterproof = other.waterproof;
    }

    // Gettere și settere pentru câmpuri
    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public boolean isWaterproof() {
        return waterproof;
    }

    public void setWaterproof(boolean waterproof) {
        this.waterproof = waterproof;
    }
    @Override
    public String toString() {
        return "VRGoggles {" +
                "Model='" + getModel() + '\'' +
                ", Brand='" + getBrand() + '\'' +
                ", Year=" + getYearOfManufacture() +
                " =" + isOn() +
                ", Price=" + getPrice() +
                ", Rating=" + getRating() +
                ", Stock=" + getStock() +
                ", Description=" + getDescription() +
                ", BatteryLife=" +  batteryLife +
                ", Waterproof=" + waterproof +
                '}';
    }
}