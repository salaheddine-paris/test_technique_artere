package main.java.model;

public class Product {
	private String name;
    private long price;
    private int stock;

    public Product(String name, long price, int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    
    
    
    public String getName(){
        return name;
    }
    
    public long getPrice(){
        return price;
    }

    public int getStock(){
        return stock;
    }

      
    public void setName(String newName) {
    this.name = newName;
    }

    
    public void setPrice(long newPrice) {
    this.price = newPrice;
    }

    
    public void setStock(int newStock) {
    this.stock = newStock;
    }
    


}
