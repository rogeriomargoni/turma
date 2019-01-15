package com.target.treinamento.turma;

public class Exercicio {
    public static void main(String[] args) {

        // Tipos como objetos (recomentados)
        Integer inteiro = 12;       //assim se torna um objeto inteiro;
        Long numerogrande = 1000L;  // assim se torna um objeto longo, com L no final do número
        Short curto = 'C';          // assim se torna um objeto curto
        String minhaString = "Rogerio";
        Character caracter = 'A';

        new Exercicio().compara();
    }

    private void compara(){
        //equals sempre compara o conteudo dos objetos, independente do tipo de objeto

        //Integer a = 15;
        //Integer b = 15;

        String a = "Rafael";
        String b = "Rafael";

        //boolean resultado = (a == b);     //compara objetos, não o conteudo
        boolean resultado = a.equals(b);    //compara o conteudo dentro dos objetos


        System.out.println("Meu método é: " + resultado);
    }
}
