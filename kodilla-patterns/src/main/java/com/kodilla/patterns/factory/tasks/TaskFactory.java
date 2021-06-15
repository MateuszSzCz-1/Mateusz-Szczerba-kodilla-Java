package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task createTask(final String taskType) {
        switch (taskType){
            case SHOPPING:
                return new ShoppingTask("buy", "ice creme", 2);
            case PAINTING:
                return new PaintingTask("paint", "red", "desk");
            case DRIVING:
                return new DrivingTask("Go Home", "Rome", "cars");
            default:
                return null;
        }
    }
}