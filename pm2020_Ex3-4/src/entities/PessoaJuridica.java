package entities;

public class PessoaJuridica extends Pessoa{
	private String cnpj;

	

	public PessoaJuridica(String nome, String endereco, String telefone, String cEP, String cidade, String uF, String cnpj) {
		super(nome, endereco, telefone, cEP, cidade, uF);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
}
