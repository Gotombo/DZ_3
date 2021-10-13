package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        if (amount == 0) {
            amount = sum;
        } else {
            System.out.println(amount + sum);
        }
    }

    public void withDraw(int sum) throws LimitExeptions {
        if (sum > amount) {
            throw new LimitExeptions("У вас меньше денег на счету(((", amount);
        }
        System.out.println(amount = amount - sum);
    }
}