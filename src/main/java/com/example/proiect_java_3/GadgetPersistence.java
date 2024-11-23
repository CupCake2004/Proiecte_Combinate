package com.example.proiect_java_3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GadgetPersistence {

    // Metodă pentru a salva gadgeturile în fișier
    public static void  saveGadgetsToFile(List<Gadget> gadgetList, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(gadgetList);
            System.out.println("Lista de gadgeturi a fost salvată cu succes în fișierul " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Eroare la salvarea listei de gadgeturi: " + e.getMessage());
        }
    }
    // Method to load the list of gadgets from a file
    @SuppressWarnings("unchecked")
    public static List<Gadget> loadGadgetsFromFile(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (List<Gadget>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading gadget list: " + e.getMessage());
            e.printStackTrace();
            return null;
        }

    }
    // Metodă pentru a genera gadgeturi de test și a le salva în fișier
    public static void generateSampleData(String filePath) {
        List<Gadget> sampleGadgets = new ArrayList<>();

        // Generăm gadgeturi de test
        for (int i = 0; i < 10; i++) {
            sampleGadgets.add(new Boxe("Boxe Model " + i, "Brand Boxe", 2024, true, 150.0, 4.5, 50, "Boxe de înaltă calitate", "Bluetooth", true, 50, true, true));
            sampleGadgets.add(new Casti("Căști Model " + i, "Brand Căști", 2024, true, 100.0, 4.2, 30, "Căști pentru sport", "Bluetooth", true, true));
            sampleGadgets.add(new MiniCamera("MiniCamera Model " + i, "Brand MiniCamera", 2024, true, 200.0, 4.0, 10, "Mini cameră compactă", "Wi-Fi", 5000, true));
            sampleGadgets.add(new PortableSpeakers("PortableSpeakers Model " + i, "Brand PortableSpeakers", 2024, true, 120.0, 4.3, 40, "Boxe portabile cu Bluetooth", "Bluetooth", 1000, true));
            sampleGadgets.add(new Reportofon("Reportofon Model " + i, "Brand Reportofon", 2024, true, 180.0, 4.7, 15, "Reportofon digital cu memorie", 100, true));
            sampleGadgets.add(new SmartAlarm("SmartAlarm Model " + i, "Brand SmartAlarm", 2024, true, 250.0, 4.8, 20, "Alarmă inteligentă cu senzori", true, 12));
            sampleGadgets.add(new SmartPlug("SmartPlug Model " + i, "Brand SmartPlug", 2024, true, 50.0, 4.1, 100, "Priză inteligentă cu monitorizare", 100, true));
            sampleGadgets.add(new VRGoggles("VRGoggles Model " + i, "Brand VRGoggles", 2024, true, 350.0, 4.6, 25, "Ochelari VR de înaltă calitate", 8, true));
        }

        // Salvăm gadgeturile generate în fișierul specificat
        saveGadgetsToFile(sampleGadgets, filePath);
    }
}