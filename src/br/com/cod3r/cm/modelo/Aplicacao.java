package br.com.cod3r.cm.modelo;

public class Aplicacao {

	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		
		tabuleiro.abri(3, 3);
		tabuleiro.alternarMarcacao(4, 4);
		tabuleiro.alternarMarcacao(4, 5);
		System.out.println(tabuleiro);

	}

}
