package com.am.controller;

import com.am.model.IModel;
import com.am.view.IView;

public class Controller implements IController {
    private final IModel model;
    private final IView view;

    public Controller(final IModel model, final IView view) {
        this.model = model;
        this.view = view;
        this.view.setController(this);
    }


    @Override
    public void proceed() {
        this.view.displayMessage("coucou");
    }
}
