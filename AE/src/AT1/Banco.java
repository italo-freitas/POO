package AT1;
import java.util.Scanner;
public class Banco {

	public static void main(String[] args) {
		Conta conta= new Conta();
		Cliente cliente= new Cliente("joao", "31991082797");
		Scanner banco = new Scanner(System.in);
		
		int poupanca;
		String cliente1;
		
		System.out.println("Nome do cliente e seu telefone:" + cliente);
		System.out.println("Conta poupança ou corrente?");
		poupanca= banco.nextInt();
		
		if (poupanca == 1) {
			System.out.println("Digite 1 para conta corrente");
		}else {
			System.out.println("Digite 2 para conta poupanca");
		}
	
		System.out.println("Voce deixa");

	}

}
