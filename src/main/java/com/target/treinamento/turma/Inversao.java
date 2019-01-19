package com.target.treinamento.turma;

import java.util.Scanner;

public class Inversao {

	public static void main(String[] args) {
		Inversao Inversao = new Inversao();
		
		String  nome		= Inversao.lerNome();
			
		String minhaVariavel = Inversao.inversao(nome);
		System.out.println("O nome invertido é : " + minhaVariavel);
	}

	private String lerNome() {
		System.out.println("Informe o nome : ");
		Scanner scanner = new Scanner(System.in);
		return scanner.next();
	}
	
	private String inversao(String nome) {
		return new StringBuilder(nome).reverse().toString();	
	}

	/*
	 private void meuMetodo() {
	 
		boolean teste = false;
		boolean primeiro = false;
		boolean segundo = false;
		
		boolean r = teste ? primeiro : segundo;
		
		System.out.println(r);
	}
	*/

	
	//return cotacao.equals(1) ? calculadora.multiplicar(Double.valueOf(dolar), Double.valueOf(real)) : calculadora.dividir(Double.valueOf(real), Double.valueOf(dolar));
	
	private void meuMetodo() {
		int soma = 0;
		
		while (soma < 10) {
			System.out.println("Rafael");
			soma = soma + 1;
		}
	}
	
}
