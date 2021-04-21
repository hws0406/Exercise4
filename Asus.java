
import java.util.Scanner;

public class Dell extends Laptop {				//Dell as subclass of Laptop Parent class
	Scanner scan = new Scanner(System.in);
	
	private String brand, model, color, processor;
	private double ram, price;
	
	
	Dell(){
		this.brand = "Dell";
		System.out.print("Enter model: ");
		this.model = scan.nextLine();
		System.out.print("Enter color: ");
		this.color = scan.nextLine();
		System.out.print("Enter processor: ");
		this.processor = scan.nextLine();
		System.out.print("Enter RAM size: ");
		this.ram = scan.nextDouble();
				if (ram == 8) {
					this.price = 3000;
				}
				else if (ram == 16) {
					this.price = 3500;
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
}
