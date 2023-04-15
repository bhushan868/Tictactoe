module com.example.tictactoeap {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tictactoeap to javafx.fxml;
    exports com.example.tictactoeap;
}