
public class Main {

	public static void main(String[] args) {
		Gato gato = new Gato("Felix", 30);
		Gato gato2 = new Gato("Garfield", 80);
		Cachorro cachorro = new Cachorro("Pluto", 45);
		Cachorro cachorro2 = new Cachorro("Cerberus", 50000);
		ManadaSustenido manadaSustenido = new ManadaSustenido();
		ManadaVirgula manadaVirgula = new ManadaVirgula();
		
		manadaSustenido.adicionarAnimal(gato);
		manadaSustenido.adicionarAnimal(cachorro);
		manadaSustenido.adicionarAnimal(gato2);
		manadaSustenido.adicionarAnimal(cachorro2);
		System.out.println(manadaSustenido.estourar());
		
		manadaVirgula.adicionarAnimal(gato);
		manadaVirgula.adicionarAnimal(cachorro);
		manadaVirgula.adicionarAnimal(gato2);
		manadaVirgula.adicionarAnimal(cachorro2);
		System.out.println(manadaVirgula.estourar());
		
		/* Início das comparações e ordenaçoes. */
		System.out.println("Início da iteração e das ordenaçoes.");
		
		Manada manada=new Manada();
	
		manada.adicionarAnimal(cachorro);
		manada.adicionarAnimal(cachorro2);
		manada.adicionarAnimal(gato);
		manada.adicionarAnimal(gato2);
		
		System.out.println(manada);
		
		System.out.println("Iteração:");

		for(Animal a: manada){
			System.out.println(a);
		}
		
		System.out.println("Ordenação por nome:");
		
		manada.ordenarNome();
		System.out.println(manada);
		
		System.out.println("Ordenação por peso:");
		
		manada.ordenarPeso();
		System.out.println(manada);
	}
}
