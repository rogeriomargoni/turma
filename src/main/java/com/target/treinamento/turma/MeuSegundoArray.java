package com.target.treinamento.turma;

import java.util.Scanner;

public class MeuSegundoArray {

	public static void main(String[] args) {
		new MeuSegundoArray().inicializa();		
	}

	private void inicializa() {
		Double[] meuArray = new Double[10];
		
		for (int i = 0; i < 10; i++) {
			meuArray[i] = lerEntrada();
		}
		
		efetuaOperacao(meuArray);
		imprimeNaTela(meuArray);
	}

	public Double lerEntrada() {
		System.out.println("Informe valor : ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextDouble();
	}

	
	private void efetuaOperacao(Double[] meuArray) {
		for (int i = 0 ; i < meuArray.length; i++) {
			meuArray[i] = meuArray[i] * meuArray[i];
		}
	}

	
	private void imprimeNaTela(Double[] meuArray) {
		for (int i = 0 ; i < meuArray.length; i++) {
			System.out.println(meuArray[i]);
		}
	}
}
