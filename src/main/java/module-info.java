module org.example.module83 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.module83 to javafx.fxml;
    exports org.example.module83;
}