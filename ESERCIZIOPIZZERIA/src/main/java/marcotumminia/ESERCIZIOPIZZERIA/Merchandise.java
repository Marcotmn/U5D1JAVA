package marcotumminia.ESERCIZIOPIZZERIA;

public class Merchandise extends Menù {

	public Merchandise(String nome, double prezzo) {
		super(nome, prezzo);
	}

	@Override
	public String toString() {
		return "Merchandise [Nome: " + getName() + ", Prezzo: " + getPrice() + "]";
	}
}