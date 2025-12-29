package loops;

public class EvilOdious {
    public static void main(String[] args) {
        int num = 9;
        int count = Integer.bitCount(num);

        if (count % 2 == 0)
            System.out.println(num + " is an Evil Number");
        else
            System.out.println(num + " is an Odious Number");
    }
}
