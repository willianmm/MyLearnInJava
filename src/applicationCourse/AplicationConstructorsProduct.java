package applicationCourse;

import entities.Product;
import entities.ProductConstructors;

import java.util.Scanner;

public class AplicationConstructorsProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name ");
        String name = sc.next();
        System.out.print("Price ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock \n");
        int quantity = sc.nextInt();

        ProductConstructors prod = new ProductConstructors(name, price, quantity);
        prod.setPrice(0);

        System.out.println(prod.toString());
        System.out.println("Enter new quantity products \n");
        prod.addProducts(sc.nextInt());
        System.out.println(prod.toString());
        System.out.println("products sale\n");
        prod.Remove(sc.nextInt());
        System.out.println(prod.toString());





        sc.close();

    }
}
