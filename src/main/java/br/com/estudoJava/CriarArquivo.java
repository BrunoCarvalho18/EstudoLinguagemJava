package br.com.estudoJava;

import java.io.IOException;
import java.io.FileWriter;

public class CriarArquivo {

	public static void main(String[] args) {
		try {

			FileWriter Escrever = new FileWriter("filename.txt");
			Escrever.write("Arquivos em Java são legais !");
			Escrever.close();
			System.out.println("O Arquivo foi escrito");

		} catch (IOException e) {
			System.out.println("Um erro ocorreu");
			e.printStackTrace();
		}

	}

}
