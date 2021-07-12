package com.assignment1;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;
    public VipCustomer(){
     this("Default name",5000.00,"Default emailAddress");
    }
    public VipCustomer(String name, double creditLimit){
        this(name,creditLimit,"default@gmail.com");

    }
    public VipCustomer(String name,double creditLimit,String emailAddress)
    {

      this.name=name;
      this.creditLimit=creditLimit;
      this.emailAddress=emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
