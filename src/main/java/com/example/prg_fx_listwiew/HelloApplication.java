package com.example.prg_fx_listwiew;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.*;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("KnihaFXML.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 400);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        BorderPane root = new BorderPane();
        //BorderPane borderPane = (BorderPane) fxmlLoader.getRoot();
        stage.setTitle("kniHOVNA");
        stage.setScene(scene);
        stage.show();
    }
}