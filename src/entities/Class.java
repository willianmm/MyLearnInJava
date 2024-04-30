package entities;

public class Class {
    public String nameStudent;
    public double firstQuarter;
    public double secondQuarter;
    public double threeQuarter;


    public double Note() {
        return firstQuarter + secondQuarter + threeQuarter;
    }

    public double FinalNote(){
        if (Note() < 60){
            return 60 - Note();
        } else {
            return 0.0;
        }
    }
}

