package org.larsworks.javafx.calculator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Created with IntelliJ IDEA.
 * User: lkleen
 * Date: 22.04.13
 * Time: 14:58
 * To change this template use File | Settings | File Templates.
 */
public class CalculatorMain extends Application {

    public static void main(String... args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(new Calculator().load());
        stage.setScene(scene);
        stage.show();
    }
}
