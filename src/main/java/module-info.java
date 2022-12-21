module com.example.supplychainashu1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.supplychainashu1 to javafx.fxml;
    exports com.example.supplychainashu1;
}