package com.expedia.hotelsdotcom.product;

public interface IProduct {

	
	public String getProductName();
	public int getProductQuantity();
	public double getProductCostPerUnit();
	public double getTotalProductCost();
	public double getTax();
}
