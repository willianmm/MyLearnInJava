package entities;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double Converter(double dollar, double quantity){
        double value = quantity * dollar;
        double tax = value * IOF;


        return  value += tax;


    }


}
