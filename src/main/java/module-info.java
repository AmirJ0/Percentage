module deep.percentage {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires jdk.compiler;


    opens deep.percentage to javafx.fxml;
    exports deep.percentage;
}