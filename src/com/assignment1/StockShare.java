package com.assignment1;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class StockShare implements IStocks {
    private String customerName;
    private int customerId;
    private double premiumStocks;
    private double regularStocks;
    private double totalStocks;
    private boolean eligible;

    public StockShare() {
    }

    public StockShare(String customerName, int customerId, double premiumStocks, double regularStocks, double totalStocks) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.premiumStocks = premiumStocks;
        this.regularStocks = regularStocks;
        this.totalStocks = totalStocks;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public double getPremiumStocks() {
        return premiumStocks;
    }

    public void setPremiumStocks(double premiumStocks) {
        this.premiumStocks = premiumStocks;
    }

    public double getRegularStocks() {
        return regularStocks;
    }

    public void setRegularStocks(double regularStocks) {
        this.regularStocks = regularStocks;
    }

    public double getTotalStocks() {
        return totalStocks;
    }

    public void setTotalStocks(double totalStocks) {
        this.totalStocks = totalStocks;
    }

    public boolean isEligible() {
        return eligible;
    }

    public void setEligible(boolean eligible) {
        this.eligible = eligible;
    }

    @Override
    public void companyName(String companyName) {
        System.out.println("Welcome to " + companyName);
    }

    @Override
    public void price(double stockPrice) {
        System.out.println("The price for the stock purchased is: " + "$" + stockPrice);
    }

    @Override
    public boolean eligible() {
        if (totalStocks >= 5) {
            eligible = true;
            System.out.println("Eligible to apply");
            customerDetails();
        } else {
            System.out.println("Not eligible");
            eligible = false;
        }
        return eligible;
    }

    public void customerDetails(){
        System.out.println("Customer name: " + getCustomerName() + "\n" + "Customer ID: "
                + getCustomerId() + "\n" + "Premium Stocks: " + getPremiumStocks() + "\n" + "Regular Stocks: " + getRegularStocks() + "\n" + "Total number of Stocks: " + getTotalStocks());
    }

}
