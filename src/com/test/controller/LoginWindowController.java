package com.test.controller;

import com.test.EmailManager;
import com.test.view.ViewFactory;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginWindowController extends BaseController {

    /*The Singleton architecture is to add a new class
    * called 'Singleton' to realize the communication
    * between all controllers */

    @FXML
    private TextField emailAddressField;

    @FXML
    private Label errorLabel;

    @FXML
    private TextField passwordField;

    public LoginWindowController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        super(emailManager, viewFactory, fxmlName);
    }

    @FXML
    void loginButtonAction() {
        System.out.println("click!!!");
    }

}
