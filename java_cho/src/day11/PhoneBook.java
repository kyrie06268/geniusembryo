package day11;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class PhoneBook {

static Scanner scan = new Scanner(System.in);
static ArrayList<PhoneN> list = new ArrayList<PhoneN>();	
static int op;
	public static void main(String[] args) {
	
		
		do {
			
			printMenu();
			op = scan.nextInt();
			scan.nextLine();
			runMenu();
			
		}while(op != 5);
	}

	private static void runMenu() {
		switch(op) {
		case 1:
			insertPn();
			break;
		case 2:
			updatePn();
			break;
		case 3:
			deletePn();
			break;
		case 4:
			searchPn();
			break;
		case 5:
			System.out.println("Terminated.");
			break;
		default:
		}
		
	}

	private static void insertPn() {
		System.out.print("Enter name : ");
		String name = scan.nextLine();
		System.out.print("Enter phone number : ");
		String phoneN = scan.nextLine();
		PhoneN p = new PhoneN(name, phoneN);
		list.add(p);
		System.out.println("Phone number is added.");
		String regex ="^\\d{2,3}(-\\d{4}){2}$";
		if(!Pattern.matches(regex, phoneN)) {
			System.out.println("Invalid phone number.");
			return;
		}
	}

	private static void updatePn() {
		System.out.print("Enter the name you want to edit : ");
		String name = scan.nextLine();
		ArrayList<PhoneN> temp = searchPnList(name);
		for(int i = 0; i < temp.size(); i++) {
			System.out.println(i+1 + "." + temp.get(i));
		}
		System.out.println("Choose the number you want to edit : ");
		int i = scan.nextInt()-1;
		scan.nextLine();
		PhoneN p = temp.get(i);
		System.out.print("Enter name : ");
		String newName = scan.nextLine();
		System.out.print("Enter phone number : ");
		String phoneN = scan.nextLine();
		p.update(newName, phoneN);
		System.out.println("Updated.");
		
	}

	private static void deletePn() {
		System.out.print("Enter the name you want to delete : ");
		String name = scan.nextLine();
		ArrayList<PhoneN> temp = searchPnList(name);
		for(int i = 0; i < temp.size(); i++) {
			System.out.println(i+1 + "." + temp.get(i));
		}
		System.out.println("Choose the number you want to delete : ");
		int i = scan.nextInt()-1;
		PhoneN p = temp.get(i);
		list.remove(p);
		System.out.println("Deleted.");
		
	}

	private static ArrayList<PhoneN> searchPnList(String name) {
		ArrayList<PhoneN> temp = new ArrayList<PhoneN>();
		for(PhoneN p : list) {
			if(p.getName().contains(name)) {
				temp.add(p);
			}
		}
		return temp;
	}

	private static void searchPn() {
		System.out.println("Enter the name you want to find : ");
		String name = scan.nextLine();
		for(PhoneN p : list) {
		if(p.getName().contains(name)) {
			System.out.println(p);
		}
	}
	}

	private static void printMenu() {
		System.out.println("Menu");
		System.out.println("1. Add phone number.");
		System.out.println("2. Edit phone number.");
		System.out.println("3. Delete phone number.");
		System.out.println("4. Find phone book.");
		System.out.println("5. Terminate.");
		System.out.print("Select menu : ");
		
	}
private static boolean printPList(ArrayList<PhoneN> list, boolean num) {
	if(list == null || list.size() == 0) {
		System.out.println("Nothing to show, yet.");
		return false;
	}
	for(int i = 0; i < list.size(); i++) {
		if(num) {
			System.out.print(i+1 + ".");
			System.out.println("list.get(i)");
		}
		
	}
	return true;
}
}
@Setter
@Getter
@Data
@AllArgsConstructor
class PhoneN{
	private String name, phoneN;
	@Override
	public String toString() {
		return name + " : " + phoneN;
	}
	public void update(String newName, String phoneN2) {
		this.name = newName;
		this.phoneN = phoneN2;
		
	}
}
