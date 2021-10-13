package com.company;

public class BankAccount {
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    private double amount = 0;
    private double sum;
    public void deposit (double sum){
        System.out.println("Вы пополнили ваш счет на : ");
        setAmount(getAmount() + sum);
    }
    public void withDraw(int sum) throws LimitExeptions {
        if(sum > getAmount()){
            throw new LimitExeptions ("У тебя нет такой суммы((( ", sum);
        }else{
            setAmount(getAmount() - sum);
        }
    }
}

