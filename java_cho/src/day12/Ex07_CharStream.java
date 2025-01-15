package day12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex07_CharStream {
	static String fileName = "src/day12/char_stream.txt";
	public static void main(String[] args) {
		try(FileReader fr = new FileReader("src/day12/char_stream.txt")){
			while(fr.ready()) {
				char ch = (char)fr.read();
				System.out.println(ch);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File cannot be found.");
		} catch (IOException e) {
			System.out.println("IO Exception.");
		}
		System.out.println();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		try(FileWriter fw = new FileWriter(fileName)){
			String str = "가나다123";
			fw.write(str);
			fw.flush();
			System.out.println(str + "has been recorded.");
		} catch (IOException e) {
			System.out.println("IO Exception.");
		}

	}

}
