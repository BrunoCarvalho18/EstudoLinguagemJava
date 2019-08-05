package br.com.estudoJava;

import java.util.HashMap;

public class HashMapExemplo {

	public static void main(String[] args) {
		
      HashMap<String,String> capitaisDePais = new HashMap<String,String>();
      
      capitaisDePais.put("Inglaterra", "Londres");
      capitaisDePais.put("Alemanha", "Berlim");
      capitaisDePais.put("Noruega", "Oslo");
      capitaisDePais.put("USA", "Washington DC");
      System.out.println(capitaisDePais);
      
      System.out.println(capitaisDePais.get("Inglaterra"));
      
      
	}

}
