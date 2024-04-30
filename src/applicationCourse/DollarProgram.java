package applicationCourse;


import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;
public class DollarProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("What is dollar price in Real? ");
        double dollar = sc.nextDouble();
        System.out.println("How many dollar will be bought? ");
        double quantity = sc.nextDouble();

        double paid = CurrencyConverter.Converter(dollar, quantity);



        System.out.printf("Amount to be paid in reais = %.2f%n",  paid);
        sc.close();



    }
}
