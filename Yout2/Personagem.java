package Yout2;

import java.util.Random;

public class Personagem {

	String nome;
	int forca;
	int nivel;
	
	void mostrarStatus() {
		
		System.out.format("Personagem : %s, com nivel %d, e força %d \n", nome, nivel, forca );

	}
	int calcularDano() {
		Random gerador= new Random();
		int dado20Faces= 1 + gerador.nextInt(19);
		int dano= forca + dado20Faces;
		return dano;
		
		
	}
	void atacar(String alvo, String habilidade) {
		int danoCausado= calcularDano();
		if (habilidade.length()== 0) {
			System.out.format("%s Atacou %s e causou %d de dano.\n", nome, alvo, danoCausado);
		}else {
			System.out.format("%s usou '%s' contra %se causou %d de dano.\n", nome, habilidade, alvo, danoCausado);

			
		}
			
		
	}
}
