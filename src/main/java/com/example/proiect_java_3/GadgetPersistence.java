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
        for (int i = 0; i < 10; i++) {
            sampleGadgets.add(new Boxe());  // Constructor fără parametri
            sampleGadgets.add(new Boxe("Boxe Model " + i, "Brand Boxe", 2024,  150.0, 4.5, 50, "Boxe de înaltă calitate", "Bluetooth", true));  // Constructor cu parametri
            sampleGadgets.add(new Boxe(new Boxe()));  // Constructor de copiere
        }

        // Instanțe de Casti
        for (int i = 0; i < 10; i++) {
            sampleGadgets.add(new Casti());  // Constructor fără parametri
            sampleGadgets.add(new Casti("Căști Model " + i, "Brand Căști", 2024,  100.0, 4.2, 30, "Căști pentru sport", true, true));  // Constructor cu parametri
            sampleGadgets.add(new Casti(new Casti()));  // Constructor de copiere
        }

        // Instanțe de MiniCamera
        for (int i = 0; i < 10; i++) {
            sampleGadgets.add(new MiniCamera());  // Constructor fără parametri
            sampleGadgets.add(new MiniCamera("MiniCamera Model " + i, "Brand MiniCamera", 2024,  200.0, 4.0, 10, "Mini cameră compactă", "Wi-Fi", 5000, true));  // Constructor cu parametri
            sampleGadgets.add(new MiniCamera(new MiniCamera()));  // Constructor de copiere
        }

        // Instanțe de PortableSpeakers
        for (int i = 0; i < 10; i++) {
            sampleGadgets.add(new PortableSpeakers());  // Constructor fără parametri
            sampleGadgets.add(new PortableSpeakers("PortableSpeakers Model " + i, "Brand PortableSpeakers", 2024,  120.0, 4.3, 40, "Boxe portabile cu Bluetooth", 1000, true));  // Constructor cu parametri
            sampleGadgets.add(new PortableSpeakers(new PortableSpeakers()));  // Constructor de copiere
        }

        // Instanțe de Reportofon
        for (int i = 0; i < 10; i++) {
            sampleGadgets.add(new Reportofon());  // Constructor fără parametri
            sampleGadgets.add(new Reportofon("Reportofon Model " + i, "Brand Reportofon", 2024,  180.0, 4.7, 15, "Reportofon digital cu memorie", 100, true));  // Constructor cu parametri
            sampleGadgets.add(new Reportofon(new Reportofon()));  // Constructor de copiere
        }

        // Instanțe de SmartAlarm
        for (int i = 0; i < 10; i++) {
            sampleGadgets.add(new SmartAlarm());  // Constructor fără parametri
            sampleGadgets.add(new SmartAlarm("SmartAlarm Model " + i, "Brand SmartAlarm", 2024,  250.0, 4.8, 20, "Alarmă inteligentă cu senzori", true, 12));  // Constructor cu parametri
            sampleGadgets.add(new SmartAlarm(new SmartAlarm()));  // Constructor de copiere
        }

        // Instanțe de SmartPlug
        for (int i = 0; i < 10; i++) {
            sampleGadgets.add(new SmartPlug());  // Constructor fără parametri
            sampleGadgets.add(new SmartPlug("SmartPlug Model " + i, "Brand SmartPlug", 2024,  50.0, 4.1, 100, "Priză inteligentă cu monitorizare", 100, true));  // Constructor cu parametri
            sampleGadgets.add(new SmartPlug(new SmartPlug()));  // Constructor de copiere
        }

        // Instanțe de VRGoggles
        for (int i = 0; i < 10; i++) {
            sampleGadgets.add(new VRGoggles());  // Constructor fără parametri
            sampleGadgets.add(new VRGoggles("VRGoggles Model " + i, "Brand VRGoggles", 2024, 350.0, 4.6, 25, "Ochelari VR de înaltă calitate", 8, true));  // Constructor cu parametri
            sampleGadgets.add(new VRGoggles(new VRGoggles()));  // Constructor de copiere
        }

        // Salvăm gadgeturile generate în fișierul specificat
        saveGadgetsToFile(sampleGadgets, filePath);
    }
}