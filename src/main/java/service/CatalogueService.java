package main.java.service;

import main.java.model.*;

public class CatalogueService {
	
	/*
	 * Méthode pour créer un nouveau produit.
	 */
	public static Product newProduct(String name, long price, int stock){
        return new Product(name,price,stock);
    }

	
	/*
	 * Méthode pour créer une nouvelle catégorie.
	 */

    public static Category newCategory(String nameCategory, String description){;
        return new Category(nameCategory, description);
    }
    
    /*
     * Méthode pour ajouter un produit dans une catégorie.
     */
    
    public static void addProduct(Category category, Product product) {
    	category.getProducts().add(product);	
    }
    
    /*
     * Méthode pour ajouter une catégorie dans une catégorie.
     */
    
   public static void addCategory(Category category, Category subCategory) {
	   	category.getCategorys().add(subCategory);
    	
    }
    
    

}
