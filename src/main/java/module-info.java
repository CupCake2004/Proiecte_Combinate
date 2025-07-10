module com.example.proiect_java_3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;


    requires org.jsoup;
    requires org.json;

    opens com.example.proiect_java_3 to javafx.fxml;
    exports com.example.proiect_java_3;
    exports com.example.scraper;
    opens com.example.scraper to javafx.fxml;
}
