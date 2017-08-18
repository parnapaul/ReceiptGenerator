package com.expedia.hotelsdotcom.tax;

public class ZeroTaxPolicy implements ITaxPolicy {

	@Override
	public double getTax(double cost){
		return 0;
	}
}
