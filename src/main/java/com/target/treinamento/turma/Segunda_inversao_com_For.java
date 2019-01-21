package com.target.treinamento.turma;

import java.util.Scanner;

public class Segunda_inversao_com_For {

	public static void main(String[] args) {
		Segunda_inversao_com_For Inversao = new Segunda_inversao_com_For();
	
		System.out.println("O123V-88O    = " + Inversao.isPalindromo("O123V-*88O"));
		System.out.println("OR1E22L1A22X = " + Inversao.isPalindromo("OR1E22L1A22X"));
	}	

	private boolean isPalindromo(String valor) {
		String novoValor = valor.replaceAll("\\d[-]+",  "").replaceAll("\\*","");
		
		for (Integer inicio = 0, fim = novoValor.length(); ; inicio++, fim-- ) {
			if (novoValor.charAt(inicio) != novoValor.charAt(fim -1)){
				return false;
			} else {
				return true;
			}
		}			
	}
}