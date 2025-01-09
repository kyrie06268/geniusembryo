package day08;

import java.util.Scanner;



public class Ex01_AccountBook2 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int op, count = 0, n;
		Item [] list = new Item[10];

		
		do {
			
			printMenu("Create an entry","Edit an entry","Delete an entry","Access Account Book","Terminate");
			op = scan.nextInt();
			printBar('-');
			switch(op) {
			case 1:
				list[count++] = inputItem();
				break;
				
			case 2:
				if(!printItems(list, count)) {
					break;
				};
				System.out.print("Enter the item number you want to edit : ");
				n = scan.nextInt();
				if(!checkIndex(n-1, count)) {
					System.out.println("Invalid entry.");
					break;
				} 
				System.out.print("Enter the new amount : ");
				int amount1 = scan.nextInt();
				list[n-1].setAmount(amount1);
				break;
			case 3:
				if(!printItems(list, count)) {
					break;
				};
				System.out.print("Enter the item number you want to delete : ");
				n = scan.nextInt();
				if(!checkIndex(n-1, count)) {
					System.out.println("Invalid entry.");
					break;
				} 
				deleteItem(list, n, count);
				break;
			case 4:
				printItems(list, count);
				break;
			case 5:
				System.out.println("Terminated.");
				break;
			default:
				System.out.println("Invalid entry.");
			}
			
		}while(op != 5);

	}
public static void printBar(char bar) {
	for(int i = 1; i < 20; i++) {
	System.out.print(bar);
	}
	System.out.println();
}
public static void printMenu(String ... menus) {
	 printBar('-');
	if(menus.length == 0) {
		System.out.println("Nothing to show!");
		return;
	}
	for(int i = 0; i <menus.length; i++) {
		String menu = menus[i];
		System.out.println(i+1 + "." + menu);
	}

	printBar('-');
	System.out.print("Select menu : ");
}
public static boolean printItems(Item [] list, int count) {
	if(count == 0 || list == null) {
		System.out.println("Nothing to show, yet.");
		return false;
	}
	for(int i = 0; i < count ; i++) {
		list[i].print(i+1);
	}
		return true;
}
public static Item inputItem() {
	System.out.print("Deposit/withdrawal : ");
	String deposit = scan.next();
	System.out.print("Type : ");
	String type = scan.next();
	System.out.print("Content : ");
	scan.nextLine();
	String content = scan.nextLine();
	System.out.print("Amount : ");
	int amount = scan.nextInt();
	System.out.print("Date : ");
	String date = scan.next();
	Item item = new Item(deposit, type, content, amount, date);
	return item;
}
public static boolean checkIndex(int n, int count) {
	return 0 <= n && n < count;
			
}
public static void deleteItem(Item[] list, int n, int count) {
	for(int i = n-1; i < count-1; i++) {
		list[i] = list[i+1];
	}
	count--;
}
public static int deleteItemList() {
	return 0;
}
}
class Item{
	String deposit;
	String type;
	String content;
	int amount;
	String date;
	public void print() {
		System.out.println(deposit + "/" + type + "/" + content + "/" + amount + "/" + date);
	}
	public void print(int num){
		System.out.print(num + ". ");
		print();
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Item(String deposit, String type, String content, int amount, String date) {
	
		this.deposit = deposit;
		this.type = type;
		this.content = content;
		this.amount = amount;
		this.date = date;
	}
	
}