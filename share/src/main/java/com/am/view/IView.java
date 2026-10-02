package com.am.view;

import com.am.controller.IController;

public interface IView {
    void setController(IController controller);
    void displayMessage(String message);
}
