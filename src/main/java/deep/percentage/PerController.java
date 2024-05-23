package deep.percentage;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class PerController implements Initializable {

    @FXML
    public AnchorPane mainPane;
    public VBox inputVbox;
    public HBox inputTrueMarksHbox;
    public TextField allMarkNum;
    public HBox inputFalseMarksHbox;
    public TextField trueMarkNum;
    public HBox inputAllMarksHbox;
    public TextField falseMarkNum;
    public HBox actionBtn;
    public Button calculateBtn;
    public HBox footer;
    public Hyperlink githubLink;
    public ImageView iconView;
    public ChoiceBox<String> choiceMode;
    public Label result;
    public Label errorBox;

    //Fields
    public String[] mode = {"نمره منفی", "بدون نمره منفی"};
    public String modeSelected;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        choiceMode.getItems().addAll(mode);
        choiceMode.setOnAction(this::modeSelect);
    }

    public void modeSelect(Event event){
        modeSelected = choiceMode.getValue();
    }

    public void githubLinkAction(){
        Desktop desktop = java.awt.Desktop.getDesktop();
        try {
            URI githubUri = new URI("https://github.com/AmirJ0");
            desktop.browse(githubUri);
        } catch (URISyntaxException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}