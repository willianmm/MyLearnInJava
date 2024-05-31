package applicationCourse;

import java.util.Scanner;

public class Parnumbersd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What numbers you write");
        int nunt = sc.nextInt();
        int[] num = new int[nunt];



        int parQuantitity = 0;
        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter number");
            num[i] = sc.nextInt();
            if (num[i] % 2 == 0 ){
                parQuantitity += 1;
            }
            }
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.println("Numbers par "+ num[i]);

            }

        }
            System.out.println("Par quantity = " + parQuantitity);





    }
}
