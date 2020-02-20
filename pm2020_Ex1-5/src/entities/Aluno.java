package entities;

public class Aluno {
	private String nome;
	private Integer numeroDeMatricula;
	private Integer cargaHoraria;
	private String login;
	
	public Aluno(String nome, int numeroDeMatricula, int cargaHoraria) {
		this.nome = nome;
		this.numeroDeMatricula = numeroDeMatricula;
		this.cargaHoraria = cargaHoraria;
		criarLogin();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroDeMatricula() {
		return numeroDeMatricula;
	}

	public void setNumeroDeMatricula(int numeroDeMatricula) {
		this.numeroDeMatricula = numeroDeMatricula;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getLogin() {
		return login;
	}
	
	private void criarLogin() {
		login = nome.substring(0, 4) + numeroDeMatricula.toString().substring(0, 3);
	}
	
	@Override
	public String toString() {
		return "Aluno: " + nome + "\nNumero de Matricula: " + numeroDeMatricula + "\nCarga Horaria: " + cargaHoraria;
	}
	
	
	
	
	
}
