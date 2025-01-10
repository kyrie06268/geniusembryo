package day09;

public class Ex14_Generic {

	public static void main(String[] args) {
		Array<String> list1 = new Array<String>(10);
		list1.set(0, "abc");
		list1.set(1, "123");
		System.out.println(list1.get(0));
		System.out.println("----------------");
		list1.print();
		print(list1.get(0));
		
	}
public static <T> void print(T t) {
	if(t == null)
		return;
	System.out.println(t);
}
}
class Array<T>{
	private T [] list;
	public void setList(T [] list) {
		this.list = list;
	}
	public T [] getList() {
		return list;
	}
	public Array(int size) {
		list=(T[]) new Object[size];
	}
	public T set(int index, T data) {
		if(index < 0 || index >= list.length) {
			return null;
		}
		T temp = list[index];
		list[index] = data;
		return temp;
	}
	public T get(int index) {
		if(index < 0 || index >= list.length) {
			return null;
		}
		return list[index];
	}
	public void print() {
		for (T temp : list) {
			if(temp != null) {
				System.out.println(temp);
			}
			
		}
	}
}
