package org.larsworks.javafx.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created with IntelliJ IDEA.
 * User: lkleen
 * Date: 22.04.13
 * Time: 14:01
 * To change this template use File | Settings | File Templates.
 */
public class CalculatorController implements Initializable {

    @FXML private Label lcd;
    @FXML private Button btn01;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @FXML void handleButtonAction(ActionEvent actionEvent) {
        final Object SOURCE = actionEvent.getSource();
        if(SOURCE.equals(btn01)) {
            System.out.println("click");
        }
    }
}
