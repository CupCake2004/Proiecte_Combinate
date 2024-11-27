package com.example.proiect_java_3;

public class Casti extends Gadget {
    private boolean noiseCancelling; // Anulează zgomotul de fundal
    private boolean wireless; // Dacă sunt wireless sau nu

    // Constructor fără parametri
    public Casti() {
        super(); // Apelează constructorul fără parametri al clasei părinte
        this.noiseCancelling = false; // Valoare implicită pentru noiseCancelling
        this.wireless = false; // Valoare implicită pentru wireless
    }

    // Constructor cu parametri
    public Casti(String model, String brand, int year , double price, double rating, int quantity, String description, boolean noiseCancelling, boolean wireless) {
        super(model, brand, year , price, rating, quantity, description); // Apelează constructorul cu parametri al clasei părinte
        this.noiseCancelling = noiseCancelling;
        this.wireless = wireless;
    }

    // Constructor de copiere
    public Casti(Casti other) {
        super(other); // Apelează constructorul de copiere al clasei părinte
        this.noiseCancelling = other.noiseCancelling;
        this.wireless = other.wireless;
    }

    // Gettere și settere pentru câmpuri
    public boolean isNoiseCancelling() {
        return noiseCancelling;
    }

    public void setNoiseCancelling(boolean noiseCancelling) {
        this.noiseCancelling = noiseCancelling;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    // Suprascriem metoda toString pentru afișarea detaliilor despre Casti
    @Override
    public String toString() {
        return "Casti {" +
                "Model='" + getModel() + '\'' +
                ", Brand='" + getBrand() + '\'' +
                ", Year=" + getYearOfManufacture() +
                ", Price=" + getPrice() +
                ", Rating=" + getRating() +
                ", Stock=" + getStock() +
                ", Description='" + getDescription() + '\'' +
                ", NoiseCancelling=" + noiseCancelling +
                ", Wireless=" + wireless +
                '}';
    }
}