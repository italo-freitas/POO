package Exercicio6;

public class RedeSocial {
	
	String nome;
	String email;
	int telefone;
	String instagram;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getInstagram() {
		return instagram;
	}
	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}
	void mostraDados() {
		System.out.format("Nome do Usuario: %s \n email do usuario: %s \n telefone do usuario: %d \n Instagram do usuario: %s \n ",
				nome, email, telefone, instagram);
	}

}
