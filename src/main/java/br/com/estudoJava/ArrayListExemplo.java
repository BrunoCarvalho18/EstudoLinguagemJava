package br.com.estudoJava;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExemplo {

	public static void main(String[] args) {
		ArrayList<String> carros = new ArrayList<String>();
		carros.add("Volvo");
		carros.add("BMW");
		carros.add("Ford");
		carros.add("Mazda");
		
		Collections.sort(carros);
		
		for(String i : carros) {
			System.out.println(i);
		}
	}

}
