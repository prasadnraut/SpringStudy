package com.oops;

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//It means more than one form.
		//That is, the same entity (method or operator or object) can perform different operations in different scenarios.
//In below example single render() method behaves differently in different classes. Or, we can say render() is polymorphic.
		
		// create an object of Square
		Square square = new Square();
		square.render();
		
		// create an object of Triangle
		Triangle triangle = new Triangle();
		triangle.render();
		
//We can achieve polymorphism by following ways
		//1. Method overriding
		//2. Method Overloading
//1. Method overriding		
		
	}
}

class Polygon{
	public void render() {
		System.out.println("Its a polygon");
	}
} 

class Square extends Polygon{
	public void render() {
		System.out.println("Its a Square");
	}
}
class Triangle extends Polygon{
	public void render() {
		System.out.println("Its a Triangle");
	}
}
