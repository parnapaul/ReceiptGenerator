package com.expedia.hotelsdotcom.factory;

import com.expedia.hotelsdotcom.product.Product;
import com.expedia.hotelsdotcom.tax.EntertainmentTaxPolicy;
import com.expedia.hotelsdotcom.tax.GeneralTaxPolicy;
import com.expedia.hotelsdotcom.tax.ITaxPolicy;
import com.expedia.hotelsdotcom.tax.ZeroTaxPolicy;

public class ProductFactory {

	public static Product createProduct(String type, int productId, String productName, int productQuantity){
		Product p;
		ITaxPolicy taxPolicy;
		if("cd".equalsIgnoreCase(type)){
			taxPolicy = new EntertainmentTaxPolicy(new GeneralTaxPolicy());
			p=new Product(productId, productName, productQuantity, taxPolicy);
		}else if("medical".equals(type)){
			taxPolicy = new ZeroTaxPolicy();
			p=new Product(productId, productName, productQuantity, taxPolicy);
		}else{
			taxPolicy = new GeneralTaxPolicy();
			p=new Product(productId, productName, productQuantity, taxPolicy);
		}
		return p;
		
	}
}
