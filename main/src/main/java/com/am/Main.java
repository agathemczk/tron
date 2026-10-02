package com.am;

import com.am.controller.Controller;
import com.am.controller.IController;
import com.am.model.IModel;
import com.am.model.Model;
import com.am.view.IView;
import com.am.view.View;

public enum Main {
    ;

    public static void main(String[] args) {
        IModel model = new Model();
        IView view = new View(model);
        IController controller = new Controller(model, view);
        controller.proceed();
    }
}