package entities;

public class Utilitario extends Veiculo{
	
	private double descontoDeFabrica;	
	
	public Utilitario(String modelo, double preco, String cor, double descontoDeFabrica) {
		super(modelo, preco, cor);
		this.descontoDeFabrica = descontoDeFabrica;
	}

	@Override
	public double getPreco() {
		return super.getPreco() - super.getPreco() * (descontoDeFabrica/100); 
	}
	
	@Override
	public String toString() {
		return super.toString() + " - com desconto de " + descontoDeFabrica + "%"; 
	}

}
