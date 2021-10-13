package com.company;

public class LimitExeptions extends Exception {
    private double remainingAmount;

    public LimitExeptions(String s, int sum) {
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }
    public void LimitException(String message, double remainingAmount) {


        this.remainingAmount = remainingAmount;
    }
}
