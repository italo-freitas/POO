package AT1;

public class Cliente extends Cidade {
	private String nomeCliente;
	private String endere�o;
	private String telefone;
	public String getNome() {
		return nomeCliente;
	}
	public void setNome(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
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
