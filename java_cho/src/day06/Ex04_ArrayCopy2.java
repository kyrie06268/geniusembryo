package day06;

public class Ex04_ArrayCopy2 {

	public static void main(String[] args) {
		Point [] points = new Point[5]; //initialize as null
		Point [] points2 = new Point[5];
		for(int i = 0; i < points.length; i++) {
			points[i] = new Point(i, i);
		}
		print(points);
		System.out.println("----------------------------------------------");
		System.arraycopy(points, 0, points2, 0, 5);
		points[0] = new Point(10,10);
		points[0].x = 100;
		print(points);
		print(points2);
		
		Point [] points3 = new Point[5];
		for(int i = 0; i < 5; i++) {
			points3[i] = new Point(points2[i]);
		}
		print(points3);
	}
	public static void print (Point[] points) {
		for(int i = 0; i<points.length; i++) {
			points[i].print();
			
		}
		
	}
	
	
}
class Point{
	int x, y;
	public Point(int x, int y) {
		this.x = x; this.y =y;
	}
	public Point(Point p) {
		this(p.x, p.y);
	}
	public void print() {
	System.out.println("(" + x +", "+ y + ")");
}
	
}