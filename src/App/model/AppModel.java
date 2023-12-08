package App.model;

import App.utils.TrafficLight;

public class AppModel {

    //Обробка бізнес логіки :
    public String getAnswer(int choice) {
        String answer = "Wrong input !";
        switch (choice) {
            case 1 -> answer = TrafficLight.RED.getColor();
            case 2 -> answer = TrafficLight.YELLOW.getColor();
            case 3 -> answer = TrafficLight.GREEN.getColor();
        }
        return answer;
    }

}
