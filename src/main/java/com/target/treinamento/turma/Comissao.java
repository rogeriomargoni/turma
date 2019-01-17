package com.target.treinamento.turma;

import java.util.Scanner;

public class Comissao {

	public static void main(String[] args) {
	
		Comissao Comissao = new Comissao();
		
		String  vendedor	= Comissao.leiaVendedor();
		Integer codigo		= Comissao.leiaCodigo();
		Double  valor		= Comissao.leiaValor();
		Double  quantidade	= Comissao.leiaQuantidade();
		
		Double minhaVariavel = Comissao.venda(valor, quantidade);
		Double resultado	 = Comissao.comissao(minhaVariavel);
		
		System.out.println("A comissão do vendedor: " + vendedor + "  para a peça: " + codigo + " será de: " + resultado);
	}
	
	private String leiaVendedor() {
		System.out.println("Informe o nome do vendedor : ");
		Scanner scanner = new Scanner(System.in);
		return scanner.next().toUpperCase();
	}
	
	private Integer leiaCodigo() {
		System.out.println("Informe o Código do produto : ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

	private Double leiaValor() {
		System.out.println("Informe o valor da peça : ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextDouble();
	}

	private Double leiaQuantidade() {
		System.out.println("Informe a quantidade vendida : ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextDouble();
	}

	private Double venda(Double valor, Double quantidade) {
		Calculadora calculadora = new Calculadora();
		return calculadora.multiplicar(valor, quantidade);
	}
	
	private Double comissao( Double valor ) {
		Calculadora calculadora = new Calculadora();
		return calculadora.multiplicar(valor,0.1);
	}
}
