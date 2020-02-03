
public abstract class Cheesecake {
	
	String name;
	Crust crust;
	Filling filling;
	Ganache ganache;
	Caramel caramel;
	WhippedCream WhippedCream;
	Strawberries Strawberries;
	
	void createCheesecake() {
		System.out.println("Creating " + name);
	}

	void display() {
		System.out.println( name );
	}	
		
	void bake() {
		System.out.println("Baking a delicious cheesecake...");
	}
	
	void cut() {
		System.out.println("Slicing the cheesecake...");
	}
	
	void box() {
		System.out.println("Place the cheesecake in a box with appropriate decoration.");
	}
}	
