
public class StrawberryCheesecake extends Cheesecake{

	String name = "Strawberry Cheesecake"; 
	
	CheesecakeIngredientFactory ingFactory;
	
	public StrawberryCheesecake(CheesecakeIngredientFactory ingFactory){
		this.ingFactory = ingFactory;
	} 
	
			
	void createCheesecake(){
		
	System.out.println( "Baking" + name ) ;
	
		crust = ingFactory.createCrust(); 
	
		filling = ingFactory.createFilling();
		
		Strawberries = ingFactory.createStrawberries();
		}

	void display() {
		System.out.println( name );
	}
}
