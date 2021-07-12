package com.assignment1;

public class Customer {
    private int customerId;
    private String customerName;

    public Customer(int customerId,String customerName){
        this.customerId=customerId;
        this.customerName=customerName;
    }
    public int getCustomerId() {
        return customerId;
    }
    public String getCustomerName(){
        return customerName;
    }
    public void displayCustomerInformation(){
        System.out.println("Customer details: "+getCustomerId()+" "+getCustomerName());
    }
}
