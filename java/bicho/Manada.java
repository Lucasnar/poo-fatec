import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Manada implements Iterable<Animal>, Iterator<Animal>{
	List<Animal> animais = new ArrayList<Animal>();
	String estouro = "";
	private int animalAtualIndex = 0;
	
	public String estourar() {
		for(int i=0; i < this.animais.size(); i++){
			this.estouro = this.estouro + this.getDivisor() +
					this.animais.get(i).fazerBarulho();
		}
		return this.estouro;
	}
	
	public List<Animal> adicionarAnimal(Animal animal){
		this.animais.add(animal);
		return this.animais;
	}
	
	public String getDivisor(){
		return null;
	}
	
	@Override
	public Iterator<Animal> iterator() {
		animalAtualIndex=0;
		return this.animais.iterator();
	}

	@Override
	public boolean hasNext() {
		return animalAtualIndex<animais.size();
	}

	@Override
	public Animal next() {
		Animal animalAtual = animais.get(animalAtualIndex);
		animalAtualIndex++;
		return animalAtual;
	}
	
	@Override
	public void remove() {
		animais.remove(animalAtualIndex);
		animalAtualIndex--;
	}
	
	@Override
	public String toString() {
		return "Manada [animais=" + animais + "]";
	}
	
	public void ordenarNome() {
		ComparadorNome comp=new ComparadorNome();
		Collections.sort(animais,comp);
	}
	
	public void ordenarPeso() {
		ComparadorPeso comp=new ComparadorPeso();
		Collections.sort(animais,comp);
	}
}
