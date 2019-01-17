package com.target.treinamento.turma;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		
		Calculadora minhaCalculadora = new Calculadora();
		
		Double a = minhaCalculadora.leiaPrimeiraEntrada();
		Double b = minhaCalculadora.leiaSegundaEntrada();
		String o = minhaCalculadora.leiaTerceiraEntrada();
		
		Double minhaVariavel = new Calculadora().calcula(a, b, o);
		System.out.println("O resultado da operação = " + minhaVariavel);
	}

	private Double lerEntrada() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextDouble();
	}

	private String lerEntradaOperacao() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next().toUpperCase();
	}


	
	private Double leiaPrimeiraEntrada() {
		System.out.println("Informe o primeiro número : ");
		return lerEntrada();
	}

	private Double leiaSegundaEntrada() {
		System.out.println("Informe o segundo número : ");
		return lerEntrada();
	}
	
	private String leiaTerceiraEntrada() {
		System.out.println("Informe a operação A(Adição) / S(Subtração) / D(Divisão) / M(Multiplicação): ");
		return lerEntradaOperacao();
	}

	
	private Double calcula(Double a, Double b, String o) {
		if (o.equals("A")) {

			return adicionar(a, b);
		
		} else if (o.equals("S")) {

			return subtrair(a, b);

		} else if (o.equals("D")) {

			return dividir(a, b);
					
		} else if (o.equals("M")) {
			
			return multiplicar(a, b);
		
		} else {
			return -1.0;
		}
	}
	
	private Double adicionar(Double a, Double b) {
		return a + b;
	}

	private Double subtrair(Double a, Double b) {
		return a - b;
	}

	private Double dividir(Double a, Double b) {
		return a / b;
	}
	
	public Double multiplicar(Double a, Double b) {
		return a * b;
	}
	
	/*
	private Double calcula(Double a, Double b, String o) {
		if (o.equals("A")) {
				if (a > 10) { Double resultado = (a + b); 
					return (resultado); 
				} else if (a < 10 || b < 10) { 
					return 50.0; 
				} else { 
					return 99.9; 
				}
		} else if (o.equals("S")) {
				if (a > 10) { Double resultado = (a - b);
				return (resultado); 
			} else if (a < 10 || b < 10) { 
				return 50.0; 
			} else { 
				return 99.9; 
			}
		} else if (o.equals("D")) {
				if (a > 10) { Double resultado = (a / b);
				return (resultado); 
			} else if (a < 10 || b < 10) { 
				return 50.0; 
			} else { 
				return 99.9; 
			}
		} else if (o.equals("M")) {
				if (a > 10) { Double resultado = (a * b);
				return (resultado); 
			} else if (a < 10 || b < 10) { 
				return 50.0; 
			} else { 
				return 99.9; 
			}				
		} else {
			return 999.9;
		}
	}
	*/

}
