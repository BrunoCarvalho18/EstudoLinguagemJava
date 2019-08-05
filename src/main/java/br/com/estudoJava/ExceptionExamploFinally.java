package br.com.estudoJava;

public class ExceptionExamploFinally {

	public static void main(String[] args) {
		try {
			int[] meusNumeros = { 1, 2, 3 };
			System.out.println(meusNumeros[10]);
		} catch (Exception e) {
			System.out.println("Algo está errado");
		} finally {
			System.out.println("O Try catch irá finalizar");
		}
	}

}
