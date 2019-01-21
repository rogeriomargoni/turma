package com.target.treinamento.turma;

import java.util.Scanner;

public class Inversao_while {
	
	public static void main(String[] args) {
		Inversao_while Inversao = new Inversao_while();

	        String  nome		= Inversao.lerNome();
	        Integer tamanho     = Inversao.tamanho(nome);

	        String minhaVariavel = Inversao.inversao(nome, tamanho);
	        System.out.println("O nome invertido é : " + minhaVariavel);
	        System.out.format("\n");

	        if (nome.equals(minhaVariavel)) {
	            System.out.println("Nome é Palindromo");
	        } else {
	            System.out.println("Nome NÃO é um Palindromo");
	        }
	}

	private String lerNome() {
		System.out.println("Informe o nome : ");
	    Scanner scanner = new Scanner(System.in);
	    return scanner.next();
	}

	private Integer tamanho(String nome){
	    return nome.length();
	}


	private String inversao(String nome, Integer tamanho) {

		String invertida = "";
		Integer soma = 1;

		while (soma <= tamanho){
			invertida = invertida + nome.charAt(tamanho-soma);
			soma = soma + 1;
		}
		return invertida;
	}
}	    
