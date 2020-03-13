package entities;

public abstract class Cliente extends Pessoa{
	
	private double limiteDeCredito;

	public Cliente(String nome, String endereco, String telefone, String cEP, String cidade, String uF, double limiteDeCredito) {
		super(nome, endereco, telefone, cEP, cidade, uF);
		this.limiteDeCredito = limiteDeCredito;
	}

	public double getLimiteDeCredito() {
		return limiteDeCredito;
	}

	public void setLimiteDeCredito(double limiteDeCredito) {
		this.limiteDeCredito = limiteDeCredito;
	}
	
	
	
	
	
}
