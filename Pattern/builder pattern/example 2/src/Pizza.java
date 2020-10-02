import java.util.ArrayList;
import java.util.List;

public class Pizza {
	private String name;
	private int size;
	private List<String> toppings = new ArrayList<String>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public Pizza addTopping(String title) {
		toppings.add(title);
		return this;
	}
	
	public void getPizza() {
		System.out.println("Pizza is ready with the following toppings:");
		for(int i = 0; i < toppings.size(); i++) {
			System.out.println(toppings.get(i));
		}
		System.out.println();
	}

}
