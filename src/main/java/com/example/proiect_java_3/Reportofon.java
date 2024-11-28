package com.example.proiect_java_3;

public class Reportofon extends Gadget {
    private int memory; // Memorie în GB
    private boolean voiceActivation; // Activare prin voce

    // Constructor fără parametri
    public Reportofon() {
        super();  // Apelează constructorul fără parametri al clasei părinte (Gadget)
        this.memory = 8;  // Memorie implicită
        this.voiceActivation = false;  // Activare prin voce implicită
    }

    // Constructor cu parametri
    public Reportofon(String model, String brand, int year, double price, double rating, int stock, String description, int memory, boolean voiceActivation) {
        super(model, brand, year, price, rating, stock, description);  // Apelează constructorul cu parametri al clasei părinte (Gadget)
        this.memory = memory;
        this.voiceActivation = voiceActivation;
    }

    // Constructor de copiere
    public Reportofon(Reportofon other) {
        super(other);  // Apelează constructorul de copiere al clasei părinte (Gadget)
        this.memory = other.memory;
        this.voiceActivation = other.voiceActivation;
    }

    // Gettere și settere pentru câmpurile memory și voiceActivation
    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public boolean isVoiceActivation() {
        return voiceActivation;
    }

    public void setVoiceActivation(boolean voiceActivation) {
        this.voiceActivation = voiceActivation;
    }

    @Override
    public String toString() {
        return "Reportofon {" +
                "Model='" + getModel() + '\'' +
                ", Brand='" + getBrand() + '\'' +
                ", Year=" + getYearOfManufacture() +
                ", Price=" + getPrice() +
                ", Rating=" + getRating() +
                ", Stock=" + getStock() +
                ", Description='" + getDescription() + '\'' +
                ", Memory=" + memory +
                ", Voice Activation=" + voiceActivation +
                '}';
    }
}
