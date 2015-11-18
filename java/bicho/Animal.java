public abstract class Animal{
	protected String nome;
	protected float peso;
	
	public abstract String fazerBarulho();
	
	public Animal(String nome, float peso){
		this.nome = nome;
		this.peso = peso;
	}
}
