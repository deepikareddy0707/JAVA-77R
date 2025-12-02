package variables;

public class combineStaticLocal {
    static int rate = 10;  

    static void calculateAmount() {
        int amount = 500;  
        int total = amount + rate;
        System.out.println("Total Amount: " + total);
    }

    public static void main(String[] args) {
        calculateAmount();  
}
}
