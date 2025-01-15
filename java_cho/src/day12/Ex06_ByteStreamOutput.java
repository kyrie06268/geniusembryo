package day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06_ByteStreamOutput {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("src/day12/byte_stream2.txt");){
			for(char ch = 'a'; ch <= 'z'; ch++) {
				fos.write(ch);
			}
		
		} catch (FileNotFoundException e) {
			System.out.println("File cannot be found.");
		} catch (IOException e) {
			System.out.println("IO Exception.");
		}


	}

}
