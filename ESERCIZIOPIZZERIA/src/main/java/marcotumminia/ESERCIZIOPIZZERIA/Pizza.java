package marcotumminia.ESERCIZIOPIZZERIA;

import java.util.List;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class Pizza extends Menù {
	
	private List<String> toppings;
	private Size size;
	private double calorie;
	
	public Pizza ( String name, double price, double calorie, List<String> toppings, Size size) {
		super (name, price);
		
		this.calorie = calorie;
		this.toppings = toppings;
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "Pizza [Nome: " + getName() + " Size: " + getSize() + " Prezzo:" + getPrice() + " Toppings:"
				+ getToppings() + "]";
	}

}
