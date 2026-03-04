module com.example.artikel_fx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.artikel_fx to javafx.fxml;
    exports com.example.artikel_fx;
}