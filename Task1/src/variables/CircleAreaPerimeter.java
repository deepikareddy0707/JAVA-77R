package variables;

public class CircleAreaPerimeter {
    static double radius = 5;

    static void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    static void perimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of Circle: " + perimeter);
    }

    public static void main(String[] args) {
        area();       
        perimeter();  
    }
}

