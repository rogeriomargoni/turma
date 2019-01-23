package com.target.treinamento.turma;

import java.util.Scanner;

public class ScopoGlobalcase {
	
	public static void main(String[] args[]) {
		
		ScopoGlobalcase scopoGlobalcase = new ScopoGlobalcase();
		Integer opcao = ScopoGlobalcase.lerOpcao();
		
		switch(opcao) {
		case 1: System.out.println("carrega valor baseado em um numero inteiro");
		break;
		case 2: System.out.println("listar o vetor");
		break;
		case 3: System.out.println("pares");
		break;
		case 4: System.out.println("impares");
		break;
		case 5: System.out.println("maior numero");
		break;
		case 6: System.out.println("menor numero");
		break;
		case 7: System.out.println("multiplicar o total do array por um numero double");
		break;
		case 8: System.out.println("SAIR");
		break;
		}
	}

	private static Integer lerOpcao() {
		System.out.println("Informar a opção desejada : ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

}
