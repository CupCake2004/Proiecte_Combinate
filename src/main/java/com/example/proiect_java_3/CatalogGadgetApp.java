package com.example.proiect_java_3;

import javafx.application.Application;
import javafx.geometry.Pos;
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

        // Crearea barei de meniu pentru Căutare
        MenuBar searchMenuBar = new MenuBar();
        Menu searchMenu = new Menu("Căutare");
        MenuItem searchByNameItem = new MenuItem("Căutare după nume");
        searchByNameItem.setOnAction(e -> searchByName());
        MenuItem searchByCategoryItem = new MenuItem("Căutare după categorie");
        searchByCategoryItem.setOnAction(e -> searchByCategory());
        searchMenu.getItems().addAll(searchByNameItem, searchByCategoryItem);
        searchMenuBar.getMenus().add(searchMenu);

        // Meniul Setări
        MenuBar settingsMenuBar = new MenuBar();

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


        // Adăugăm ambele meniuri în bara de meniu
        settingsMenuBar.getMenus().addAll(settingsMenu);

        // Creăm un HBox pentru Căutare (stânga) și un altul pentru Setări (dreapta)

        HBox topMenuBox = new HBox();
        topMenuBox.setSpacing(10); // Add spacing between elements
        topMenuBox.setAlignment(Pos.TOP_LEFT); // Align items to the top-left

// Create a spacer
        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);

// Add the boxes and spacer to the HBox
        topMenuBox.getChildren().addAll(searchMenuBar, spacer, settingsMenuBar);

// Add the topMenuBox to the main scene or parent container

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

        VBox mainLayout = new VBox(10, topMenuBox, gadgetList, detailsBox);
        mainLayout.setStyle("-fx-padding: 10;");


        mainScene = new Scene(mainLayout, 900, 600); // Salvează scena principală
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
                return new Boxe("Boxe Model", "Brand Boxe", 2024,150.0, 4.5, 50, "Boxe de înaltă calitate", "Bluetooth", true);
            case "Căști":
                return new Casti("Căști Model", "Brand Căști", 2024, 100.0, 4.2, 30, "Căști pentru sport", true, true);
            case "Mini Cameră":
                return new MiniCamera("MiniCamera Model", "Brand MiniCamera", 2024, 200.0, 4.0, 10, "Mini cameră compactă", "Wi-Fi", 128, true);
            case "Portable Speakers":
                return new PortableSpeakers("Portable Speakers Model", "Brand Portable", 2024, 130.0, 4.4, 40, "Boxe portabile", 100, true);
            case "Reportofon":
                return new Reportofon("Reportofon Model", "Brand Reportofon", 2024, 80.0, 4.6, 20, "Reportofon digital", 32, true);
            case "Smart Alarm":
                return new SmartAlarm("Smart Alarm Model", "Brand Alarm", 2024, 60.0, 4.7, 15, "Alarmă inteligentă", true, 10);
            case "Smart Plug":
                return new SmartPlug("Smart Plug Model", "Brand Plug", 2024, 40.0, 4.3, 10, "Priză inteligentă", 13, true);
            case "VR Goggles":
                return new VRGoggles("VR Goggles Model", "Brand VR Goggles", 2024, 350.0, 4.6, 5, "Ochelari VR de înaltă calitate", 20, true);
            default:
                throw new IllegalArgumentException("Tip necunoscut");
        }
    }

    private void openAccountInfo() {
        // Layout-ul pentru informațiile contului
        VBox accountInfoLayout = new VBox(10);
        accountInfoLayout.setStyle("-fx-padding: 10;");

        // Adăugăm controale pentru informațiile contului
        TextField nameField = new TextField("Nume utilizator");
        TextField emailField = new TextField("email@example.com");
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Parolă");

        Button saveButton = new Button("Salvează");
        saveButton.setOnAction(event -> {
            String name = nameField.getText();
            String email = emailField.getText();
            String password = passwordField.getText();
            // Aici poți salva aceste informații în aplicație (ex. într-o bază de date sau fișier)
            System.out.println("Informații cont salvate: " + name + ", " + email + ", " + password);
        });

        // Buton pentru închidere
        Button closeButton = new Button("Închide");
        closeButton.setOnAction(event -> primaryStage.setScene(mainScene));

        accountInfoLayout.getChildren().addAll(
                new Label("Informații cont"),
                new Label("Nume:"), nameField,
                new Label("Email:"), emailField,
                new Label("Parolă:"), passwordField,
                saveButton,
                closeButton
        );

        Scene accountInfoScene = new Scene(accountInfoLayout, 400, 300);
        primaryStage.setScene(accountInfoScene);
    }


    private void openAddresses() {
        VBox addressesLayout = new VBox(10);
        addressesLayout.setStyle("-fx-padding: 10;");

        // ListView pentru a vizualiza adresele
        ListView<String> addressesList = new ListView<>();
        addressesList.getItems().addAll("Adresă 1", "Adresă 2");

        // Controale pentru adăugarea unei noi adrese
        TextField addressField = new TextField();
        addressField.setPromptText("Introduceti o adresă");

        Button addAddressButton = new Button("Adaugă adresă");
        addAddressButton.setOnAction(event -> {
            String newAddress = addressField.getText();
            if (!newAddress.isEmpty()) {
                addressesList.getItems().add(newAddress);
                addressField.clear();
            }
        });

        Button deleteAddressButton = new Button("Șterge adresă");
        deleteAddressButton.setOnAction(event -> {
            String selectedAddress = addressesList.getSelectionModel().getSelectedItem();
            if (selectedAddress != null) {
                addressesList.getItems().remove(selectedAddress);
            }
        });

        Button closeButton = new Button("Închide");
        closeButton.setOnAction(event -> primaryStage.setScene(mainScene));

        addressesLayout.getChildren().addAll(
                new Label("Adresele mele"),
                addressesList,
                addressField,
                addAddressButton,
                deleteAddressButton,
                closeButton
        );

        Scene addressesScene = new Scene(addressesLayout, 400, 300);
        primaryStage.setScene(addressesScene);
    }


    private void openOrders() {
        VBox ordersLayout = new VBox(10);
        ordersLayout.setStyle("-fx-padding: 10;");

        // ListView pentru comenzile utilizatorului
        ListView<String> ordersList = new ListView<>();
        ordersList.getItems().addAll("Comandă 1", "Comandă 2");

        // Detalii comandă
        TextArea orderDetails = new TextArea();
        orderDetails.setPromptText("Detalii comandă...");

        Button deleteOrderButton = new Button("Șterge comandă");
        deleteOrderButton.setOnAction(event -> {
            String selectedOrder = ordersList.getSelectionModel().getSelectedItem();
            if (selectedOrder != null) {
                ordersList.getItems().remove(selectedOrder);
            }
        });

        Button closeButton = new Button("Închide");
        closeButton.setOnAction(event -> primaryStage.setScene(mainScene));

        ordersLayout.getChildren().addAll(
                new Label("Comenzile mele"),
                ordersList,
                orderDetails,
                deleteOrderButton,
                closeButton
        );

        Scene ordersScene = new Scene(ordersLayout, 400, 300);
        primaryStage.setScene(ordersScene);
    }


    private void openPreferredStore() {
        VBox preferredStoreLayout = new VBox(10);
        preferredStoreLayout.setStyle("-fx-padding: 10;");

        // ComboBox pentru selectarea magazinului preferat
        ComboBox<String> storeComboBox = new ComboBox<>();
        storeComboBox.getItems().addAll("Magazin 1", "Magazin 2", "Magazin 3");

        Button saveStoreButton = new Button("Salvează magazinul preferat");
        saveStoreButton.setOnAction(event -> {
            String selectedStore = storeComboBox.getValue();
            if (selectedStore != null) {
                System.out.println("Magazin preferat setat la: " + selectedStore);
            }
        });

        Button closeButton = new Button("Închide");
        closeButton.setOnAction(event -> primaryStage.setScene(mainScene));

        preferredStoreLayout.getChildren().addAll(
                new Label("Magazin preferat"),
                storeComboBox,
                saveStoreButton,
                closeButton
        );

        Scene preferredStoreScene = new Scene(preferredStoreLayout, 400, 300);
        primaryStage.setScene(preferredStoreScene);
    }


    private void openGiftCards() {
        VBox giftCardsLayout = new VBox(10);
        giftCardsLayout.setStyle("-fx-padding: 10;");

        // ListView pentru carduri cadou
        ListView<String> giftCardsList = new ListView<>();
        giftCardsList.getItems().addAll("Card cadou 1", "Card cadou 2");

        Button activateCardButton = new Button("Activează card cadou");
        activateCardButton.setOnAction(event -> {
            String selectedCard = giftCardsList.getSelectionModel().getSelectedItem();
            if (selectedCard != null) {
                System.out.println("Cardul cadou activat: " + selectedCard);
            }
        });

        Button closeButton = new Button("Închide");
        closeButton.setOnAction(event -> primaryStage.setScene(mainScene));

        giftCardsLayout.getChildren().addAll(
                new Label("Carduri cadou"),
                giftCardsList,
                activateCardButton,
                closeButton
        );

        Scene giftCardsScene = new Scene(giftCardsLayout, 400, 300);
        primaryStage.setScene(giftCardsScene);
    }


    private void openReturns() {
        VBox returnsLayout = new VBox(10);
        returnsLayout.setStyle("-fx-padding: 10;");

        // ListView pentru produsele returnabile
        ListView<String> returnsList = new ListView<>();
        returnsList.getItems().addAll("Produs 1", "Produs 2");

        // Textarea pentru motivul returului
        TextArea returnReason = new TextArea();
        returnReason.setPromptText("Introduceți motivul returului...");

        Button submitReturnButton = new Button("Trimite cererea de retur");
        submitReturnButton.setOnAction(event -> {
            String selectedProduct = returnsList.getSelectionModel().getSelectedItem();
            String reason = returnReason.getText();
            if (selectedProduct != null && !reason.isEmpty()) {
                System.out.println("Cerere retur trimisă pentru: " + selectedProduct + "\nMotiv: " + reason);
            }
        });

        Button closeButton = new Button("Închide");
        closeButton.setOnAction(event -> primaryStage.setScene(mainScene));

        returnsLayout.getChildren().addAll(
                new Label("Produse returnabile"),
                returnsList,
                new Label("Motiv retur"),
                returnReason,
                submitReturnButton,
                closeButton
        );

        Scene returnsScene = new Scene(returnsLayout, 400, 300);
        primaryStage.setScene(returnsScene);
    }


    private void openService() {
        VBox serviceLayout = new VBox(10);
        serviceLayout.getChildren().add(new Label("Service produse"));

        Button closeButton = new Button("Închide");
        closeButton.setOnAction(event -> primaryStage.setScene(mainScene));
        serviceLayout.getChildren().add(closeButton);

        Scene serviceScene = new Scene(serviceLayout, 400, 300);
        primaryStage.setScene(serviceScene);
    }
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

    private void openSupport() {
        VBox supportLayout = new VBox(10);
        supportLayout.getChildren().add(new Label("Suport clienți"));

        Button closeButton = new Button("Închide");
        closeButton.setOnAction(event -> primaryStage.setScene(mainScene));
        supportLayout.getChildren().add(closeButton);

        Scene supportScene = new Scene(supportLayout, 400, 300);
        primaryStage.setScene(supportScene);
    }

    private void openSecurity() {
        VBox securityLayout = new VBox(10);
        securityLayout.setStyle("-fx-padding: 10;");

        // TextField pentru vechea parolă
        PasswordField oldPasswordField = new PasswordField();
        oldPasswordField.setPromptText("Introduceți vechea parolă");

        // TextField pentru noua parolă
        PasswordField newPasswordField = new PasswordField();
        newPasswordField.setPromptText("Introduceți noua parolă");

        Button changePasswordButton = new Button("Schimbă parola");
        changePasswordButton.setOnAction(event -> {
            String oldPassword = oldPasswordField.getText();
            String newPassword = newPasswordField.getText();
            if (!oldPassword.isEmpty() && !newPassword.isEmpty()) {
                System.out.println("Parola schimbată de la: " + oldPassword + " la " + newPassword);
            }
        });

        Button closeButton = new Button("Închide");
        closeButton.setOnAction(event -> primaryStage.setScene(mainScene));

        securityLayout.getChildren().addAll(
                new Label("Schimbă parola"),
                new Label("Parola veche"),
                oldPasswordField,
                new Label("Parola nouă"),
                newPasswordField,
                changePasswordButton,
                closeButton
        );

        Scene securityScene = new Scene(securityLayout, 400, 300);
        primaryStage.setScene(securityScene);
    }

    private void openContact() {
        VBox contactLayout = new VBox(10);
        contactLayout.setStyle("-fx-padding: 10;");

        // TextField pentru subiectul mesajului
        TextField subjectField = new TextField();
        subjectField.setPromptText("Introduceți subiectul mesajului");

        // Textarea pentru detalii mesaj
        TextArea messageField = new TextArea();
        messageField.setPromptText("Introduceți mesajul...");

        Button submitContactButton = new Button("Trimite mesaj");
        submitContactButton.setOnAction(event -> {
            String subject = subjectField.getText();
            String message = messageField.getText();
            if (!subject.isEmpty() && !message.isEmpty()) {
                System.out.println("Mesaj trimis: " + subject + "\nMesaj: " + message);
            }
        });

        Button closeButton = new Button("Închide");
        closeButton.setOnAction(event -> primaryStage.setScene(mainScene));

        contactLayout.getChildren().addAll(
                new Label("Contact"),
                new Label("Subiect"),
                subjectField,
                new Label("Mesaj"),
                messageField,
                submitContactButton,
                closeButton
        );

        Scene contactScene = new Scene(contactLayout, 400, 300);
        primaryStage.setScene(contactScene);
    }

    private void openFinances() {
        VBox financesLayout = new VBox(10);
        financesLayout.setStyle("-fx-padding: 10;");

        // Etichete pentru soldul curent și istoricul tranzacțiilor
        Label balanceLabel = new Label("Soldul curent: 1000 RON");
        Label transactionHistoryLabel = new Label("Istoric tranzacții:");

        // ListView pentru istoricul tranzacțiilor
        ListView<String> transactionHistoryList = new ListView<>();
        transactionHistoryList.getItems().addAll(
                "Plată: 200 RON - 01/11/2024",
                "Transfer: 150 RON - 02/11/2024",
                "Depunere: 500 RON - 05/11/2024"
        );

        // TextField pentru suma de plată/transfer
        TextField amountField = new TextField();
        amountField.setPromptText("Introduceți suma pentru plată sau transfer");

        // Button pentru efectuarea plății/transferului
        Button makePaymentButton = new Button("Efectuează plată/transfer");
        makePaymentButton.setOnAction(event -> {
            String amountText = amountField.getText();
            if (!amountText.isEmpty()) {
                double amount = Double.parseDouble(amountText);
                System.out.println("Plată/transfer efectuat de " + amount + " RON");
            }
        });

        Button closeButton = new Button("Închide");
        closeButton.setOnAction(event -> primaryStage.setScene(mainScene));

        financesLayout.getChildren().addAll(
                new Label("Finanțe"),
                balanceLabel,
                transactionHistoryLabel,
                transactionHistoryList,
                new Label("Suma de plată/transfer"),
                amountField,
                makePaymentButton,
                closeButton
        );

        Scene financesScene = new Scene(financesLayout, 400, 400);
        primaryStage.setScene(financesScene);
    }

    private void searchByCategory() {
        Stage searchByCategoryStage = new Stage();
        searchByCategoryStage.setTitle("Căutare după categorie");

        VBox searchLayout = new VBox(10);
        searchLayout.setStyle("-fx-padding: 20;");

        Label instructionLabel = new Label("Selectați categoria gadgetului:");
        ComboBox<String> categoryComboBox = new ComboBox<>();
        categoryComboBox.getItems().addAll(
                "Boxe", "Căști", "Mini Cameră", "Portable Speakers",
                "Reportofon", "Smart Alarm", "Smart Plug", "VR Goggles"
        );

        ListView<String> resultsList = new ListView<>();

        Button searchButton = new Button("Caută");
        searchButton.setOnAction(event -> {
            String selectedCategory = categoryComboBox.getValue();
            resultsList.getItems().clear();

            if (selectedCategory != null) {
                for (Gadget gadget : gadgeturi) {
                    if (gadget.getClass().getSimpleName().equals(selectedCategory)) {
                        resultsList.getItems().add(gadget.toString());
                    }
                }

                if (resultsList.getItems().isEmpty()) {
                    resultsList.getItems().add("Nu s-au găsit rezultate.");
                }
            } else {
                resultsList.getItems().add("Selectați o categorie înainte de a căuta.");
            }
        });

        searchLayout.getChildren().addAll(instructionLabel, categoryComboBox, searchButton, resultsList);

        Scene searchScene = new Scene(searchLayout, 400, 300);
        searchByCategoryStage.setScene(searchScene);
        searchByCategoryStage.show();
    }
    private void searchByName() {
        Stage searchByNameStage = new Stage();
        searchByNameStage.setTitle("Căutare după nume");

        VBox searchLayout = new VBox(10);
        searchLayout.setStyle("-fx-padding: 20;");

        Label instructionLabel = new Label("Introduceți numele gadgetului:");
        TextField searchField = new TextField();
        searchField.setPromptText("Nume gadget");

        ListView<String> resultsList = new ListView<>();

        Button searchButton = new Button("Caută");
        searchButton.setOnAction(event -> {
            String query = searchField.getText();

            // Validare input gol
            if (query == null || query.isBlank()) {
                resultsList.getItems().clear();
                resultsList.getItems().add("Introduceți un nume valid pentru căutare.");
                return;
            }

            query = query.toLowerCase(); // Transformăm în litere mici pentru căutare insensibilă la majuscule
            resultsList.getItems().clear();

            boolean found = false;

            for (Gadget gadget : gadgeturi) {
                try {
                    String model = gadget.getModel(); // Obținem modelul gadgetului
                    if (model != null && model.toLowerCase().contains(query)) {
                        resultsList.getItems().add(gadget.toString());
                        found = true;
                    }
                } catch (Exception e) {
                    // În cazul unei erori neașteptate, adăugăm un mesaj în listă
                    resultsList.getItems().add("Eroare la procesarea unui gadget.");
                }
            }

            // Dacă nu am găsit rezultate
            if (!found) {
                resultsList.getItems().add("Nu s-au găsit rezultate.");
            }
        });

        searchLayout.getChildren().addAll(instructionLabel, searchField, searchButton, resultsList);

        Scene searchScene = new Scene(searchLayout, 400, 300);
        searchByNameStage.setScene(searchScene);
        searchByNameStage.show();
    }

}