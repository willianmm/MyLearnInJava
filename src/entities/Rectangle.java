package entities;

public class Rectangle {
    public double width;
    public double height;


    public double Area(){
        return this.width * this.height;
    }
    public double Perimeter(){
        return (this.width * this.height)*2;
    }
    public double Diagonal(){
        double l = Math.pow(this.width,2);
        double h = Math.pow(this.height,2);
        double som = l + h;
        return Math.sqrt(som);
    }
}
