package AT1;

public class Cliente extends Cidade {
	private String nomeCliente;
	private String enderešo;
	private String telefone;
	public String getNome() {
		return nomeCliente;
	}
	public void setNome(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
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
