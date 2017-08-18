package com.expedia.hotelsdotcom.tax;

import com.expedia.hotelsdotcom.product.ProductCost;

public class EntertainmentTaxPolicy extends TaxPolicyDecorator {

	public EntertainmentTaxPolicy(ITaxPolicy taxPolicy) {
		super(taxPolicy);
	}

	@Override
	public double getTax(double cost){
		return taxPolicy.getTax(cost) + ProductCost.CD_EXTRA_TAX;
	}
}
