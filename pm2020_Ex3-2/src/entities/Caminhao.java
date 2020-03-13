package entities;

public class Caminhao extends Veiculo{
	
	private int carga;
	
	public Caminhao(String modelo, double preco, String cor, int carga) {
		super(modelo, preco, cor);
		this.carga = carga;
	}

	@Override
	public double getPreco() {
		if(carga > 2000)
			return super.getPreco() - super.getPreco() * 0.1;
		return super.getPreco() - super.getPreco() * 0.2;
	}
	
	@Override
	public String toString() {
		return super.toString() + " - carga: " + carga + " quilos";
	}
}
