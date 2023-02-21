module com.example.ejerciciosbancolombia {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejerciciosbancolombia to javafx.fxml;
    exports com.example.ejerciciosbancolombia;
}