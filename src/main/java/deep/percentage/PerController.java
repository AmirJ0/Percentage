package deep.percentage;

import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class PerController {

    //fields
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
    public ImageView icon;
    public ChoiceBox choiceMode;
    public Label result;
    public Label errorBox;
}