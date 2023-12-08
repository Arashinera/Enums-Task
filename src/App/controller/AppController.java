package App.controller;

import App.model.AppModel;
import App.view.AppView;

public class AppController {

    public void runApp() {
        AppView view = new AppView();
        AppModel model = new AppModel();
        try {
            view.getOutput(model.getAnswer(view.getData()));
        } catch (Exception e) {
            view.getOutput("Exception: Wrong answer. Please, input int. number next time;");
        }

    }
}
