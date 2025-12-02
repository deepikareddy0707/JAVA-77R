package variables;

public class SwapExample {

	static int x = 10, y = 20;

    static void swap() {
        int temp = x;  
        x = y;
        y = temp;
        System.out.println("After Swapping: x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        System.out.println("Before Swapping: x = " + x + ", y = " + y);
        swap();  
    }
}