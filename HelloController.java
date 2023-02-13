package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Alert;

import java.io.IOException;


public class HelloController {
    @FXML
    private Label username;
    @FXML
    private Label password;
    @FXML
    private TextField name;
    @FXML
    private PasswordField key;
    @FXML
    private Button log;


    public void switchTosceneb(ActionEvent event) throws IOException {
        name.toString();
        key.toString();


        HelloApplication scene2 = new HelloApplication();
        if (name.getText().equals("admin") && key.getText().equals("password"))
        {
            scene2.changeScene("hello-view.fxml");

        } else {
            Alert error = new Alert(Alert.AlertType.ERROR);
            error.setTitle("Error");
            error.setHeaderText("Invalid username/password");
            error.showAndWait();

        }
    }
}






