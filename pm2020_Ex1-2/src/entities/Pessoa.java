package entities;

public class Pessoa {
	private String nome;
	private String cpf;
	private int idade;
	private String sexo;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String cpf, int idade, String sexo) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public boolean eMaiorDeIdade() {
		return (idade >= 18);
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(nome + "\n");
		s.append(idade + " anos\n");
		s.append("Sexo: "+ sexo + "\n");
		s.append("cpf: "+ cpf + "\n");
		
		return s.toString();
	}
	
}
