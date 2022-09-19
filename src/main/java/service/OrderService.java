package main.java.service;

import main.java.model.*;

public class OrderService {
		
	/*
	 * Méthode pour ajouter un produit dans un panier.
	 */
	public static void addProduct(Pannier pannier, Product product) {
		pannier.getProducts().add(product);
				
	}
	
	/*
	 * Méthode pour afficher le total du panier.
	 */
	
	public static int showSize(Pannier pannier) {
		return pannier.getProducts().size();
		
	}

}
