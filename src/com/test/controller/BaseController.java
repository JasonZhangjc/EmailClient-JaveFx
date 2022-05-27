package com.test.controller;

import com.test.EmailManager;
import com.test.view.ViewFactory;

public abstract class BaseController {

    /*This class is the AbstractController*/

    private EmailManager emailManager;
    private ViewFactory viewFactory;
    private String fxmlName;

    public BaseController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        this.emailManager = emailManager;
        this.viewFactory = viewFactory;
        this.fxmlName = fxmlName;
    }
}
