package SweetCupcake_Management_System;

public class Cupcake {
    private String id;
    private String name;
    private String category;
    private String price;
    private String quantity;
  

    public Cupcake(String id, String name, String category, String price, String quantity) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        
    }

    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public String getPrice() { return price; }
    public String getQuantity() { return quantity;}

    public String toCSV() {
        return id + "," + name + "," + category + "," + price + ","+ quantity ;
    }

    public String[] toArray() {
        return new String[]{id, name, category, price,quantity};
    }
}