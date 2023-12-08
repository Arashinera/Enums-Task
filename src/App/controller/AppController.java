package App.controller;

import App.model.AppModel;
import App.view.AppView;

public class AppController {

    //Запуск програми :
    public void runApp() {
        AppView view = new AppView();
        AppModel model = new AppModel();

        //Використання try-catch для обробки вийнятків :
        try {
            view.getOutput(model.getAnswer(view.getData()));
        } catch (Exception e) {
            view.getOutput("Exception: Wrong answer. Please, input int. number next time;");
        }

    }
}
