package AT1;

public class Cliente extends Cidade {
	private String nomeCliente;
	private String endereço;
	private String telefone;
	public String getNome() {
		return nomeCliente;
	}
	public void setNome(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Cliente(String _UF, String Nome) {
		this.UF= _UF;
		this.nomeCidade= Nome;
	}

}
