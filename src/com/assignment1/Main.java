package com.assignment1;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
//        Customer customer = new Customer();
//        customer.setCustomerId(1);
//        customer.setCustomerName("John");
//	    customer.displayCustomerInformation();
//	    Product product = new Product();
//	    product.setProductId(1);
//	    product.setProductName("ToothPaste");
//	    product.setProductPrice(24.5);
//	    product.setQuantity(12);
//	    product.displayProductDetails();
////	    product.displayStockDetails();
//	    Store store = new Store(product);
//	    store.setCustomerId(customer.getCustomerId());
//	    store.setProductId(product.getProductId());
//	    store.setProductQuantity(2);
//	    store.displayStockDetails();
//	    CustomerGender gender = new CustomerGender();
//	    gender.setCustomerGender("Male");
//	    gender.displayCustomerGender();
//	    ProductType type = new ProductType();
//	    type.setGenderCode(1203);
//	    type.setLocation("Houston");
//	    type.displayProductType();
//		VipCustomer person1 = new VipCustomer();
//		System.out.println(person1.getName());
//
//		VipCustomer person2 = new VipCustomer("Bob", 25000.00);
//		System.out.println(person2.getName());
//
//		VipCustomer person3 = new VipCustomer("Tim", 100.00, "tim@email.com");
//		System.out.println(person3.getName());
//		System.out.println(person3.getEmailAddress());

//		CustomerGender customer = new CustomerGender(1,"Bob","Male");
//		System.out.println("ID: "+customer.getCustomerId());
//		System.out.println("CustomerName: "+customer.getCustomerName());
//		System.out.println("Gender: "+customer.getCustomerGender());


		StockShare stocks = new StockShare("Steve",1,4,
                3,7);
		stocks.companyName("Robinhood");
		stocks.price(20);
		stocks.eligible();










    }
}
