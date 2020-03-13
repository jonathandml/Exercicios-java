package entites;

public class LinhaHeranca extends Ponto{
	private int a;
	private int b;
	
	public LinhaHeranca(int x, int y, int a, int b) {
		super(x, y);
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	
	
	
}
