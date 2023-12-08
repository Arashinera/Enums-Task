package App.utils;

public enum TrafficLight {
    RED("The traffic light color is red. Please, stop!"),
    YELLOW("The traffic light color is yellow. Get ready!"),
    GREEN("The traffic light color is green. GO !!!");

    private final String color;

    TrafficLight(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
