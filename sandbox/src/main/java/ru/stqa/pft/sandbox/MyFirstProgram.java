package ru.stqa.pft.sandbox;

import static java.lang.Math.sqrt;

public class MyFirstProgram {

	public static void main(String[] args) {
		hello("Anastasiya");

		Square s = new Square(5);
		System.out.println(area(s));

		Rectangle r = new Rectangle(4,6);
			System.out.println(area(r));

		Point p1 = new Point(1,1);
		Point p2 = new Point(5,4);
		distance(p1,p2);

	}

	public static void distance(Point p1, Point p2){
		System.out.println(Math.pow((p2.x - p1.x),2));
		System.out.println(Math.pow((p2.y - p1.y),2));
		System.out.println(sqrt(Math.pow((p2.x - p1.x),2)+Math.pow((p2.y - p1.y),2)));
	}


	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}

	public static double area(Square s) {
		return s.l*s.l;
	}
		public static double area(Rectangle r) {
		return r.a*r.b;
}
	}



