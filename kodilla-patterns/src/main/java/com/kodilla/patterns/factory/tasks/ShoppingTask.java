package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    boolean taskExecuted;

    public ShoppingTask(final String taskName, final String whatToBuy,
                        final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        this.taskExecuted = false;
    }

    @Override
    public void executeTask() {
        System.out.println("Buying " + whatToBuy);
        taskExecuted = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return true;
    }
}