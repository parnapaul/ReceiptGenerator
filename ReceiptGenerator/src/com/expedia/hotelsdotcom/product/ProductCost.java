package com.expedia.hotelsdotcom.product;


import java.util.HashMap;
import java.util.Map;

public class ProductCost {

	public final static Map<Integer, Double> productCost = new HashMap<Integer, Double>();
	static{
		productCost.put(1,29.49);//book
		productCost.put(2,15.99);//music cd
		productCost.put(3,0.75);//chocolate snack
		productCost.put(4,20.99);//wine
		productCost.put(5,4.15);//tooth ache pill
		productCost.put(6,11.25);//pin
		productCost.put(7, 14.99);//music cd
	};
	
	public final static double CD_EXTRA_TAX=1.25;
	public final static double GENERAL_TAX=0.175;
}
