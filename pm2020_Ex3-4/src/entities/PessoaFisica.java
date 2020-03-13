package entities;

public class PessoaFisica extends Pessoa{
	private String cpf;
	private int idade;
	
	public PessoaFisica() {
		
	}
	
	public PessoaFisica(String nome, String endereco, String telefone, String cEP, String cidade, String uF, String cpf, int idade) {
		super(nome, endereco, telefone, cEP, cidade, uF);
		this.cpf = cpf;
		this.idade = idade;
	}
	
	public PessoaFisica(int idade) {
		this.idade = idade;
	}


	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public boolean eMaior() {
		return this.idade >= 18;
	}
	
	
	
	
	
}
