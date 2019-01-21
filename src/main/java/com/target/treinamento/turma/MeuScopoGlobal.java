package com.target.treinamento.turma;

public class MeuScopoGlobal {

	Integer equacao;

	public static void main(String[] args) {
		MeuScopoGlobal minhaVariavel = new MeuScopoGlobal();
		
		minhaVariavel.primeiroMetodo();
		minhaVariavel.segundoMetodo();
		
		System.out.println(minhaVariavel.equacao);
	}
	
	
	private void primeiroMetodo(){
		this.equacao = 12;
	}
	
	private void segundoMetodo(){
		this.equacao += 14;
	}
}
