package entities;

public class Funcionario extends PessoaFisica{
	
	private String cargo;
	private double salario;
	
	

	public Funcionario(String nome, String endereco, String telefone, String cEP, String cidade, String uF, String cpf, int idade, String cargo, double salario) {
		super(nome, endereco, telefone, cEP, cidade, uF, cpf, idade);
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	

}
