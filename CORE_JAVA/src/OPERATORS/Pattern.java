package OPERATORS;

public class Pattern {
    public static void main(String[] args) {
        String quote = "\"";
        String space = " ";
        String star = "*";
        String hash="#";

           
        String l1=hash + space + (quote + space).repeat(7) + "#";
        String l2 = quote + star + space.repeat(13) + star + space + quote;
        String l3 = quote + space.repeat(8) + star + space.repeat(7) + quote;
        String l4 = quote + space.repeat(3) + (star + space).repeat(5) + space.repeat(3) + quote;
        String l5 = (quote + space).repeat(10);

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
        System.out.println(l5);
    }
}

