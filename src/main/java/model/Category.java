package main.java.model;

import java.util.ArrayList;
import java.util.List;

public class Category {
	
	 private String name;
	 private String description;
	 private List<Product> products = new ArrayList<>();
	 private List<Category> categorys = new ArrayList<>();


	    public Category(String name, String description){
	        this.name = name;
	        this.description = description;
	    }


	    public String getName(){
	        return name;
	    }
	    
	    public String getDescription(){
	        return description;
	    }
	    
	    public void setName(String newName) {
	    this.name = newName;
	    }
	    
	    public void setDescription(String newDescritpion) {
	    this.description = newDescritpion;
	    }
	    
	    
	    public List<Product> getProducts(){
	        return products;
	    }
	    
	    public List<Category> getCategorys(){
	        return categorys;
	    }
	    
	    

}
