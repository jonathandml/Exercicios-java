package entites;

public class Linha {
	private Ponto pontoInicial;
	private Ponto pontoFinal;
	
	public Linha(Ponto pontoInicial, Ponto pontoFinal) {
		this.pontoInicial = pontoInicial;
		this.pontoFinal = pontoFinal;
	}

	public Ponto getPontoInicial() {
		return pontoInicial;
	}

	public void setPontoInicial(Ponto pontoInicial) {
		this.pontoInicial = pontoInicial;
	}

	public Ponto getPontoFinal() {
		return pontoFinal;
	}

	public void setPontoFinal(Ponto pontoFinal) {
		this.pontoFinal = pontoFinal;
	}
	
	
	
	
}
