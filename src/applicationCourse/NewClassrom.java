package applicationCourse;

import entities.AprovClass;

import java.util.Scanner;

public class NewClassrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many students");
        int num = sc.nextInt();
        sc.nextLine();
        AprovClass[] aprove = new AprovClass[num];
        String name;
        double note1;
        double note2;
        for (int i = 0; i < aprove.length; i++) {
            System.out.println("enter name ");
            name = sc.next();
            System.out.println("enter note1 ");
            note1 = sc.nextDouble();
            System.out.println("enter note2 ");
            note2 = sc.nextDouble();
            aprove[i] = new AprovClass(name, note1, note2);
        }
        double minValue = 6.0;
        double totalNote;
        System.out.println("Students aprove");
        for (int i = 0; i < aprove.length; i++) {
            totalNote = ((aprove[i].getNote1() + aprove[i].getNote2()) / 2);
            if (totalNote >= minValue){
                System.out.println(aprove[i].getName());
            }
        }
        System.out.println("reproved students");
        for (int i = 0; i < aprove.length; i++) {
            totalNote = ((aprove[i].getNote1() + aprove[i].getNote2()) / 2);
            if (totalNote < minValue){
                System.out.println(aprove[i].getName());
            }


        }
    }
}
