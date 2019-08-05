package br.com.estudoJava;

public class Carro extends Veículo {
	
	public String modelo = "Mustang";
	
	public void aceleracaoTotal() {
		System.out.println("O Carro está indo mais rápido que ele pode !");
	}
	
	public void velocidade(int velocidadeMaxima) {
		System.out.println("A Velocidade Máxima é: " + velocidadeMaxima);
	}

	public static void main(String[] args) {
		Carro meuCarro = new Carro();
		meuCarro.aceleracaoTotal();
		meuCarro.velocidade(200);
		System.out.println("\n");
		meuCarro.honk();
		System.out.println(meuCarro.marca + " " + meuCarro.modelo);

	}

}
