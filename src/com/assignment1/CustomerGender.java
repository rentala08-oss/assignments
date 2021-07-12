package com.assignment1;

public class CustomerGender extends Customer {
    private String customerGender;

    public CustomerGender(int customerId, String customerName, String customerGender) {
        super(customerId, customerName);
        this.customerGender=customerGender;
    }

    public String getCustomerGender() {
        return customerGender;
    }
    public void displayCustomerGender(){
        System.out.println("Gender: "+getCustomerGender());
    }
}
