package com.assignment1;

import java.util.Date;

public class Store {
    private int customerId;
    private int productId;
    private Date shoppingDate;
    private int productQuantity;
    private Product product;

public Store(int customerId,int productId, Date shoppingDate,int productQuantity){
    this.customerId=customerId;
    this.productId=productId;
    this.shoppingDate=shoppingDate;
    this.productQuantity=productQuantity;
}

    public int getCustomerId() {
        return customerId;
    }

    public int getProductId() {
        return productId;
    }

    public Date getShoppingDate() {
        return shoppingDate;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public Product getProduct() {
        return product;
    }

    public void displayStockDetails(){
        System.out.println("Stock Details: " + (product.getQuantity()-getProductQuantity()));
    }
}
