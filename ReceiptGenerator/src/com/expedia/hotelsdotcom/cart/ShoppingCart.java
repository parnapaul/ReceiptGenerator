package com.expedia.hotelsdotcom.cart;

import java.util.ArrayList;
import java.util.List;

import com.expedia.hotelsdotcom.product.Product;

public class ShoppingCart {

	List<Product> products = new ArrayList<Product>();
	
	public void addProduct(Product p){
		products.add(p);
	}
	
	public void generateReceipt(){
		if(products!=null && !products.isEmpty()){
			StringBuffer sb = new StringBuffer();
			double cost=0;
			double totCost=0;
			double totTax=0;
			for(Product p: products){
				cost = p.getTotalProductCost()+p.getTax();
				totCost+=cost;
				totTax+=p.getTax();
				sb.append(p.getProductQuantity() + " " + p.getProductName() + " :" + Math.ceil(cost*20)/20.0 +"\n");
			}
			sb.append("Sales Taxes:" + Math.ceil(totTax*20)/20.0 +"\n");
			sb.append("Total:" + Math.ceil(totCost*20)/20.0);
			System.out.println(sb.toString());
		}
	}
}
