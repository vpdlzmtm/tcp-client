module com.example.tcpclient {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tcpclient to javafx.fxml;
    exports com.example.tcpclient;
}