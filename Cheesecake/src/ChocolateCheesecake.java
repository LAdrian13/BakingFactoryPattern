
public class ChocolateCheesecake extends Cheesecake{

	String name = "Chocolate Cheesecake"; 
	
	CheesecakeIngredientFactory ingFactory;
	
	public ChocolateCheesecake(CheesecakeIngredientFactory ingFactory){
		this.ingFactory = ingFactory;
	} 
	
			
	void createCheesecake(){
		
	System.out.println( "Baking" ) ;
	
		crust = ingFactory.createCrust(); 
	
		filling = ingFactory.createFilling();
		
		ganache = ingFactory.createGanache();
		
		System.out.println( name + " is baked.");
		}

}
