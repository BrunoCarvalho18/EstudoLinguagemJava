package br.com.estudoJava;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro número:");
		double num1 = entrada.nextDouble();
		
		Scanner entradaII = new Scanner(System.in);
		System.out.println("Digite o segundo número:");
		double num2 = entradaII.nextDouble();
		
		Scanner entreOperacao = new Scanner(System.in);
		System.out.println("Entre com a Operacao: Opção 1 Divisão e Opção 2 Soma ");
		double operacao = entreOperacao.nextDouble();
		
		if(operacao == 1){
		  System.out.println(num1 / num2);
		}else if(operacao == 2) {
		  System.out.print(num1 + num2);	
		}else {
		  System.out.print("Você não escolheu nenhuma operação!!");
		}
	}

}
