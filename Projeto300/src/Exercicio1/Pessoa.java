package Exercicio1;

public class Pessoa {
	
	float altura = 170;
	float peso = 50;
	String nome = "italo";
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	void andar() {
		System.out.println("Você" + " "+ nome + " " + " é capaz de andar");
		
	}
	
	void correr() {
		System.out.println("Voce é uma pessoa capaz de correr");
	}
	

}
