package org.larsworks.javafx.test;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

/**
 * Created with IntelliJ IDEA.
 * User: lkleen
 * Date: 22.04.13
 * Time: 10:26
 * To change this template use File | Settings | File Templates.
 */
public class CssMain extends Application {

    public static void main(String... args) {
        launch(args);

    }


    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("jfx skeleton");

        Button button = new Button("Button");
        BorderPane panel = new BorderPane();
        panel.setCenter(button);

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("plonk");
            }
        });


        Scene scene = new Scene(panel, 200, 200);
        scene.getStylesheets().add("button.css");
        button.getStyleClass().add("my-button");
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        super.stop();    //To change body of overridden methods use File | Settings | File Templates.
    }
}
