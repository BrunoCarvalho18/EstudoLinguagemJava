package br.com.estudoJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivo {

	public static void main(String[] args) {
		try {
			File meuObjeto = new File("filename.txt");
			Scanner Leitura = new Scanner(meuObjeto);
			while (Leitura.hasNextLine()) {
				String dados = Leitura.nextLine();
				System.out.println(dados);
			}

			Leitura.close();
		} catch (FileNotFoundException e) {
            System.out.println("Um erro ocorreu !");
            e.printStackTrace();
		}

	}

}
