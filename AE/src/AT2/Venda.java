package AT2;
import java.util.Scanner;
public class Venda {

	public static void main(String[] args) {
		Pedido estoque= new Pedido();
		int status = 0;
		
		System.out.println("Loja Americanas");
		System.out.println("Numero do produto: " + estoque.getNumeroPedido());
		System.out.println("Quantidade em estoque: " + estoque.getStatusPedido());
		System.out.println("Preço do Pedido: " + estoque.getPrecoTotal());
		System.out.println("pedido encontra-se na loja?");
		status = estoque.NextInt();
		
		
		if (status ==1){
			System.out.println("Encontra-se na loja");
			
		}else {
			System.out.println("Nao ha o produto na loja");
		}

		
	}

}
