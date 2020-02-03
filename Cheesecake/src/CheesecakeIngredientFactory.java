
public interface CheesecakeIngredientFactory {
	
	public Filling createFilling(); //different
	public Crust createCrust();		//different
	public Ganache createGanache();	//different
	public Caramel createCaramel();	//same
	public WhippedCream createWhippedCream(); //same for both factories
	public Strawberries createStrawberries(); //same for both factories
	
}
