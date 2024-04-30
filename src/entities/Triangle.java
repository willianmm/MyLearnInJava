package entities;

public class Triangle {
        public double sideA;
        public double sideB;
        public double sideC;


        public  double area(){
            double p = (this.sideA + this.sideB + this.sideC) / 2.0;
            return Math.sqrt(p * (p - this.sideA) * (p - this.sideB) * (p - this.sideC));
        }



















    }

