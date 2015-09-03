
public class Main {

	public static void main(String[] args) {
		Gato gato = new Gato();
		Gato gato2 = new Gato();
		Cachorro cachorro = new Cachorro();
		Cachorro cachorro2 = new Cachorro();
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
	}

}
