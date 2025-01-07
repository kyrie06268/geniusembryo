package day05;

public class Ex11_ArrWithNoRep {

	public static void main(String[] args) {
		int arr[] = new int[6];
		int count = 0;
		
		while(count < arr.length) {
			int r = (int)(1+10*Math.random());
			if(!search(arr, count, r)) {
				
				arr[count++] = r;
				
			}
		
			
		}
		for(int i = 0; i < 6; i ++) {
			System.out.print(arr[i]+" ");
		}
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
