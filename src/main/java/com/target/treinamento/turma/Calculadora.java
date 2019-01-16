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
		/*
		 * if (a > 10) { Double resultado = (a+b); return(resultado); } else if
		 * (a.equals(10.0)){ return(10.0); } else { return 50.0; }
		 */

		/* Teste do && = and
		 * if (a > 10) { Double resultado = (a + b); return (resultado); } else if (a <
		 * 10 && b < 10) { return 50.0; } else { return 99.9; }
		 */
		
		/* Teste do || = or
		 * 
		 */
		
		/*
		 * if (a > 10) { Double resultado = (a + b); return (resultado); } else if (a <
		 * 10 || b < 10) { return 50.0; } else { return 99.9; }
		 */

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
}
