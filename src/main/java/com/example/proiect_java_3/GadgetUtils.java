package com.example.proiect_java_3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GadgetUtils {

    // Metodă pentru a încărca gadgeturile din fișierul serializat
    public static List<Gadget> incarcaGadgeturi(String filePath) {
        File file = new File(filePath);

        // Dacă fișierul nu există sau este gol, generăm date de test
        if (!file.exists() || file.length() == 0) {
            GadgetPersistence.generateSampleData(filePath); // Generăm date de test
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (List<Gadget>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>(); // Dacă apare o eroare, returnăm o listă goală
        }
    }
}
