package exercicio2;

public class Pessoa {
	
	private String nome = "Leonardo";
	private String sobrenome ="Messias";
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	void assinatura () {
		System.out.println("Seu nome é:" + nome +" " + sobrenome);
	}
	

}
