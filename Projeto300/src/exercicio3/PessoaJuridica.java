package exercicio3;

public class PessoaJuridica extends PessoaFisica{
	
	String CNPJ= "28.876.101/0001-47";
	String codigo2= "2";

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	void mostra() {
		
	}

	public String getCodigo2() {
		return codigo2;
	}

	public void setCodigo2(String codigo2) {
		this.codigo2 = codigo2;
	}
	void imposto2() {
		Double imposto2;
		imposto2= renda * 0.10;
		System.out.println("Seu saldo é:" + renda + imposto2);
		
	}

}
