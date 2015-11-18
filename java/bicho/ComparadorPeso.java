import java.util.Comparator;

public class ComparadorPeso implements Comparator<Animal> {
	@Override
	public int compare(Animal animal1, Animal animal2) {
		Float pesoAnimal1 = animal1.peso;
		Float pesoAnimal2 = animal2.peso;

		int comp = pesoAnimal1.compareTo(pesoAnimal2);
		return comp;
	}

}
