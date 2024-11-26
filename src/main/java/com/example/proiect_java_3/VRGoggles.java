package com.example.proiect_java_3;

public class VRGoggles extends Gadget {
    private int fieldOfView; // Câmp vizual, în grade
    private boolean wireless; // Dacă sunt wireless sau nu

    // Constructor fără parametri
    public VRGoggles() {
        super(); // Apelează constructorul fără parametri al clasei părinte
        this.fieldOfView = 110; // Valoare implicită pentru câmpul vizual
        this.wireless = true; // Valoare implicită pentru wireless
    }

    // Constructor cu parametri
    public VRGoggles(String model, String brand, int year , double price, double rating, int quantity, String description, int fieldOfView, boolean wireless) {
        super(model, brand, year , price, rating, quantity, description); // Apelează constructorul cu parametri al clasei părinte
        this.fieldOfView = fieldOfView;
        this.wireless = wireless;
    }

    // Constructor de copiere
    public VRGoggles(VRGoggles other) {
        super(other); // Apelează constructorul de copiere al clasei părinte
        this.fieldOfView = other.fieldOfView;
        this.wireless = other.wireless;
    }

    // Gettere și settere pentru câmpuri
    public int getFieldOfView() {
        return fieldOfView;
    }

    public void setFieldOfView(int fieldOfView) {
        this.fieldOfView = fieldOfView;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    // Suprascriem metoda toString pentru afișarea detaliilor despre VRGoggles
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
                ", Description='" + getDescription() + '\'' +
                ", FieldOfView=" + fieldOfView +
                ", Wireless=" + wireless +
                '}';
    }
}