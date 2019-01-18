package com.target.treinamento.turma;

import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {

		Conversor Conversor = new Conversor();
		
			Integer cotacao		= Conversor.leiaCotacao();
			String  dolar		= Conversor.leiaDolar();
			String  real		= Conversor.leiaReal();
		
			Double minhaVariavel = Conversor.conversor(cotacao, dolar, real);
			System.out.println("O resultado da conversão é : " + minhaVariavel);
		}

		private Integer leiaCotacao() {
			System.out.println("Informe o tipo da cotação (1 - Dolar/Real   2 - Real/Dolar):  ");
			Scanner scanner = new Scanner(System.in);
			return scanner.nextInt();
		}
		
		private String leiaDolar() {
			System.out.println("Informe a Cotação do Dolar : ");
			Scanner scanner = new Scanner(System.in);
			return scanner.next();
		}	

		private String leiaReal() {
			System.out.println("Informe a Cotação do Real : ");
			Scanner scanner = new Scanner(System.in);
			return scanner.next();
		}	

		private Double conversor(Integer cotacao, String dolar, String real) {
			Calculadora calculadora = new Calculadora();

			if (dolar.equals("0") || real.equals("0")) {
				System.out.println("Valores não podem ser zero(0)");
				return 0.0;
			} else {			
				if (cotacao.equals(1)){
					return calculadora.multiplicar(Double.valueOf(dolar), Double.valueOf(real));
				} else {
					return calculadora.dividir(Double.valueOf(real), Double.valueOf(dolar));
				}
			}
		}
}
