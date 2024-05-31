package applicationCourse;

import entities.PersonalAges;

import java.util.Scanner;

public class MostOlder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many peoples participated? ");
        int num = sc.nextInt();


        PersonalAges[] psg = new PersonalAges[num];
        for (int i = 0; i < psg.length;i++) {
            System.out.println("Enter name");
            String name = sc.next();
            System.out.println("Enter age");
            int age = sc.nextInt();
            psg[i] = new PersonalAges(name, age);
        }
        int ageHight = psg[0].getAge();
        String person = psg[0].getName();
        for (int i = 0; i < psg.length; i++) {
            if (psg[i].getAge() > ageHight){
                person = psg[i].getName();

            }

        }
        System.out.println("The most older person is: " + person);





    }
}
