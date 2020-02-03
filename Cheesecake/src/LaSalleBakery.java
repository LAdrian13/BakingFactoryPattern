
public class LaSalleBakery extends Bakery{
	
	Bakery LaSalleBakery = new LaSalleBakery();
	

	protected Cheesecake createCheesecake(String blank) {
		
		Cheesecake cheesecake = null;
		CheesecakeIngredientFactory ingFactory = new LaSalleBakeryIngredientFactory();
		
		if ( blank.equalsIgnoreCase("Chocolate")){
			cheesecake = new ChocolateCheesecake(ingFactory);
			}
		
		else if ( blank.equalsIgnoreCase("Strawberry")){
			cheesecake = new StrawberryCheesecake(ingFactory);
			}
		
		else if (blank.equalsIgnoreCase("NY")){
					cheesecake = new NYCheesecake(ingFactory);
					}
	
		cheesecake.bake();
		cheesecake.cut();
		cheesecake.box();
		
		return cheesecake;
	}
	
}
