
public class NYCheesecake extends Cheesecake{

	String name = "New York Cheesecake"; 
	
	CheesecakeIngredientFactory ingFactory;
	
	public NYCheesecake(CheesecakeIngredientFactory ingFactory){
		this.ingFactory = ingFactory;
	} 
	
			
	void createCheesecake(){
		
	System.out.println( "Baking" + name ) ;
	
		crust = ingFactory.createCrust(); 
	
		filling = ingFactory.createFilling();
		
		WhippedCream = ingFactory.createWhippedCream();
		}

	void display() {
		System.out.println( name );
	}
}
