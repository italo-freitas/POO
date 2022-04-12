package Faculdade;

import java.util.Random;

public class Estoque {
	
	private String nome= "Lapis";
	private int qtdAtual= 20;
	private int qtdMinima= 5;
	public String getNome() {
		return nome;
	}
	public int getQtdAtual() {
		return qtdAtual;
	}
	public int getQtdMinima() {
		return qtdMinima;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	private void setQtdAtual(int qtdAtual) {
		this.qtdAtual = qtdAtual;
	}
	private void setQtdMinima(int qtdMinima) {
		this.qtdMinima = qtdMinima;
	}
	int calcularProduto() {
		Random gerador= new Random();
		int lapis20= 1 + gerador.nextInt(30);
		int material= qtdAtual - lapis20;
		return material;
	}
	
    boolean precisaRepor(double quantidade) {
	int valor= calcularProduto();
	if (this.qtdMinima < quantidade) {
		System.out.format("Estoque ok\n", quantidade, qtdAtual, qtdMinima, valor);

		return false;
	}else {
		System.out.format("Necessario reabastecer estoque\n", quantidade, valor);
		return true;
	}
	}
        void mostra() {
		
		System.out.format("Produto: %s, quantidade em estoque  %d, e minimo para trabalho %d \n", nome, qtdAtual, qtdMinima);
	}
	

}

