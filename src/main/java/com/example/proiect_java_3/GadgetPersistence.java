package com.example.proiect_java_3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GadgetPersistence {

    // Metodă pentru a salva gadgeturile în fișier
    public static void saveGadgetsToFile(List<Gadget> gadgetList, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(gadgetList);
            System.out.println("Lista de gadgeturi a fost salvată cu succes în fișierul " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Eroare la salvarea listei de gadgeturi: " + e.getMessage());
        }
    }

    // Metodă pentru a încărca lista de gadgeturi dintr-un fișier
    @SuppressWarnings("unchecked")
    public static List<Gadget> loadGadgetsFromFile(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (List<Gadget>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Eroare la încărcarea listei de gadgeturi: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    // Metodă pentru a genera gadgeturi de test și a le salva în fișier
    public static void generateSampleData(String filePath) {
        List<Gadget> sampleGadgets = new ArrayList<>();

        // Generăm gadgeturi de test folosind constructorii diferiți

        // Instanțe de Boxe
        for (int i = 1; i <=10; i++) {
            sampleGadgets.add(new Boxe("Boxe Model " + i, "Brand Boxe " + i, 2024 - i,  150.0 + i*10, 4.5 - i/10.0, 50 + 5*i, "Boxe de înaltă calitate", "Bluetooth", true));  // Constructor cu parametri

        }

        // Instanțe de Casti
        for (int i = 1; i <= 10; i++) {
            sampleGadgets.add(new Casti("Căști Model " + i, "Brand Căști " + i, 2024 - i,  100.0 + i*10, 4.2 - i/10.0, 30 + 5*i, "Căști pentru sport", true, true));  // Constructor cu parametri

        }

        // Instanțe de MiniCamera
        for (int i = 1; i <= 10; i++) {
            sampleGadgets.add(new MiniCamera("MiniCamera Model " + i, "Brand MiniCamera " + i, 2024 - i,  200.0 + i*10, 4.0 - i/10.0, 10 + 5*i, "Mini cameră compactă", "Wi-Fi", 5000, true));  // Constructor cu parametri

        }

        // Instanțe de PortableSpeakers
        for (int i = 1; i <= 10; i++) {
            sampleGadgets.add(new PortableSpeakers("PortableSpeakers Model " + i, "Brand PortableSpeakers " + i, 2024 - i,  120.0 + i*10, 4.3 - i/10.0, 40 + 5*i, "Boxe portabile cu Bluetooth", 1000, true));  // Constructor cu parametri

        }

        // Instanțe de Reportofon
        for (int i = 1; i <= 10; i++) {
            sampleGadgets.add(new Reportofon("Reportofon Model " + i, "Brand Reportofon " + i, 2024 - i,  180.0 + i*10, 4.7 - i/10.0, 15 + 5*i, "Reportofon digital cu memorie", 100, true));  // Constructor cu parametri

        }

        // Instanțe de SmartAlarm
        for (int i = 1; i <= 10; i++) {
            sampleGadgets.add(new SmartAlarm("SmartAlarm Model " + i, "Brand SmartAlarm " + i, 2024 - i,  250.0 + i*10, 4.8 - i/10.0, 20 + 5*i, "Alarmă inteligentă cu senzori", true, 12));  // Constructor cu parametri

        }

        // Instanțe de SmartPlug
        for (int i = 1; i <= 10; i++) {
            sampleGadgets.add(new SmartPlug("SmartPlug Model " + i, "Brand SmartPlug " + i, 2024 - i,  50.0 + i*10, 4.1 - i/10.0, 100 + 5*i, "Priză inteligentă cu monitorizare", 100, true));  // Constructor cu parametri

        }

        // Instanțe de VRGoggles
        for (int i = 1; i <= 10; i++) {
            sampleGadgets.add(new VRGoggles("VRGoggles Model " + i, "Brand VRGoggles " + i, 2024 - i, 350.0 + i*10, 4.6 - i/10.0, 25 + 5*i, "Ochelari VR de înaltă calitate", 8, true));  // Constructor cu parametri

        }

        // Salvăm gadgeturile generate în fișierul specificat
        saveGadgetsToFile(sampleGadgets, filePath);
    }
}