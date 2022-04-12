package YOUTUBE;

public class App {

	public static void main(String[] args) {
	
	Celular celularA= new Celular();
	celularA.nome= "Iphone 12";
	celularA.armazenamento= 256;
	celularA.tamanhoTela= 6.1f;
	celularA.sistemaOperacional= "IOs";
	
	Celular celularB= new Celular();
	celularB.nome= "Poco x3 Pro";
	celularB.armazenamento= 256;
	celularB.tamanhoTela= 6.9f;
	celularB.sistemaOperacional= "Android";
	
	System.out.format("celular %s com tela de %.1f, com %dgb, e SO %s \n",celularA.nome, celularA.tamanhoTela,celularA.armazenamento, celularA.sistemaOperacional);
	System.out.format("celular %s com tela de %.1f, com %dgb, e SO %s",celularB.nome, celularB.tamanhoTela,celularB.armazenamento, celularB.sistemaOperacional);
	
	
	

	}

}
