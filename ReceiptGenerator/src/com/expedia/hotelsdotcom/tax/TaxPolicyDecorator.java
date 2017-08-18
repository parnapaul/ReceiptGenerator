package com.expedia.hotelsdotcom.tax;

public class TaxPolicyDecorator implements ITaxPolicy {

	ITaxPolicy taxPolicy;
	
	public TaxPolicyDecorator(ITaxPolicy taxPolicy) {
		super();
		this.taxPolicy = taxPolicy;
	}

	@Override
	public double getTax(double cost) {
		return taxPolicy.getTax(cost);
	}

}
