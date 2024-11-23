package com.example.proiect_java_3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.List;

public class CatalogGadgetApp extends Application {

    private static final String FILE_PATH = "gadgeturi.ser"; // Folosim fișierul nou
    private List<Gadget> gadgeturi;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("MMAK Industry SA");

        gadgeturi = loadInitialGadgets(); // Încărcăm gadgeturile din fișierul nou

        ListView<String> gadgetList = new ListView<>();
        for (Gadget gadget : gadgeturi) {
            gadgetList.getItems().add(gadget.toString());
        }

        VBox detailsBox = new VBox(10);
        detailsBox.setStyle("-fx-padding: 10; -fx-border-color: red; -fx-border-width: 1;");

        TextField modelField = new TextField();
        TextField brandField = new TextField();
        TextField yearField = new TextField();
        TextField priceField = new TextField();
        CheckBox isOnCheckbox = new CheckBox("Este Pornit?");
        ComboBox<String> gadgetTypeCombo = new ComboBox<>();
        gadgetTypeCombo.getItems().addAll("Boxe", "Căști", "Mini Cameră", "Portable Speakers", "Reportofon", "Smart Alarm", "Smart Plug", "VR Goggles");

        Button addButton = new Button("Adaugă Gadget");
        Button updateButton = new Button("Salvează modificările");
        Button deleteButton = new Button("Șterge Gadget");

        // Eveniment pentru selectarea unui gadget
        gadgetList.setOnMouseClicked(event -> {
            String selectedItem = gadgetList.getSelectionModel().getSelectedItem();
            if (selectedItem != null) {
                int selectedIndex = gadgetList.getSelectionModel().getSelectedIndex();
                Gadget gadget = gadgeturi.get(selectedIndex);

                modelField.setText(gadget.getModel());
                brandField.setText(gadget.getBrand());
                yearField.setText(String.valueOf(gadget.getYearOfManufacture()));
                priceField.setText(String.valueOf(gadget.getPrice()));
                isOnCheckbox.setSelected(gadget.isOn());
            }
        });

        // Eveniment pentru adăugarea unui gadget
        addButton.setOnAction(event -> {
            String type = gadgetTypeCombo.getValue();
            if (type != null) {
                Gadget newGadget = createGadgetByType(type);
                gadgeturi.add(newGadget);
                gadgetList.getItems().add(newGadget.toString());
                saveChanges(gadgeturi);
            }
        });

        // Eveniment pentru actualizarea unui gadget
        updateButton.setOnAction(event -> {
            int selectedIndex = gadgetList.getSelectionModel().getSelectedIndex();
            if (selectedIndex != -1) {
                Gadget gadget = gadgeturi.get(selectedIndex);

                gadget.setModel(modelField.getText());
                gadget.setBrand(brandField.getText());
                gadget.setYearOfManufacture(Integer.parseInt(yearField.getText()));
                gadget.setPrice(Double.parseDouble(priceField.getText()));
                gadget.setOn(isOnCheckbox.isSelected());

                gadgetList.getItems().set(selectedIndex, gadget.toString());
                saveChanges(gadgeturi);
            }
        });

        // Eveniment pentru ștergerea unui gadget
        deleteButton.setOnAction(event -> {
            int selectedIndex = gadgetList.getSelectionModel().getSelectedIndex();
            if (selectedIndex != -1) {
                gadgeturi.remove(selectedIndex);
                gadgetList.getItems().remove(selectedIndex);
                saveChanges(gadgeturi);
            }
        });

        detailsBox.getChildren().addAll(
                new Label("Model:"), modelField,
                new Label("Brand:"), brandField,
                new Label("An fabricație:"), yearField,
                new Label("Preț:"), priceField,
                isOnCheckbox,
                gadgetTypeCombo,
                addButton,
                updateButton,
                deleteButton
        );

        VBox mainLayout = new VBox(10, gadgetList, detailsBox);
        mainLayout.setStyle("-fx-padding: 20;");

        Scene scene = new Scene(mainLayout, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void saveChanges(List<Gadget> gadgetList) {
        GadgetPersistence.saveGadgetsToFile(gadgetList, FILE_PATH); // Salvăm în fișierul nou
    }

    private List<Gadget> loadInitialGadgets() {
        return GadgetPersistence.loadGadgetsFromFile(FILE_PATH); // Încărcăm din fișierul nou
    }

    private Gadget createGadgetByType(String type) {
        switch (type) {
            case "Boxe":
                return new Boxe("Boxe Model", "Brand Boxe", 2024, true, 150.0, 4.5, 50, "Boxe de înaltă calitate", "Bluetooth", true, 50, true, true);
            case "Căști":
                return new Casti("Căști Model", "Brand Căști", 2024, true, 100.0, 4.2, 30, "Căști pentru sport", "Bluetooth", true, true);
            case "Mini Cameră":
                return new MiniCamera("MiniCamera Model", "Brand MiniCamera", 2024, true, 200.0, 4.0, 10, "Mini cameră compactă", "Wi-Fi", 5000, true);
            case "Portable Speakers":
                return new PortableSpeakers("PortableSpeakers Model", "Brand PortableSpeakers", 2024, true, 120.0, 4.3, 40, "Boxe portabile cu Bluetooth", "Bluetooth", 1000, true);
            case "Reportofon":
                return new Reportofon("Reportofon Model", "Brand Reportofon", 2024, true, 180.0, 4.7, 15, "Reportofon digital cu memorie", 100, true);
            case "Smart Alarm":
                return new SmartAlarm("SmartAlarm Model", "Brand SmartAlarm", 2024, true, 250.0, 4.8, 20, "Alarmă inteligentă cu senzori", true, 12);
            case "Smart Plug":
                return new SmartPlug("SmartPlug Model", "Brand SmartPlug", 2024, true, 50.0, 4.1, 100, "Priză inteligentă cu monitorizare", 100, true);
            case "VR Goggles":
                return new VRGoggles("VRGoggles Model", "Brand VRGoggles", 2024, true, 350.0, 4.6, 25, "Ochelari VR de înaltă calitate", 8, true);
            default:
                return new Gadget();
        }
    }
}
