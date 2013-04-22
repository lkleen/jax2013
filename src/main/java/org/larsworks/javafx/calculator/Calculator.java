package org.larsworks.javafx.calculator;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * User: lkleen
 * Date: 22.04.13
 * Time: 14:59
 * To change this template use File | Settings | File Templates.
 */
public class Calculator {

    public Parent load() throws Exception {
        URL url = getClass().getClassLoader().getResource("calculator.fxml");
        FXMLLoader loader = new FXMLLoader(url);
        return (Parent) loader.load();
    }

}
