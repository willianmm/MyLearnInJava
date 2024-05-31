package applicationCourse;

import entities.ProductsShop;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num products");
        int numProducts = sc.nextInt();
        ProductsShop[] pdv = new ProductsShop[numProducts];
        for (int i = 0; i < pdv.length; i++) {
            sc.nextLine();
            System.out.println("Name");
            String prod = sc.nextLine();
            System.out.println("price");
            double price = sc.nextDouble();
            pdv[i] = new ProductsShop(prod, price);
        }
        double sum = 0;
        for (int i = 0; i < pdv.length; i++) {
            sum += pdv[i].getPrice();
        }
        double finaly = sum / pdv.length;
        System.out.println("avarege price" +finaly);
        for (int i = 0;  i < pdv.length; i++){
            System.out.println(pdv[i].getProduct());
            System.out.println(pdv[i].getPrice());
        }

        sc.close();


    }
}
