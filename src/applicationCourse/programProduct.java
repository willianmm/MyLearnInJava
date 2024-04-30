package applicationCourse;

import entities.Product;

import java.util.Scanner;

public class programProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product prod = new Product();
        System.out.println("Enter the name ");
        prod.name = sc.next();
        System.out.print("Price ");
        prod.price = sc.nextDouble();
        System.out.print("Quantity in stock \n");
        prod.quantity = sc.nextInt();

        System.out.println(prod.toString());
        System.out.println("Enter new quantity products \n");
        prod.addProducts(sc.nextInt());
        System.out.println(prod.toString());
        System.out.println("products sale \n");
        prod.Remove(sc.nextInt());
        System.out.println(prod.toString());




        sc.close();
    }
}
