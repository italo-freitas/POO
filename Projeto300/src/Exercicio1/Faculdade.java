package Exercicio1;
import java.util.Scanner;
public class Faculdade {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		Pessoa pessoa= new Pessoa();
		Aluno aluno= new Aluno(null, null, null);
	
		System.out.println("Qual seu nome:");
		pessoa.nome = sc.next();
		System.out.println("Qual sua altura:");
		pessoa.altura = sc.nextFloat();
		System.out.println("Qual seu peso:");
		pessoa.peso= sc.nextFloat();
		
		pessoa.correr();
		pessoa.andar();
		aluno.enviar();



	}

}
