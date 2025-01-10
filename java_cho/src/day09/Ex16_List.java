package day09;

import java.util.ArrayList;

import lombok.EqualsAndHashCode;
import lombok.ToString;

public class Ex16_List {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(10);
		list.add(20);
		System.out.println(list);
		list.set(1, 30);
		System.out.println(list);
		list.remove((Integer)20);
		System.out.println(list);
		System.out.println(list.size());
		ArrayList<Point> list2 = new ArrayList<Point>();
		list2.add(new Point(1,1));
		list2.add(new Point(10,10));
		System.out.println(list2);
		list2.add(new Point(10,10));
		list2.add(new Point(-1,-1));
		list2.remove(new Point(1, 1));
		System.out.println(list2);
		list2.set(1, new Point(2, 3));
		System.out.println(list2);
	}

}
@ToString
@EqualsAndHashCode
class Point{
	int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
