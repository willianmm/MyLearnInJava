package applicationCourse;

import java.util.Scanner;

public class BiggerValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers?");
        double [] value = new double[sc.nextInt()];
        for (int i = 0; i < value.length; i++) {
            System.out.println("enter value");
            value[i] = sc.nextDouble();
        }
        double maior = value[0];
        int posmaior = 0;

        for (int i=1; i<value.length; i++) {
            if (value[i] > maior) {
                maior = value[i];
                posmaior = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f\n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);

        sc.close();
    }
}
