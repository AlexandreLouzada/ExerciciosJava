//package javafx-example.src.controller;
package src.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label label;

    public void onHelloButtonClick() {
        label.setText("Olá, JavaFX no VSCode! 🚀");
    }
}
