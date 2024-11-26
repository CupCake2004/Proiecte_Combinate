package com.example.proiect_java_3;

public class SmartPlug extends Gadget {
    private int wattage;
    private boolean energyMonitoring;

    // Constructor fără parametri
    public SmartPlug() {
        super();  // Apelează constructorul fără parametri al clasei părinte
        this.wattage = 100;  // W
        this.energyMonitoring = false;
    }

    // Constructor cu parametri
    public SmartPlug(String model, String brand, int year , double price, double rating, int quantity, String description, int wattage, boolean energyMonitoring) {
        super(model, brand, year , price, rating, quantity, description);  // Apelează constructorul cu parametri al clasei părinte
        this.wattage = wattage;
        this.energyMonitoring = energyMonitoring;
    }

    // Constructor de copiere
    public SmartPlug(SmartPlug other) {
        super(other);  // Apelează constructorul de copiere al clasei părinte
        this.wattage = other.wattage;
        this.energyMonitoring = other.energyMonitoring;
    }

    // Gettere și settere pentru câmpuri
    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public boolean isEnergyMonitoring() {
        return energyMonitoring;
    }

    public void setEnergyMonitoring(boolean energyMonitoring) {
        this.energyMonitoring = energyMonitoring;
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
                ", Wattage=" + wattage +
                ", EnergyMonitoring=" + energyMonitoring +
                '}';
    }
}