
public class CFactoryIngredientFactory implements CheesecakeIngredientFactory{
	
	CFactoryIngredientFactory ingFactory;
	
	public Ganache createGanache() {
		return new ChocolateGanache();
		}
	
	public Filling createFilling(){
		return new CreamCheese();
		}
	
	public Crust createCrust(){
		return new GrahamCrust();
		}
	
	public Caramel createCaramel(){
		return new Caramel();
		}
	
	public Strawberries createStrawberries(){
		return new Strawberries();
		}

	public WhippedCream createWhippedCream() {
		return new WhippedCream();
	}
}
