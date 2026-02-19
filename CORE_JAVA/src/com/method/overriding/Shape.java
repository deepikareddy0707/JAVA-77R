package com.method.overriding;

class Shape {
	 public void draw() {
		 System.out.println("Drawing Shape");
	 }
}

class Circle extends Shape{
	public void draw() {
		System.out.println("Drawing Circle");
	}
}
class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}
class Test{
	public static void main(String[] args) {
		Shape shape;

        shape = new Circle();
        shape.draw();

        shape = new Square();
        shape.draw();
	}
}
