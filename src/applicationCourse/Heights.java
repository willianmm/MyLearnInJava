package applicationCourse;
import entities.PersonalHeights;

import java.util.Scanner;

public class Heights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many peoples go to participated");
        int numPeople = sc.nextInt();
        sc.nextLine();
        PersonalHeights[] ph = new PersonalHeights[numPeople];
        for (int i = 0; i < ph.length ; i++) {
            System.out.println("Enter a name ");
            String name = sc.next();
            System.out.println("enter the age");
            int age = sc.nextInt();
            System.out.println("Enter the height");
            double height = sc.nextDouble();
            ph[i] = new PersonalHeights(name, age, height);
        }
        double media = 0;
        for (int i = 0; i < ph.length; i++) {
            media += ph[i].getHeight();
        }

        double valueTeen = 0;
        for (int i = 0; i < ph.length; i++) {
            if (ph[i].getAge() < 16) {
                valueTeen += 1;
            }
        }


        double averageHeight = media / ph.length;
        double minors = (valueTeen / ph.length ) * 100;
        System.out.println("Height average is: " + averageHeight);
        String result = String.format("%.0f", minors);
        System.out.println("Total minors is " + result + "%");

        for (int i = 0; i < ph.length; i++) {
            if (ph[i].getAge() < 16) {
                System.out.println("The minors age is " + ph[i].getName());

            }
        }


    }
}
