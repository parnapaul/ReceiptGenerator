package com.expedia.hotelsdotcom.cart;

import com.expedia.hotelsdotcom.factory.ProductFactory;
import com.expedia.hotelsdotcom.product.Product;

public class ShoppingCartHandler {

	private ShoppingCart cart;
	public static void main(String[] args) {
		ShoppingCartHandler h = new ShoppingCartHandler();
		h.startShopping();
		
	}
	private void startShopping() {
		cart = new ShoppingCart();
		Product p1 = ProductFactory.createProduct("general", 1,"book",1);
		Product p2 = ProductFactory.createProduct("cd",2,"cd",1);
		Product p3 = ProductFactory.createProduct("general",3,"snack",1);
		cart.addProduct(p1);
		cart.addProduct(p2);
		cart.addProduct(p3);
		cart.generateReceipt();
	}

}
