
public class Gato extends Animal {

	public Gato(String nome, float peso) {
		super(nome, peso);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String fazerBarulho(){
		return "miau";
	}
	
	@Override
	public String toString() {
		return "Gato [" + this.nome + "]";
	}

}
