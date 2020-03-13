package entities;

public class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	private String CEP;
	private String cidade;
	private String UF;

	
	public Pessoa() {
		
	}

	public Pessoa(String nome, String endereco, String telefone, String cEP, String cidade, String uF) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		CEP = cEP;
		this.cidade = cidade;
		UF = uF;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}
	
	
	
	
	
	
}
