public class Main {

	public static void main(String[] args) {
		
		Dell d = new Laptop();
		System.out.println("\n--LAPTOP 1--");
		System.out.println("Brand: " + d.getBrand());
		System.out.println("Model: " + d.getModel());
		System.out.println("Color: " + d.getColor());
		System.out.println("Processor: " + d.getProcessor());
		System.out.println("RAM: " + d.getRAM() + "GB");
		System.out.println("Length: " + d.getLength() + "cm");
		System.out.println("Height: " + d.getHeight() + "cm");
		System.out.println("Width: " + d.getWidth() + "cm");
		System.out.println("Weight: " + d.getWeight() + "kg");
		System.out.printf("Price: RM%.2f %n" + d.getPrice());
		
		System.out.println();
		
		Asus a = new Laptop();
		System.out.println("\n--LAPTOP 2--");
		System.out.println("Brand: " + a.getBrand());
		System.out.println("Model: " + a.getModel());
		System.out.println("Color: " + a.getColor());
		System.out.println("Processor: " + a.getProcessor());
		System.out.println("RAM: " + a.getRAM() + "GB");
		System.out.println("Length: " + a.getLength() + "cm");
		System.out.println("Height: " + a.getHeight() + "cm");
		System.out.println("Width: " + a.getWidth() + "cm");
		System.out.println("Weight: " + a.getWeight() + "kg");
		System.out.printf("Price: RM%.2f %n" + a.getPrice());
