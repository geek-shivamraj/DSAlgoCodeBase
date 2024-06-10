package com.geek.java8.streamAPI.processing.models;

public class Transaction {
    Integer amount;
    public Transaction(Integer amount) {
        this.amount = amount;
    }
    public Integer getAmount () {
        return amount;
    }
    public void setAmount (Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                '}';
    }
}
