package Yout2;

public class App {

	public static void main(String[] args) {
		Personagem heroi= new Personagem();
		
		heroi.nome= "Italo";
		heroi.nivel= 18;
		heroi.forca= 28;
		
		heroi.mostrarStatus();
		heroi.atacar("Zoe","");
		
	}

}
