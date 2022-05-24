package exercicio3;
import java.util.Scanner;
public class Salario {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Double salario;
		Double IR;
		PessoaFisica fisica= new PessoaFisica();
		PessoaJuridica juridica= new PessoaJuridica();
		juridica.imposto2();
		System.out.println("Digite o numero 1 para pessoa fisica\n 2 para pessoa juridca");
		salario =sc.nextDouble();
	
		
		if(salario > 4665) {
			IR= salario * 0.275;
		}
		
		else if (salario < 4664 || salario > 3751) {
			IR= salario * 0.225;
			System.out.println("Seu IR é de:" + IR + fisica.codigo);
		}
		else if (salario < 3751 || salario > 2826) {
			IR= salario * 0.15;
			System.out.println("Seu IR é de:" + IR + fisica.codigo);
		}
		else if (salario < 2826 || salario > 1903) {
			IR= salario * 0.075;
			System.out.println("Seu IR é de:" + IR + fisica.codigo);
			
		}else {
			IR= salario;
			System.out.println("Seu IR é de:" + IR + fisica.codigo);
		}
		
	
		
	sc.close();

	}

}
