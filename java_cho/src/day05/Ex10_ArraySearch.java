package day05;

public class Ex10_ArraySearch {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5};
		int num = 4;
		boolean result = false;
		for(int i = 0; i < arr.length ; i++) {
			if(arr[i] == num) {
				result = true;
				break;
			}
		}
		if(result)
		System.out.println(num + " is in the array.");
		else
		System.out.println(num + "is not in the array.");
		if(search(arr, num))
			System.out.println(num + " is in the array.");
			else
			System.out.println(num + " is not in the array.");
		if(search(arr, 3, num))
			System.out.println(num + " is in the array.");
			else
			System.out.println(num + " is not in the array.");
	
	}
public static boolean search(int [] arr, int num) {
		for(int i = 0; i < arr.length ; i++) {
		if(arr[i] == num) {
			return true;
		}
	}
	return false;
}
public static boolean search(int [] arr, int count, int num) {
	if(arr.length < count) {
		count = arr.length;
	}
	for(int i = 0; i < count ; i++) {
	
		if(arr[i] == num) {
		return true;
	}
}
return false;
}

}
