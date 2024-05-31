package entitiesII;

import java.util.Scanner;

public class FuncList {
    private Integer id;
    private String name;
    private Double wage;

    public FuncList(Integer id, String name, Double wage) {
        this.id = id;
        this.name = name;
        this.wage = wage;
    }

    public void Increase(double percent){
        double wagePlus = this.wage * (percent / 100);
        this.wage += wagePlus;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWage() {
        return wage;
    }

    @Override
    public String toString() {
        return " id "
                + this.id
                + " name "
                + this.name
                + " wage "
                + this.wage;
    }
}
