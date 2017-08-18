package com.expedia.hotelsdotcom.tax;

import com.expedia.hotelsdotcom.product.ProductCost;

public class GeneralTaxPolicy implements ITaxPolicy{
		
	@Override
	public double getTax(double cost){
		return cost*ProductCost.GENERAL_TAX;
	}

}
