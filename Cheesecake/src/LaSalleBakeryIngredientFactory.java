
public class LaSalleBakeryIngredientFactory implements CheesecakeIngredientFactory{
	
	LaSalleBakeryIngredientFactory ingFacgtory;
		
	public Ganache createGanache() {
		return new WChocolateGanache();
		}
	
	public Filling createFilling(){
		return new SourCheese();
		}
	
	public Crust createCrust(){
		return new ButteryGrahamCrust();
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
