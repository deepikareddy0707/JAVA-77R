package com.inheritence.task;

public class Shape {
    double calculateArea() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateCircleArea() {
        return Math.PI * radius * radius;
    }

    double calculateArea() {
        return calculateCircleArea();
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateRectangleArea() {
        return length * width;
    }

    double calculateArea() {
        return calculateRectangleArea();
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double calculateTriangleArea() {
        return 0.5 * base * height;
    }

    double calculateArea() {
        return calculateTriangleArea();
    }
}

class ShapeTest {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println(circle.calculateArea());
        System.out.println(((Circle) circle).calculateCircleArea());

        Shape rectangle = new Rectangle(4, 6);
        System.out.println(rectangle.calculateArea());
        System.out.println(((Rectangle) rectangle).calculateRectangleArea());

        Shape triangle = new Triangle(3, 7);
        System.out.println(triangle.calculateArea());
        System.out.println(((Triangle) triangle).calculateTriangleArea());
    }
}
