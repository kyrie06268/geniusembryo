package day07;

import java.util.Scanner;

public class Ex06_AccountBook {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int op, count = 0, i, n;
		Item [] list = new Item[10];

		
		do {
			System.out.print("Menu\r\n"
				+ "1. Create an entry\r\n"
				+ "2. Edit an entry\r\n"
				+ "3. Delete an entry\r\n"
				+ "4. Access Account Book\r\n"
				+ "5. Terminate");
			System.out.println();
			System.out.print("Choose an option : ");
			op = scan.nextInt();
			System.out.println("-----------------------------");
			switch(op) {
			case 1:
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
				list[count++] = new Item(deposit, type, content, amount, date);
				break;
			case 2:
				for(i = 0; i < count; i++) {
					list[i].print(i+1);
				}
				System.out.print("Enter the item number you want to edit : ");
				n = scan.nextInt();
				System.out.print("Enter the new amount : ");
				int amount1 = scan.nextInt();
				list[n-1].setAmount(amount1);
				break;
			case 3:
				for(i = 0; i < count; i++) {
					list[i].print(i+1);
				}
				System.out.print("Enter the item number you want to delete : ");
				n = scan.nextInt();
				for(i = n-1; i < list.length-1; i++) {
					list[i] = list[i+1];
				}
				count--;
				break;
			case 4:
				for(i = 0; i < count ; i++) {
					list[i].print(i+1);
				}
				break;
			case 5:
				System.out.println("Terminated.");
				break;
			default:
				System.out.println("Invalid entry.");
			}
			System.out.println("-----------------------------");
		}while(op != 5);

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