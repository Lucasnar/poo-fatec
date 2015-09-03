import java.util.ArrayList;
import java.util.List;


public abstract class Manada {
	List<Animal> animais = new ArrayList<Animal>();
	String estouro = "";
	
	public String estourar() {
		for(int i=0; i < this.animais.size(); i++){
//			if (i==this.animais.size()-1){
//				this.estouro = this.estouro + this.animais.get(i).fazerBarulho();
//			}else{
			this.estouro = this.estouro + this.getDivisor() +
					this.animais.get(i).fazerBarulho();
//			}
		}
		return this.estouro;
	}
	
	public List<Animal> adicionarAnimal(Animal animal){
		this.animais.add(animal);
		return this.animais;
	}
	
	public abstract String getDivisor();
}
