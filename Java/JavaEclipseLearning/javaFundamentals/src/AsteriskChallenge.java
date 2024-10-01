class Car {
	String colour;
	String brand;
	int cost;
	
	void speed(){
		System.out.println("FAST");
	}
	void accelerator() {
		System.out.println("Selected Accelerator");
	}
}

class Main{
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.colour = "black";
		c1.brand = "BMW";
		c1.cost = 15525525;
		
		c1.speed();
		c1.accelerator();
	}
}