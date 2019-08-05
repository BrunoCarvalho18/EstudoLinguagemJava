package br.com.estudoJava;

public class MinhaMainClass {

	public static void main(String[] args) {
		Animal meuPorco = new Porco();
		Animal meuCachorro = new Cachorro();
			
		meuPorco.somdeAnimal();
		meuPorco.sleep();
		System.out.println("\n");
		meuCachorro.somdeAnimal();
		meuCachorro.sleep();

	}

}
