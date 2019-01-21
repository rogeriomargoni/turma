package com.target.treinamento.turma;

import java.util.Scanner;

public class Inversao_com_For {

	public static void main(String[] args) {
		Inversao_com_For Inversao = new Inversao_com_For();
	
		System.out.println(Inversao.isPalindromo("ovo"));
	}	

	private boolean isPalindromo(String valor) {
		String novoValor = valor.replaceAll("\\s+",  "");
		
		for (Integer inicio = 0, fim = novoValor.length(); ; inicio++, fim-- ) {
			if (novoValor.charAt(inicio) != novoValor.charAt(fim -1)){
				return false;
			} else {
				return true;
			}
		}			
	}
}
