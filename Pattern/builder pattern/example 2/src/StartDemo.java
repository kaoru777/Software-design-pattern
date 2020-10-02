
public class StartDemo {

	public static void main(String[] args) {
		Pizza pizza = new Pizza();
		pizza.setName("Ham and Egg");
		pizza.setSize(55);
		pizza.addTopping("Ham");
		pizza.addTopping("Egg");
		pizza.addTopping("Cheese");
		pizza.getPizza();
		
		Pizza pizzaNonMeat = new Pizza();
		pizzaNonMeat.setName("Vegetarian Pizza");
		pizzaNonMeat.setSize(60);
		pizzaNonMeat.addTopping("Broccoli");
		pizzaNonMeat.addTopping("Corn");
		pizzaNonMeat.addTopping("Cheese");
		pizzaNonMeat.getPizza();
	}

}
