package br.com.estudoJava;

public class MinhaClasse {
	
	static void meuMetodoStatico() {
		System.out.println("Métodos Staticos podem ser chamados, sem criar objetos");
	}
	
	public void meuMetodoPublico() {
		System.out.println("Metdos Publicos, podem ser chamados criando objetos");
	}

	public static void main(String[] args) {
		meuMetodoStatico();
		
		MinhaClasse meuObjeto = new MinhaClasse();
		meuObjeto.meuMetodoPublico();
		System.out.println("\n");
		
		Estudante meuObjetoI = new Estudante();
		System.out.println("Nome: " + meuObjetoI.fnome);
		System.out.println("Idade: " + meuObjetoI.idade);
		System.out.println("Ano da Graduação: " + meuObjetoI.AnoGraduacao);
		meuObjetoI.estudo();
		

	}

}
