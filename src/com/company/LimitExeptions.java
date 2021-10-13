package com.company;

public class LimitExeptions extends Exception {
    private double remainingAmount;

    public LimitExeptions(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;

    }

    public double getRemainingAmount() {
        return remainingAmount;
    }
}
