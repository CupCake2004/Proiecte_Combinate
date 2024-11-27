package com.example.proiect_java_3;

public class Boxe extends Gadget {
    private String type;
    private boolean wireless;

    // Constructor fără parametri
    public Boxe() {
        super();  // Apelează constructorul fără parametri al clasei părinte
        this.type = "Boxe standard";
        this.wireless = false;
    }

    // Constructor cu parametri
    public Boxe(String model, String brand, int year , double price, double rating, int quantity, String description, String type, boolean wireless) {
        super(model, brand, year , price, rating, quantity, description); // Apelează constructorul cu parametri al clasei părinte
        this.type = type;
        this.wireless = wireless;
    }

    // Constructor de copiere
    public Boxe(Boxe other) {
        super(other);  // Apelează constructorul de copiere al clasei părinte
        this.type = other.type;
        this.wireless = other.wireless;
    }

    // Gettere și Settere pentru tip și wireless
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    // Suprascrie metoda toString pentru afišarea detaliilor despre Boxe
    @Override
    public String toString() {
        return "Boxe {" +
                "Model='" + getModel() + '\'' +
                ", Brand='" + getBrand() + '\'' +
                ", Year=" + getYearOfManufacture() +
                ", Price=" + getPrice() +
                ", Rating=" + getRating() +
                ", Stock=" + getStock() +
                ", Description='" + getDescription() + '\'' +
                ", Type=" + type +
                ", Wireless=" + wireless +
                '}';
    }
}