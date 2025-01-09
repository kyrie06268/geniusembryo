package day08;

import lombok.Data;

public class Ex02_Inheritance {

	public static void main(String[] args) {
		KiaCar kia = new KiaCar();
		//kia.power
		kia.turnOn();
		System.out.println(kia.isPower());
		kia.speed = 10;
	}

}
@Data
class Car{
	private boolean power;
	protected int speed;
	public void turnOn() {
		this.power = true;
	}
	public void turnOff() {
		this.power = false;
	}
	public void speedUp() {
		speed++;
	}
	public void speedDown() {
		speed--;
	}
	
}
@Data
class KiaCar extends Car{
	
}

