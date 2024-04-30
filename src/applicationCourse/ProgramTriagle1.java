package applicationCourse;

import java.util.Scanner;

public class ProgramTriagle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double perimetroY,perimetroX;
        double triagleYSide1, triagleYSide2, triagleYSide3, triagleXSide1, triagleXSide2, triagleXSide3;
        double sY, sX;
        System.out.println("Digite o perimetro do tringulo 1");
        triagleYSide1 = sc.nextDouble();
        triagleYSide2 = sc.nextDouble();
        triagleYSide3 = sc.nextDouble();
        System.out.println("Digite o perimetro do tringulo 2");
        triagleXSide1 = sc.nextDouble();
        triagleXSide2 = sc.nextDouble();
        triagleXSide3 = sc.nextDouble();

        sY = (triagleYSide1 + triagleYSide2 + triagleYSide3)/2;
        perimetroY = Math.sqrt(sY * (sY - triagleYSide1) * (sY - triagleYSide2) * (sY - triagleYSide3));
        System.out.println("A area do primeiro triangulo: " + perimetroY);

        sX = (triagleXSide1 + triagleXSide2 + triagleXSide3)/2;
        perimetroX = Math.sqrt(sX * (sX - triagleXSide1) * (sX - triagleXSide2) * (sX - triagleXSide3));
        System.out.println("A area do segundo triangulo : " + perimetroX);

        if(perimetroY > perimetroX){
            System.out.println("Triangle Y is Bigger");
        } else {
            System.out.println("Triangle X is Bigger");
        }
        sc.close();
    }
}
