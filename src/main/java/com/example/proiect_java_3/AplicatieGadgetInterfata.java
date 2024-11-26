package com.example.proiect_java_3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AplicatieGadgetInterfata extends Application {

    // Metoda principală care lansează aplicația JavaFX
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Gadgeturi - Informații");

        // Crearea butoanelor pentru fiecare gadget
        Button buttonPhone = new Button("Despre telefon");
        Button buttonLaptop = new Button("Despre laptop");
        Button buttonSmartwatch = new Button("Despre smartwatch");

        // Setarea acțiunilor pentru butoane
        buttonPhone.setOnAction(e -> showGadgetInfo("Telefon", "Un telefon mobil este un dispozitiv portabil folosit pentru apeluri, mesaje și aplicații."));
        buttonLaptop.setOnAction(e -> showGadgetInfo("Laptop", "Un laptop este un computer portabil folosit pentru muncă, studii și divertisment."));
        buttonSmartwatch.setOnAction(e -> showGadgetInfo("Smartwatch", "Un smartwatch este un ceas inteligent care se conectează la telefon și oferă informații și notificări."));

        // Crearea unui layout simplu
        VBox vbox = new VBox(10, buttonPhone, buttonLaptop, buttonSmartwatch);

        // Crearea unei scene și setarea acesteia pe stage
        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Metoda care afișează o fereastră de tip alert cu informațiile despre gadget
    private void showGadgetInfo(String gadget, String info) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Informații despre " + gadget);
        alert.setHeaderText(null);
        alert.setContentText(info);
        alert.showAndWait();
    }
}