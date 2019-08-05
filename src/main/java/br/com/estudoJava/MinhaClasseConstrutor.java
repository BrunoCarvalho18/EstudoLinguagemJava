package br.com.estudoJava;

public class MinhaClasseConstrutor {
	
	int x;
	
	public MinhaClasseConstrutor() {
		x = 5;
	}

	public static void main(String[] args) {
	   MinhaClasseConstrutor meuObjeto = new MinhaClasseConstrutor();
	   System.out.println(meuObjeto.x);

	}

}
