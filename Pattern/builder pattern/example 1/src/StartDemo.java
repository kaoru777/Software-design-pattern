
public class StartDemo {
	public static void main(String[] args) {
		Pizza pizza = new Pizza();
		pizza.addTopping(new Ham());
		pizza.addTopping(new Corn());
		pizza.getPizza();
		

		Pizza pizzaNonMeat = new Pizza();
		pizzaNonMeat.addTopping(new Corn());
		pizzaNonMeat.addTopping(new Cheese());
		pizzaNonMeat.getPizza();
	}
}
