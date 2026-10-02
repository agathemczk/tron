package com.am.view;

import com.am.controller.IController;
import com.am.model.IModel;
import com.am.textwindow.TextWindow;
import com.am.textwindow.TextWindowSettings;

import java.awt.*;

public class View implements IView {
    private final IModel model;
    private IController controller;
    private TextWindow textWindow;

    public View(final IModel model) {
        this.model = model;
        TextWindowSettings textWindowSettings = new TextWindowSettings();
        textWindowSettings.setScreenWidth(136);
        textWindowSettings.setScreenHeight(43);
        textWindowSettings.setTitle("tronnn");
        textWindowSettings.setFontSize(11f);
        textWindowSettings.setBackgroundColor(Color.blue);
        textWindowSettings.setForegroundColor(Color.red);
        this.textWindow = new TextWindow(textWindowSettings);
        this.textWindow.setVisible(true);
    }

    @Override
    public void setController(final IController controller) {
        this.controller = controller;
    }

    @Override
    public void displayMessage(final String message) {
        this.textWindow.display(message);
    }
}
