package entities;

public class ProductConstructors {
    private String name;
    private double price;
    private int quantity;


    public ProductConstructors(){

    }

    public  ProductConstructors(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public ProductConstructors(String name, double price){
        this.name = name;
        this.price = price;

    }
    public void setName (String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        if (price == 0){
            System.out.println("error 404");
        } else {
            this.name = name;
        }
    }
    public double getQuantity(){
        return this.quantity;
    }

    public double TotalValue(){
        return quantity * price;

    }
    public void addProducts(int quantity){
        this.quantity = this.quantity + quantity;
    }
    public void Remove(int quantityMinus){
        this.quantity = this.quantity - quantityMinus;
    }

    public String toString() {
        return name
                + ", $"
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " unities, total in stock: $"
                + String.format("%.2f", TotalValue());
    }

}

