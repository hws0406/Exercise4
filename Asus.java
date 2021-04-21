
import java.util.Scanner;

public class Asus extends Laptop {				//Asus as subclass of Laptop Parent class
	Scanner scan = new Scanner(System.in);
	
	private String brand, model, color, processor;
	private double ram, price;
	
	Asus(){
		this.brand = "Asus";
		System.out.print("Enter model: ");
		this.model = scan.nextLine();
		System.out.print("Enter color: ");
		this.color = scan.nextLine();
		System.out.print("Enter processor: ");
		this.processor = scan.nextLine();
		System.out.print("Enter RAM size: ");
		this.ram = scan.nextDouble();
				if (ram == 8) {
					this.price = 3500;
				}
				else if (ram == 16) {
					this.price = 4000;
				}
	}

	String getBrand() {
		return this.brand;
	}
	
	String getModel() {
		return this.model;
	}
	
	String getColor() {
		return this.color;
	}
	
	String getProcessor() {
		return this.processor;
	}

	double getRam() {
		return this.ram;
	}
	
	double getPrice() {
		return this.price;
	}
}
