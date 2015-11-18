public class Cachorro extends Animal {

	public Cachorro(String nome, float peso) {
		super(nome, peso);
	}

	@Override
	public String fazerBarulho(){
		return "au";
	}
	
	@Override
	public String toString() {
		return "Cachorro [" + this.nome + "]";
	}

}
