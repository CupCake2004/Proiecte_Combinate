package com.example.proiect_java_3;

public class Reportofon extends Gadget {
    private int memory;
    private boolean voiceActivation;

    // Constructor fără parametri
    public Reportofon() {
        super();  // Apelează constructorul fără parametri al clasei părinte
        this.memory = 8;  // GB
        this.voiceActivation = false;
    }

    // Constructor cu parametri
    public Reportofon(String model, String brand, int year , double price, double rating, int quantity, String description, int memory, boolean voiceActivation) {
        super(model, brand, year , price, rating, quantity, description);  // Apelează constructorul cu parametri al clasei părinte
        this.memory = memory;
        this.voiceActivation = voiceActivation;
    }

    // Constructor de copiere
    public Reportofon(Reportofon other) {
        super(other);  // Apelează constructorul de copiere al clasei părinte
        this.memory = other.memory;
        this.voiceActivation = other.voiceActivation;
    }

    // Gettere și settere pentru câmpuri
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
                ", Description=" + getDescription() +
                ", Memory=" + memory +
                ", Voice Activation=" + voiceActivation +
                '}';
    }
}