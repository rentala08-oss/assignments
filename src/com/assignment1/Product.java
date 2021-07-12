package com.assignment1;

public class Product {
    private int productId;
    private String productName;
    private double productPrice;
    private int quantity;

    public Product(int productId,String productName,double productPrice,int quantity){
        this.productId=productId;
        this.productName=productName;
        this.productPrice=productPrice;
        this.quantity=quantity;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

     public double getProductPrice() {
        return productPrice;
    }
    public int getQuantity() {
        return quantity;
    }

    public void displayProductDetails(){
        System.out.println("Product details: "+getProductId()+" "+getProductName()+" "+getProductPrice()+" "+getQuantity());
    }
}
