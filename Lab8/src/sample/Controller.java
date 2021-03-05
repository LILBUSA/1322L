package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public Label sumLabel;
    public TextField num1;
    public TextField num2;

    public void add(ActionEvent actionEvent) {
        int sum;
        try {
            sum = Integer.parseInt(num1.getText()) + Integer.parseInt(num2.getText());
            sumLabel.setText(String.valueOf(sum));
        }
        catch (NumberFormatException e) {
            sumLabel.setText("Please insert valid integers");
        }
    }

}
