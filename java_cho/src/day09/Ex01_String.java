package day09;

public class Ex01_String {

	public static void main(String[] args) {
	String fileName = "test.txt";
	String imgs [] = new String[] {"jpg", "bmp", "gif", "png"};
	int n = fileName.lastIndexOf(".");
	if(n < 0) {
		System.out.println("This file is an image file.");
		return;
	}
	boolean result = false;
	for(String img : imgs) {
		if(img.equals(fileName.substring(n + 1))){
			result = true;
			break;
		}
	}
	if(result == true) {
		System.out.println("This file is an image file.");
	}
	else
		System.out.println("This file is not an image file.");
	}

}
