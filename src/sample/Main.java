package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    private static final String[] LIST = { "C#", "Python", "Java", "Kotlin", "C++", "JS", "TS",
            "VB", "Ruby", "F#", "Swift", "Objective C", "C", "Pascal", "Groovy"};

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        ComboBox<String> cmb = new ComboBox<>();
        cmb.setTooltip(new Tooltip());
        cmb.getItems().addAll(LIST);
        stage.setScene(new Scene(new StackPane(cmb)));
        stage.show();
        stage.setTitle("Filtered ComboBox");
        stage.setWidth(300);
        stage.setHeight(300);
        new FilteredComboBox<String>(cmb);
    }
}
