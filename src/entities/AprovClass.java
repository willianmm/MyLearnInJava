package entities;

public class AprovClass {
    private String name;
    private double note1;
    private double note2;

    public AprovClass(String name, double note1, double note2) {
        this.name = name;
        this.note1 = note1;
        this.note2 = note2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNote1() {
        return note1;
    }

    public void setNote1(double note1) {
        this.note1 = note1;
    }

    public double getNote2() {
        return note2;
    }

    public void setNote2(double note2) {
        this.note2 = note2;
    }
}
