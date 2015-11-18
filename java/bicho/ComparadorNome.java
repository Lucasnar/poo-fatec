import java.util.Comparator;

public class ComparadorNome implements Comparator<Animal>{

	@Override
	public int compare(Animal animal1, Animal animal2) {
		int comp = animal1.nome.compareTo(animal2.nome);
		return comp;
	}

}
