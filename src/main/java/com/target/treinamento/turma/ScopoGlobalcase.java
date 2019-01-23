package com.target.treinamento.turma;

import java.util.Scanner;

public class ScopoGlobalcase {

	Integer[] meuArray;

	public static void main(String[] args) {

		ScopoGlobalcase sg = new ScopoGlobalcase();

		System.out.println("Meu programa:");
		System.out.println("[1] - Carregar array");
		System.out.println("[2] - Listar array");
		System.out.println("[3] - Numeros pares");
		System.out.println("[4] - Numeros impares");
		System.out.println("[5] - Numero maior");
		System.out.println("[6] - Numero menor");
		System.out.println("[7] - Array multiplicado");
		System.out.println("[8] - SAIR");

		int variavel = 0;
		Integer tamanho = 0;
		
		while (variavel != 8) {

			Integer opcao	= ScopoGlobalcase.lerOpcao();

			switch (opcao) {
			case 1:
				tamanho = ScopoGlobalcase.lerTamanho();
				System.out.println("carrega valor baseado em um numero inteiro");
				sg.carregaArray(tamanho);
				variavel = opcao;
				break;
			case 2:
				System.out.println("listar o vetor");
				sg.listarArray(tamanho);
				variavel = opcao;
				break;
			case 3:
				System.out.println("pares");
				sg.numerosPares(tamanho);
				variavel = opcao;
				break;
			case 4:
				System.out.println("impares");
				sg.numerosImpares(tamanho);
				variavel = opcao;
				break;
			case 5:
				System.out.println("maior numero");
				sg.numeroMaior(tamanho);
				variavel = opcao;
				break;
			case 6:
				System.out.println("menor numero");
				sg.numeroMenor(tamanho);
				variavel = opcao;
				break;
			case 7:
				Integer multi	= ScopoGlobalcase.lerMulti();
				System.out.println("multiplicar o total do array por um numero double");
				sg.multiplicador(tamanho, multi);
				variavel = opcao;
				break;
			case 8:
				System.out.println("SAIR");
				variavel = opcao;
				break;
			}
		}
	}


	private void carregaArray(Integer tamanho) {
		this.meuArray = new Integer[tamanho];

		for (int numero = 0; numero < tamanho; numero++) {

			System.out.println("Inserir valores na posição " + numero + ":");
			Scanner scanner = new Scanner(System.in);
			this.meuArray[numero] = scanner.nextInt();
		}

	}

	private void listarArray(Integer tamanho) {
		System.out.println("Os valores do array são: ");
		for (Integer numero: this.meuArray) {
				System.out.println(numero);
			}
	}
	
	
	private void numerosPares(Integer tamanho) {
		for (int numero = 0; numero < tamanho; numero++) {
			if (this.meuArray[numero] %2 == 0) {
				System.out.println(this.meuArray[numero]);
			}
		}
	}


	private void numerosImpares(Integer tamanho) {
		for (int numero = 0; numero < tamanho; numero++) {
			if (this.meuArray[numero] %2 == 1) {
				System.out.println(this.meuArray[numero]);
			}
		}
	}

	
	private void numeroMaior(Integer tamanho) {
		int maior = 0;
		
		for (int numero = 0; numero < tamanho; numero++) {
			if (maior <= this.meuArray[numero]) {
				maior = this.meuArray[numero];
			}
		}
		System.out.println("O maior numero é o : " + maior);
	}

	
	private void numeroMenor(Integer tamanho) {
		int menor = this.meuArray[0];
		
		for (int numero = 0; numero < tamanho; numero++) {
			if (menor >= this.meuArray[numero]) {
				menor = this.meuArray[numero];
			}
		}
		System.out.println("O menor numero é o : " + menor);
	}
	
	
	private void multiplicador(Integer tamanho, Integer multi) {
		int valor = 0;
		
		for (int numero = 0; numero < tamanho; numero++) {
			valor = this.meuArray[numero] * multi;
			System.out.println("O numero " + this.meuArray[numero] + " multiplicado por " + multi + " ficou " + valor);
			}
	}

	
	private static Integer lerTamanho() {
		System.out.println("Informar o tamanho do array : ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

	private static Integer lerMulti() {
		System.out.println("Informar o numero multiplicador : ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	
	private static Integer lerOpcao() {
		System.out.println("Informar a opção desejada : ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

}
