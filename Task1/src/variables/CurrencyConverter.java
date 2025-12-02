package variables;

public class CurrencyConverter {

	static double dollarRate = 84.5;  

    static void convertToINR(double usd) {
        double inr = usd * dollarRate;
        System.out.println(usd + " USD = " + inr + " INR");
    }

    public static void main(String[] args) {
        convertToINR(1);     
        convertToINR(2);    
        convertToINR(3);    
    }
}