package entities;

public class SUV extends Veiculo{
	private int comprimento;
	
	public SUV(String modelo, double preco, String cor, int comprimento) {
		super(modelo, preco, cor);
		this.comprimento = comprimento;
	}

	@Override
	public double getPreco() {
		if(comprimento > 6)
			return super.getPreco() - super.getPreco() * 0.05;
		return super.getPreco() - super.getPreco() * 0.1;
	}
	
	@Override
	public String toString() {
		return super.toString() + " - " + comprimento + " metros";
	}
}
