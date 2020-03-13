package entities;

public class ClientePessoaJuridica extends Cliente{
	private String cnpj;

	public ClientePessoaJuridica(String nome, String endereco, String telefone, String cEP, String cidade, String uF, double limiteDeCredito, String cnpj) {
		super(nome, endereco, telefone, cEP, cidade, uF, limiteDeCredito);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
}
