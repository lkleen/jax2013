package org.larsworks.javafx.test;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 * Created with IntelliJ IDEA.
 * User: lkleen
 * Date: 22.04.13
 * Time: 10:26
 * To change this template use File | Settings | File Templates.
 */
public class WebViewMain extends Application {

    public static void main(String... args) {
        launch(args);

    }


    @Override
    public void start(Stage stage) {
        stage.setTitle("webview");

        BorderPane panel = new BorderPane();

        Scene scene = new Scene(panel, 200, 200);
        stage.setScene(scene);

        WebView webView = new WebView();
        webView.getEngine().load("http://larsworks.de");
        webView.autosize();

        panel.setCenter(webView);

        stage.show();
    }

    @Override
    public void stop() throws Exception {
        super.stop();    //To change body of overridden methods use File | Settings | File Templates.
    }
}
