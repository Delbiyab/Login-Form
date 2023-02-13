package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage stg;
    @Override
    public void start(Stage stage) throws IOException {
        stg = stage;
        stage.setResizable(false);
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage.setScene(new Scene(root, 800, 500));
        stage.setTitle("My App");
        stage.show();
    }


    public void go(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource("hello-view"));
        stg.getScene().setRoot(pane.getParent());
    }
    public void changeScene(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource("sceneb.fxml"));
        stg.getScene().setRoot(pane);
    }


    public static void main(String[] args) {
        launch();
    }
}