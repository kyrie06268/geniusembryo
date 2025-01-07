package day05;

public class Ex07_Initialize {

	public static void main(String[] args) {
		Point p = new Point();
		System.out.println(p.x1+", "+p.y1);
		System.out.println(p.x2+", "+p.y2);
		System.out.println(p.x3+", "+p.y3);
		System.out.println(p.x4+", "+p.y4);
		Point p2 = p;

		System.out.println(p2.x1+", "+p2.y1);
		System.out.println(p2.x2+", "+p2.y2);
		System.out.println(p2.x3+", "+p2.y3);
		System.out.println(p2.x4+", "+p2.y4);
		
		p2 = new Point(p);
		p.x1 = 100;
		
		System.out.println(p2.x1+", "+p2.y1);
		System.out.println(p2.x2+", "+p2.y2);
		System.out.println(p2.x3+", "+p2.y3);
		System.out.println(p2.x4+", "+p2.y4);
		

	}

}
class Point{
	int x1, y1;
	int x2 = 1, y2 = 1;
	int x3 = 1, y3 = 1;
	int x4 = 1, y4 = 1;
	// initialization block, instance field
	{
		x3 = 2;
		y3 = 2;
		x4 = 2;
		y4 = 2;
	}
	// class field
	static {
		
	}
	// constructor is the final initializing
	public Point() {
		x4 = 3;
		y4 = 3;
	}
public Point(Point p) {
	x1 = p.x1;
	y1 = p.y1;
	x2 = p.x2;
	y2 = p.y2;
	x3 = p.x3;
	y3 = p.y3;
	x4 = p.x4;
	y4 = p.y4;
	
}
}