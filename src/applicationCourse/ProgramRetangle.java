package applicationCourse;

import entities.Rectangle;

import java.util.Scanner;

public class ProgramRetangle {
    public static void main(String[] args) {
        Rectangle retangle = new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width on retangle: ");
        retangle.width = sc.nextDouble();
        System.out.println("Enter height on retangle: ");
        retangle.height = sc.nextDouble();


        System.out.println("Area at retangle this: " + retangle.Area());
        System.out.println("Perimeter at retangle this: " + retangle.Perimeter());
        System.out.println("Diagonal at retangle this: " + retangle.Diagonal());

    }
}
