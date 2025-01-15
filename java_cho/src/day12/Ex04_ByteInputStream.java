package day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex04_ByteInputStream {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
		fis = new FileInputStream("src/day12/byte_stream.txt");
		int data;
		do {
			data = fis.read();
			if(data != -1) {
				System.out.print((char)data);
			}
		}while(data != -1);
		System.out.println((char)data);
		}catch(FileNotFoundException e){
		 System.out.println("File not found.");
		} catch (IOException e) {
		 System.out.println("Failed to read file.");
		}finally {
			if(fis !=null) {
				try {fis.close();}catch(IOException e) {
					e.printStackTrace();
				}
				
			}
		}

	}

}
