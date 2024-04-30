package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

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
