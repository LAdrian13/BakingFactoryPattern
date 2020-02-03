
public class CheesecakeFactory extends Bakery{
	
	//Bakery CheesecakeFactory = new CheesecakeFactory();
	

	protected Cheesecake createCheesecake(String blank) {
		Cheesecake cheesecake = null;
		CheesecakeIngredientFactory ingFactory = new CFactoryIngredientFactory();
		
		if ( blank.equalsIgnoreCase("Chocolate")){
			cheesecake = new ChocolateCheesecake(ingFactory);
			}
		
		else if ( blank.equalsIgnoreCase("Strawberry")){
			cheesecake = new StrawberryCheesecake(ingFactory);
			}
		
		else if (blank.equalsIgnoreCase("NY")){
					cheesecake = new NYCheesecake(ingFactory);
					}

		return cheesecake;
			
		}
}
