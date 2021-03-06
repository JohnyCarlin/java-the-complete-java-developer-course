package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;

import java.io.File;

public class Controller {

    @FXML
    private Label label;

    @FXML
    private Button button4;

    public void initialize() {
        button4.setEffect(new DropShadow());
    }

    @FXML
    public void handleMouseEnter() {
        label.setScaleX(2.0);
        label.setScaleY(2.0);
    }

    @FXML
    public void handleMouseExit() {
        label.setScaleX(1.0);
        label.setScaleY(1.0);
    }
    @FXML
    public void handleClick() {
        FileChooser chooser = new FileChooser();
        File file = chooser.showOpenDialog(null);
        if(file != null) {
            System.out.println(file.getPath());
        } else {
            System.out.println("chooser was canceled");
        }
    }
}
