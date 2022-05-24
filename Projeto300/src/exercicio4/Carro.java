package exercicio4;

public class Carro extends Veiculo{
	
	private int qtdportas;

	Carro(String cor, String placa, String modelo, int ano, double comb) {
		
		super(cor, placa, modelo, ano, comb);
		
		
	}
		public void V1() {
			super(cor, placa, modelo, ano);
			this.qtdportas= qtdportas;
		}
		
	}
	

