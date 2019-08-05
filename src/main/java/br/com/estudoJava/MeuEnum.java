package br.com.estudoJava;

public class MeuEnum {
	
	enum Nivel{
		BAIXO,
		MEDIO,
		ALTO
	}

	public static void main(String[] args) {
		Nivel minhaVariavel = Nivel.MEDIO;
		System.out.println(minhaVariavel);

	}

}
