package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public void Discout(){
        grossSalary = grossSalary - tax;
    }

    public String toString(){
        return "employee " + name + ", $" + grossSalary;
    }
    public double Percent(double pc){
         double taxis = (grossSalary * pc) / 100;
         grossSalary += taxis;
        return grossSalary;
    }
}
