package com.assignment1;

public class ProductType extends Product {
    private int genderCode;
    private String location;

    public ProductType(int productId, String productName,
                       double productPrice, int quantity,int genderCode,String location) {
        super(productId, productName, productPrice, quantity);
        this.genderCode=genderCode;
        this.location=location;
    }

    public int getGenderCode() {
        return genderCode;
    }

    public void setGenderCode(int genderCode) {
        this.genderCode = genderCode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public void displayProductType(){
        System.out.println("Type: "+getGenderCode()+" "+getLocation());
    }
}
