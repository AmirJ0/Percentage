package deep.percentage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * @author AmirJ0
 * @since 2024-5-22
 * Controller Class: {@link deep.percentage.PerController}
 * Main class and javafx Application
 * @version 1.0
 */
public class PerApplication extends Application {
    /**
     *
     * @param stage the primary stage for this application, onto which
     * the application scene can be set.
     * Applications may create other stages, if needed, but they will not be
     * primary stages.
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PerApplication.class.getResource("per-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle("Percentage Application");
        stage.setX(10);
        stage.setY(10);
        stage.show();

    }

    public static void main(String[] args) {
        launch();

    }

}