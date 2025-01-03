package day04;

public class Ex08_Class2 {

	public static void main(String[] args) {
		Point1 p1 = new Point1(10,10);
		p1.print();
		p1.translate(20, 20);
		p1.print();
	}

}

class Point1{
	
	private int x, y;
	
	public void setCoordinate(int x, int y) {
		this.x = x;
		this.y =y;
		
	}
	public void print() {
		System.out.println("(" + x +", "+y +")");
	}
	public void translate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Point1() {
		
	}
	public Point1(int x1, int y1) {
		translate(x1, y1);
	}
	/* public Point1(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	} */
	
	
	
}