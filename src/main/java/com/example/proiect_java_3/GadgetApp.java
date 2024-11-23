package com.example.proiect_java_3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.List;

public class GadgetApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Calea către fișierul serializat
        String filePath ="gadgeturi.ser";  // Folosim fișierul nou

        // Încărcăm gadgeturile din fișierul serializat
        List<Gadget> gadgeturi = GadgetUtils.incarcaGadgeturi(filePath);

        // Creăm un VBox pentru a organiza elementele vertical
        VBox vbox = new VBox(10); // Spațiere de 10 unități între elemente

        // Verificăm dacă gadgeturile au fost încărcate și le afișăm
        if (gadgeturi != null && !gadgeturi.isEmpty()) {
            for (Gadget gadget : gadgeturi) {
                // Creăm etichete pentru fiecare detaliu al gadgetului
                Label nameLabel = new Label("Model: " + gadget.getModel());
                Label brandLabel = new Label("Brand: " + gadget.getBrand());
                Label priceLabel = new Label("Preț: " + gadget.getPrice() + " RON");
                Label yearLabel = new Label("An fabricație: " + gadget.getYearOfManufacture());
                Label statusLabel = new Label("Status: " + (gadget.isOn() ? "Pornit" : "Oprit"));

                // Separăm gadgeturile cu o linie goală
                Label separator = new Label(" ");

                // Adăugăm toate etichetele în VBox
                vbox.getChildren().addAll(nameLabel, brandLabel, priceLabel, yearLabel, statusLabel, separator);
            }
        } else {
            // Dacă nu există gadgeturi, afișăm un mesaj informativ
            vbox.getChildren().add(new Label("Nu s-au găsit gadgeturi salvate în fișier."));
        }

        // Împachetăm VBox-ul într-un ScrollPane pentru a permite derularea
        ScrollPane scrollPane = new ScrollPane(vbox);
        scrollPane.setFitToWidth(true); // Ajustăm lățimea conținutului la lățimea ScrollPane-ului

        // Configurăm scena și fereastra principală
        Scene scene = new Scene(scrollPane, 400, 600);
        primaryStage.setTitle("Listă Gadgeturi");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Lansează aplicația JavaFX
        launch(args);
    }
}
