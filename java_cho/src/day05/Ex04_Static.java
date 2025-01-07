package day05;

public class Ex04_Static {

	public static void main(String[] args) {
		Chrysler c1 = new Chrysler("300c");
		Chrysler c2 = new Chrysler("Pacifica");
		Chrysler c3 = new Chrysler("Voyager");
		// c1.setCompany("GM");
		Chrysler.setCompany("GM");
		c1.print();
		c2.print();
		c3.print();
		
		
	}

}
class Chrysler{
	private static String company;
	private String carName;
	public static String getCompany() {
		return company;
	}
	public static void setCompany(String company) {
		Chrysler.company = company;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public void print() {
		System.out.println(company + " : " + carName);
	}
	public Chrysler(String carName) {
		company = "Chrysler";
		this.carName = carName;
	}

	
}