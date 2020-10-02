import java.util.ArrayList;
import java.util.List;

public class Pizza {
	private List<Topping> toppings = new ArrayList<Topping>();

	public void addTopping(Topping topping) {
		toppings.add(topping);
	}

	public void getPizza() {
		System.out.println("Pizza should be ready!");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println("Topping: " + toppings.get(i).name() + ", Amount: " + toppings.get(i).amount());
		}
		System.out.println("");
	}
}
