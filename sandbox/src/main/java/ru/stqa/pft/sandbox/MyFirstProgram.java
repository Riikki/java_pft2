package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {
		hello("Anastasiya");

		double l = 5;
		System.out.println(area(l));

		double a = 4;
		double b = 4;
		System.out.println(area(a,b));
	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}

	public static double area(double l) {
		return l*l;
	}
		public static double area(double a, double b) {
		return a*b;
}
	}



