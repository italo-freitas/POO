package Faculdade;

public class Loja {

	public static void main(String[] args) {
		Estoque estoque= new Estoque();
		estoque.mostra();
		System.out.println("Loja Americanas");
		System.out.println("Nome do produto: " + estoque.getNome());
		System.out.println("Quantidade em estoque: " + estoque.getQtdAtual());
		System.out.println("Quantidade minima exigida pra estoque: " + estoque.getQtdMinima());
		System.out.println("Sobrou no estoque :" + estoque.calcularProduto());
		System.out.println(estoque.precisaRepor(5));


	}

}
