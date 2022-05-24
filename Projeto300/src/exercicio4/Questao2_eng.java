package exercicio4;
import java.util.Scanner;
public class Questao2_eng {


	    public static void main(String[] args) {
	     
	        Scanner entrada = new Scanner(System.in);
	        
	        
	        System.out.println("Digite a placa do Veiculo ");
	        String placa = entrada.nextLine();        
	        
	        System.out.println("Digite o modelo do Veiculo ");
	        String modelo = entrada.nextLine();
	        
	        System.out.println("Digite a cor do Veiculo ");
	        String cor = entrada.nextLine();

	        
	        System.out.println("Digite o ano do Veiculo");
	        int ano = entrada.nextInt();
	        
	       System.out.println("Digite a quantidade de Combustivel");
	        double combustivel = entrada.nextDouble();
	        
	        System.out.println("Digite a quantidade de portas:");
	        int qtdportas= entrada.nextInt();
	        
	      
	        Veiculo obj = new Veiculo(cor, placa, modelo, ano, combustivel);
	      
	     
	        System.out.println("A placa do Veiculo " + obj.verificaPlaca(placa) + " vogal(is).");
	    }
	 }
