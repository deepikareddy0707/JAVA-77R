package variables;

public class SquareCube {
    static int num = 5;

    static int square() {
        return num * num;
    }

    static void cube() {
        int sq = square();  
        int cube = sq * num;
        System.out.println("Cube: " + cube);
    }

    public static void main(String[] args) {
        cube();  
    }
}
