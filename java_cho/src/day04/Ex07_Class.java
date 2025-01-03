package day04;

public class Ex07_Class {

	public static void main(String[] args) {
		Car camaro = new Car("Chevrolet", "Camaro", 2024);
		System.out.println(camaro.name);
		Car z06 = new Car("Chevrolet", "Corvette", 2025);
		System.out.println(z06.name);
		System.out.println(z06.power);
		z06.print();
		z06.startCar();
		System.out.println();
		z06.changeGear('n');
	}

}
class Car{
	public String brand;
	public String type;
	public String name;
	public String color;
	public int year;
	public String gasType;
	public boolean power;
	private char gear;
	private int speed;
	private int deg;
	public void startCar() {
		power = true;
	}
	public void endCar() {
		power = false;
	}
	
	public void speedUp() {
		if(power) {
			if(gear == 'd'||gear == 'r') {
		speed++;
			}
		}
	}
	public void speedDown() {
		if(power) {
			speed--;
		}
	}
	public void changeGear(char gear1) {
		gear = gear1;
		if(power) {
			switch(gear) {
			case 'p':
			case 'd':
			case 'n':
			case 'r':
			}
		}
	}
	
	public void changeDeg(int deg1) {
		deg = deg1;
	}
	public Car(String brand1) {
		brand = brand1;
		gear = 'p';
	}
	
	public Car(String brand1, String name1, int year1) {
		brand = brand1;
		name = name1;
		year = year1;
	}
	public void print() {
		System.out.println("--------------------------------------------");
		System.out.println("Power : " + power);
		System.out.println("Speed : "+ speed);
		System.out.println();
	}
	
}