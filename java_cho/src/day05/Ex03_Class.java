package day05;

public class Ex03_Class {

	public static void main(String[] args) {
	String name = "Alvin";
	int count = 100;
	System.out.println("Name : " + name + "-" + count + " times.");
	Record r1 = new Record(name, count);
	Record r2 = new Record();
	r1.print();
	record2(r1);
	r1.print();
	r2.print();
	}
public static void record1(String name, int count) {
	name = "Asher";
	count = 2;
}
public static void record2(Record r1) {
	r1.setName("Asher");
	r1.setCount(2);
}
}
class Record{
	
	private int count;
	private String name;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println("Name : " + name + "-" + count + "times.");
	}
	public Record(String name1, int count1) {
		name = name1;
		count = count1;
	}
	public Record() {
		this("Asher", 2);
	}
}
