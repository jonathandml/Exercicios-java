package entities;

public class ClientePessoaFisica extends Cliente{
	private String cpf;

	
	public ClientePessoaFisica(String nome, String endereco, String telefone, String cEP, String cidade, String uF,	double limiteDeCredito, String cpf) {
		super(nome, endereco, telefone, cEP, cidade, uF, limiteDeCredito);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
}
