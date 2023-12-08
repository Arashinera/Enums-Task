package App.view;

import java.util.Scanner;
import java.util.Locale;

public class AppView {

    Scanner input = new Scanner(System.in);

    //Отримання даних :
    public int getData() {
        input.useLocale(Locale.ENGLISH);
        System.out.println("""
                Please, input traffic light color :
                1) Red
                2) Yellow
                3) Green""");
        return input.nextInt();
    }

    //Виведення даних :
    public void getOutput(String output) {
        input.close();
        System.out.println(output);
    }
}
