module deep.percentage {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens deep.percentage to javafx.fxml;
    exports deep.percentage;
}