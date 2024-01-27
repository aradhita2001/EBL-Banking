package com.wecp.progressive.entity;

import java.util.Date;

public class Transactions {
    private int trasactionId;
    private int accountId;
    private double amount;
    private Date transactionDate;
    private String transactionType;

    public Transactions(int trasactionId, int accountId, double amount, Date transactionDate, String transactionType) {
        this.trasactionId = trasactionId;
        this.accountId = accountId;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;
    }

    public Transactions() {
    }

    public int getTrasactionId() {
        return trasactionId;
    }

    public void setTrasactionId(int trasactionId) {
        this.trasactionId = trasactionId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

}