package br.com.estudoJava;

public class ArraysExemplo {

	public static void main(String[] args) {
		String[]carros = {"Volvo","BMW","Ford","Mazda"};
		System.out.println(carros[0]);
		System.out.println(carros[1]);
		System.out.println(carros[2]);
		System.out.println(carros[3]);
		//Trocar Variável no Array
		carros[0] = "Toyota";
		System.out.println(carros[0]);
		System.out.println("\n");
		
		String[] carrosII = {"Volvo","BMW","Ford","Mazda"};
		System.out.println(carrosII.length);
		System.out.println("\n");
		
		String[] carrosIII = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : carrosIII) {
		  System.out.println(i);
		}
		System.out.println("\n");
		
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		int x = myNumbers[1][2];
		System.out.println(x); 
	}

}
