package applicationCourse;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers you want whitter; ");
        int num = sc.nextInt();
        int[] numbers = new int[num];
        for (int i = 0; i < num; i++) {
            sc.nextLine();
            System.out.println("write more one number");
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++){
            if (numbers[i] < 0 ){
                System.out.println("Negatives numbers" + numbers[i]);
            }
        }
        sc.close();


    }
}
