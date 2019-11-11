
import java.util.Scanner;

class Point {
	
	private double x;
	private double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double distance(Point x) {
		return Math.sqrt( Math.pow((x.x - this.x), 2) + Math.pow(x.y - y, 2) );
	}
	
}

class Triangle {
	
	private double x;
	private double y;
	private double z;
	
	private boolean usedRoot;
	
	public Triangle(double sides[], boolean usedRoot) {
		this.x = sides[0];
		this.y = sides[1];
		this.z = sides[2];
		
		this.usedRoot = usedRoot;
	}
	
	public Triangle(Point a, Point b, Point c) {
		x = a.distance(b);
		y = b.distance(c);
		z = c.distance(a);
	}
	
	public String getType() {
		String response = "The triangle is: ";
		
		if (x == y && y == z)
			response += "EQUILATERAL ";
		else if (x != y && y != z && z != x)
			response += "SCALENE ";
		else
			response += "ISOCELES ";
		
		if (isRight())
			response += "AND RIGHT ";
		
		return response.substring(0, response.length() - 1);
	}
	
	private boolean isRight() {
		double a = Math.pow(x, 2);
		
		if (usedRoot)
			a = Math.round(a);
		double b = Math.pow(y, 2);
		double c = Math.pow(z, 2);

		return Math.round(a + b) == Math.round(c) || Math.round(a + c) == Math.round(b) || Math.round(b + c) == Math.round(a);
	}
	
	public double getArea() {
		double sp = (x + y + z) / 2;
		double a = Math.sqrt(sp * (sp - x) * (sp - y) * (sp - z));
		
		return a;
	}
	
}

public class Main {
	
//	public static Triangle getTriangleByPoints(Scanner keyb) {
//		Point sides[] = new Point[3];
//
//		for (int i = 0; i < 3; i++) {
//			System.out.println("Input x coordinate for point #" + (i+1));
//			double x = keyb.nextDouble();
//			keyb.nextLine();
//			System.out.println("Input y coordinate for point #" + (i+1));
//			double y = keyb.nextDouble();
//			keyb.nextLine();
//
//			sides[i] = new Point(x, y);
//		}
//
//		double x = sides[0].distance(sides[1]);
//		double y = sides[1].distance(sides[2]);
//		double z = sides[2].distance(sides[0]);
//		if (x + y <= z || y + z <= x|| x + z <= y) {
//			System.out.println("Error: the sides entered does not make a triangle");
//			System.exit(1);
//		}
//
//		return new Triangle(sides[0], sides[1], sides[2]);
//	}
//
//	public static Triangle getTriangleBySides(Scanner keyb) {
//		boolean usedRoot = false;
//		double sides[] = new double[3];
//
//		for (int i = 0; i < 3; i++) {
//			if (!usedRoot) {
//				System.out.println("Is side #" + (i+1) + " a square root? (Y\\N)");
//				String resp = keyb.nextLine();
//				if (resp.toUpperCase().startsWith("Y")) {
//					usedRoot = true;
//
//					System.out.println("Enter value of n in (n * sqrt(2))");
//					sides[i] = keyb.nextDouble();
//					sides[i] *= Math.sqrt(2);
//					keyb.nextLine();
//				}
//				else if (resp.toUpperCase().startsWith("N")) {
//					System.out.println("Please enter side #" + (i+1) + ": ");
//					sides[i] = keyb.nextDouble();
//					keyb.nextLine();
//				}
//				else if (!resp.toUpperCase().startsWith("N")) {
//					System.out.println("Invalid response");
//					--i;
//					continue;
//				}
//
//				if (sides[i] < 1) {
//					System.out.println("Invalid side. Try again");
//					--i;
//				}
//			}
//			else
//			{
//				System.out.println("Please enter side #" + (i+1) + ": ");
//				sides[i] = keyb.nextDouble();
//				keyb.nextLine();
//			}
//		}
//
//		if (sides[0] + sides[1] <= sides[2] || sides[1] + sides[2] <= sides[0] || sides[0] + sides[2] <= sides[1]) {
//			System.out.println("Error: the sides entered does not make a triangle");
//			System.exit(1);
//		}
//
//		return new Triangle(sides, usedRoot);
//	}
//
//	public static void main(String args[]) {
//		Scanner keyb = new Scanner(System.in);
//		System.out.println("Are you inputting 1. points or 2. sides?");
//		int choice = keyb.nextInt();
//		if (choice != 2 && choice != 1) {
//			System.out.println("Invalid choice");
//			System.exit(1);
//		}
//		keyb.nextLine();
//
//		Triangle x;
//		if (choice == 1)
//			x = getTriangleByPoints(keyb);
//		else
//			x = getTriangleBySides(keyb);
//		System.out.println(x.getType());
//		System.out.println("AREA: " + x.getArea());
//	}

}
