package exercicio1;
import java.util.Scanner;

public class Aluno {

	public static void main(String[] args) {
		
		Scanner aluno= new Scanner(System.in);
		double mensalidade = 0.0, desconto= 0.0;
		int irmaos;
		
		System.out.println("Mensalidade:");
		mensalidade= aluno.nextDouble();
		
		System.out.println("Numero de irmaos:");
		irmaos= aluno.nextInt();
		
		
		if (irmaos == 1){
			System.out.println("Desnconto de 5%:\n");
			
		}
		if (irmaos == 2) {
			System.out.println("Desconto de 10%:\n");
			
		}
		else if (irmaos > 3) {
			System.out.println("Desconto de 15%:\n");
			
		}
		else {
			System.out.println("Nao tem desconto:\n");
		}
		
		Double valor= ((100 - mensalidade) / 100 ) * desconto;
				System.out.println("Valor da mensalidade é:" + valor);
		
		aluno.close();
		
		

	}

}
