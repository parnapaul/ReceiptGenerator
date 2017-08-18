package com.expedia.hotelsdotcom.product;

import com.expedia.hotelsdotcom.tax.ITaxPolicy;

public class Product implements IProduct {

	private int productId;
	private String productName;
	private int productQuantity;
	private double totalProductCost;
	private ITaxPolicy taxPolicy;
	
	public Product(int productId, String productName, int productQuantity, ITaxPolicy taxPolicy) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.totalProductCost = ProductCost.productCost.get(productId) * this.productQuantity;
		this.taxPolicy = taxPolicy;
	}

	@Override
	public String getProductName() {
		return this.productName;
	}

	@Override
	public int getProductQuantity() {
		return this.productQuantity;
	}

	@Override
	public double getProductCostPerUnit() {
		return ProductCost.productCost.get(productId);
	}

	@Override
	public double getTotalProductCost() {		
		return this.totalProductCost;
	}

	@Override
	public double getTax() {
		return this.taxPolicy.getTax(totalProductCost);
	}

}
