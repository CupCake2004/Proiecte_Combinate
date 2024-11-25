package com.example.proiect_java_3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class CatalogGadgetApp extends Application {

    private static final String FILE_PATH = "gadgeturi.ser"; // Folosim fișierul nou
    private List<Gadget> gadgeturi;
    private Stage primaryStage;
    private Scene mainScene;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("MMAK Industry SA");

        gadgeturi = loadInitialGadgets(); // Încărcăm gadgeturile din fișierul nou

        // Creăm bara de meniu
        MenuBar menuBar = new MenuBar();

        // Meniul Setări
        Menu settingsMenu = new Menu("Setări");

        // Adăugăm opțiunile de setări
        MenuItem accountInfoMenuItem = new MenuItem("Informații cont");
        accountInfoMenuItem.setOnAction(e -> openAccountInfo());

        MenuItem addressesMenuItem = new MenuItem("Adrese");
        addressesMenuItem.setOnAction(e -> openAddresses());

        MenuItem ordersMenuItem = new MenuItem("Comenzile mele");
        ordersMenuItem.setOnAction(e -> openOrders());

        MenuItem preferredStoreMenuItem = new MenuItem("Magazin preferat");
        preferredStoreMenuItem.setOnAction(e -> openPreferredStore());

        MenuItem giftCardsMenuItem = new MenuItem("Carduri cadou");
        giftCardsMenuItem.setOnAction(e -> openGiftCards());

        MenuItem returnsMenuItem = new MenuItem("Retur produse");
        returnsMenuItem.setOnAction(e -> openReturns());

        MenuItem serviceMenuItem = new MenuItem("Service produse");
        serviceMenuItem.setOnAction(e -> openService());

        MenuItem reviewsMenuItem = new MenuItem("Recenziile mele");
        reviewsMenuItem.setOnAction(e -> openReviewsMenu());

        MenuItem supportMenuItem = new MenuItem("Suport clienți");
        supportMenuItem.setOnAction(e -> openSupport());

        MenuItem securityMenuItem = new MenuItem("Securitate");
        securityMenuItem.setOnAction(e -> openSecurity());

        MenuItem contactMenuItem = new MenuItem("Contact");
        contactMenuItem.setOnAction(e -> openContact());

        MenuItem financesMenuItem = new MenuItem("Finanțe");
        financesMenuItem.setOnAction(e -> openFinances());

        // Adăugăm toate opțiunile în meniul de setări
        settingsMenu.getItems().addAll(
                accountInfoMenuItem, addressesMenuItem, ordersMenuItem, preferredStoreMenuItem,
                giftCardsMenuItem, returnsMenuItem, serviceMenuItem, reviewsMenuItem,
                supportMenuItem, securityMenuItem, contactMenuItem, financesMenuItem
        );

        // Adăugăm meniul în bara de meniu
        menuBar.getMenus().add(settingsMenu);

        // Creăm o listă de gadgeturi
        ListView<String> gadgetList = new ListView<>();
        for (Gadget gadget : gadgeturi) {
            gadgetList.getItems().add(gadget.toString());
        }

        // Layout pentru detalii
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

        VBox mainLayout = new VBox(10, menuBar, gadgetList, detailsBox);
        mainLayout.setStyle("-fx-padding: 20;");

        mainScene = new Scene(mainLayout, 600, 600); // Salvează scena principală
        primaryStage.setScene(mainScene);
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

    // Metodă pentru deschiderea ferestrei de recenzii
    private void openReviewsMenu() {
        // Creăm un StackPane pentru a suprapune fereastra de recenzii peste fereastra principală
        StackPane overlay = new StackPane();
        overlay.setStyle("-fx-background-color: rgba(0, 0, 0, 0.5);"); // Fundal semitransparent

        // Creăm un SplitPane pentru a împărți zona în 2 părți
        SplitPane splitPane = new SplitPane();

        // Secțiunea pentru scriere recenzie
        VBox writeReviewBox = new VBox(10);
        TextArea reviewTextArea = new TextArea();
        reviewTextArea.setPromptText("Scrie o recenzie...");
        Button submitReviewButton = new Button("Trimite Recenzie");
        writeReviewBox.getChildren().addAll(new Label("Scrie Recenzie"), reviewTextArea, submitReviewButton);

        // Secțiunea pentru recenzii publicate
        VBox publishedReviewsBox = new VBox(10);
        ListView<String> publishedReviewsList = new ListView<>();
        publishedReviewsList.getItems().addAll("Recenzie 1", "Recenzie 2", "Recenzie 3");
        publishedReviewsBox.getChildren().addAll(new Label("Recenzii Publicate"), publishedReviewsList);

        // Adăugăm secțiunile în SplitPane
        splitPane.getItems().addAll(writeReviewBox, publishedReviewsBox);

        // Adăugăm butonul de închidere
        Button closeButton = new Button("Închide");
        closeButton.setOnAction(event -> {
            // Închidem meniul de recenzii și revenim la scena principală
            primaryStage.setScene(mainScene); // Setează scena principală
        });

        // Adăugăm butonul de închidere în overlay
        overlay.getChildren().addAll(splitPane, closeButton);

        // Creăm scena pentru recenzii
        Scene reviewsScene = new Scene(overlay, 600, 400);
        primaryStage.setScene(reviewsScene); // Schimbăm scena pentru a deschide meniul de recenzii
    }

    // Funcții pentru a deschide fiecare setare (exemplu pentru fiecare opțiune)
    private void openAccountInfo() {
        System.out.println("Informații cont selectat.");
    }

    private void openAddresses() {
        System.out.println("Adrese selectat.");
    }

    private void openOrders() {
        System.out.println("Comenzile mele selectat.");
    }

    private void openPreferredStore() {
        System.out.println("Magazin preferat selectat.");
    }

    private void openGiftCards() {
        System.out.println("Carduri cadou selectat.");
    }

    private void openReturns() {
        System.out.println("Retur produse selectat.");
    }

    private void openService() {
        System.out.println("Service produse selectat.");
    }

    private void openSupport() {
        System.out.println("Suport clienți selectat.");
    }

    private void openSecurity() {
        System.out.println("Securitate selectat.");
    }

    private void openContact() {
        System.out.println("Contact selectat.");
    }

    private void openFinances() {
        System.out.println("Finanțe selectat.");
    }
}
