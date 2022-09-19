package main.java.model;

import java.util.ArrayList;
import java.util.List;

public class Pannier {
	private String id;
	private List<Product> products = new ArrayList<>();
	
	public Pannier() {
		
	}
	
	public String getId() {
		return id;
	}
	
	public List<Product> getProducts(){
		return products;
	    }
	    
	
	

}
