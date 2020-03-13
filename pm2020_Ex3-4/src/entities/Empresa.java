package entities;

import java.util.ArrayList;
import java.util.List;

public class Empresa extends PessoaJuridica{
	
	private List<Cliente> clientes;
	private List<Funcionario> funcionarios;
	
	public Empresa(String nome, String endereco, String telefone, String cEP, String cidade, String uF, String cnpj) {
		super(nome, endereco, telefone, cEP, cidade, uF, cnpj);
		clientes = new ArrayList<Cliente>();
		funcionarios = new ArrayList<Funcionario>();
	}

	public Empresa(String nome, String endereco, String telefone, String cEP, String cidade, String uF, String cnpj, List<Cliente> clientes, List<Funcionario> funcionarios) {
		super(nome, endereco, telefone, cEP, cidade, uF, cnpj);
		this.clientes = clientes;
		this.funcionarios = funcionarios;
	}

	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void removeCliente(Cliente cliente) {
		clientes.remove(cliente);
	}
	
	public void addFuncionarios(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
	public void removeFuncionarios(Funcionario funcionario) {
		funcionarios.remove(funcionario);
	}
	
	
	

}
