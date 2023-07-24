package marcotumminia.ESERCIZIOPIZZERIA;

public class Drink extends Menù {

	public Drink(String nome, double prezzo, double calorie) {
		super(nome, prezzo);

	}

	@Override
	public String toString() {
		return "Drink [Nome: " + getName() + ", Prezzo: " + getPrice() + "]";
	}

}