package entities;

public class Veiculo {
	protected String modelo;
	protected double preco;
	protected String cor;
	
	
	
	public Veiculo(String modelo, double preco, String cor) {
		this.modelo = modelo;
		this.preco = preco;
		this.cor = cor;
	}

	public double getPreco() {
		return preco;
	}
	
	@Override
	public String toString() {
		return modelo + " " + cor +" - R$" + String.format("%.2f", getPreco());
	}
}
