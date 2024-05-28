package deep.percentage;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author AmirJ0
 * @since 2024-5-22
 * @version 1.0
 */
public class PerController implements Initializable {

    @FXML
    public TextField allMark;
    public TextField trueMark;
    public TextField falseMark;
    public Button calculateBtn;
    public Hyperlink githubLink;
    public ImageView iconView;
    public ChoiceBox<String> choiceMode;
    public Label result;
    public Label errorBox;

    //Fields
    public String[] mode = {"نمره منفی", "بدون نمره منفی"};
    public String modeSelected;

    //Methods
    /**
     *
     * Setting up the ChoiceBox selection
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        choiceMode.getItems().addAll(mode);
        choiceMode.setOnAction(this::modeSelect);

    }

    /**
     *
     * Get value of ChoiceBox
     */
    public void modeSelect(Event event){
        modeSelected = choiceMode.getValue();

    }

    /**
     *
     * Create GitHub Link with Hyperlink Control
     * Instance of java.awt.Desktop
     */
    public void githubLinkAction(){
        Desktop desktop = java.awt.Desktop.getDesktop();
        try {
            URI githubUri = new URI("https://github.com/AmirJ0");
            desktop.browse(githubUri);

        } catch (URISyntaxException | IOException e) {
            throw new RuntimeException(e);

        }

    }

    /**
     *
     * Check user inputs if they are Number and check range
     */
    public void checkInputs(){
        try {
            errorBox.setText("");
            result.setText("");

            String allMark = this.allMark.getText().trim();
            String trueMark = this.trueMark.getText().trim();
            String falseMark = this.falseMark.getText().trim();

            if (allMark.isEmpty())
                allMark = "0";
            if (trueMark.isEmpty())
                trueMark = "0";
            if (falseMark.isEmpty())
                falseMark = "0";

            double allMarkNum = Double.parseDouble(allMark);
            double trueMarkNum = Double.parseDouble(trueMark);
            double falseMarkNum = Double.parseDouble(falseMark);

            if ((trueMarkNum + falseMarkNum) > allMarkNum)
                errorBox.setText("مقدار وارد شده نادرست است");
            if ((allMarkNum >= 1000 || allMarkNum < 0)||(trueMarkNum < 0)||(falseMarkNum > 0))
                errorBox.setText("مقدار وارد شده نادرست است");
            else
                getResult(allMarkNum, trueMarkNum, falseMarkNum);

        } catch (NumberFormatException formatException) {
            errorBox.setText("مقدار وارد شده نادرست است");

        }

    }

    /**
     *
     * @param allMarksNum Number of all marks
     * @param trueMarkNum Number of true marks
     * @param falseMarkNum Number of false marks
     * Calculate percent and print result in Label
     */
    public void getResult(double allMarksNum, double trueMarkNum, double falseMarkNum){
        double percent;

        if (modeSelected.equals("نمره منفی"))
            percent = (3 * trueMarkNum - falseMarkNum) / (3 * allMarksNum) * 100;
        else
            percent = (trueMarkNum / allMarksNum) * 100;

        result.setText(String.format("درصد شما: %.2f", percent));

    }

}
