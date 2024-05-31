package SecondAba;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number lines");
        int l = sc.nextInt();
        System.out.println("Enter number columns");
        int c = sc.nextInt();
        int[][] matrix = new int[l][c];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter a number for seek in list");
        int numList = sc.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] == numList) {
                    System.out.println("position is " + i + "," + j);
                    if (j > 0) {
                        System.out.println("Left " + matrix[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up " + matrix[i - 1][j]);
                    }
                    if (j < matrix[i].length - 1) {
                        System.out.println("Right " + matrix[i][j + 1]);
                    }
                    if (i < matrix.length - 1) {
                        System.out.println("Down " + matrix[i + 1][j]);
                    }
                }


            }

        }
        sc.close();

    }

}
