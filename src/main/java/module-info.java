module deep.percentage {
    requires javafx.controls;
    requires javafx.fxml;


    opens deep.percentage to javafx.fxml;
    exports deep.percentage;
}