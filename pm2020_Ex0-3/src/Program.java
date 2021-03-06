/*
  NOTA: Esta solução funciona parcialmente,
  para valores de x maiores que 31 não funciona.
  Não consegui resolver =(.
 */
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor de x");
		double x = entrada.nextDouble();
		int n = 1;
		int i = 1;
		double seno = 0;
		int elementos = 0;
		
		
		
		while (i < 200) {
			if(i % 2 == 0) {
				seno -= calcXnSobreXfact(x, n);
			}else {
				seno += calcXnSobreXfact(x, n);
			}
			if(Math.abs(Math.sin(x) - seno) < 0.0001) {
				elementos = i;
				break;
			}
			i++;
			n += 2;
		}
		System.out.printf("seno = %.4f\n",seno);
		System.out.printf("Math.sin(x) = %.4f\n",Math.sin(x));
		if(elementos > 0)
			System.out.println("Nº de elementos necessários para que seja verdadeiro com 4 casas decimais:" + elementos);
		else
			System.out.println("Não foi possivel provar esta equação");
		entrada.close();

	}
	
	static double fatorial(double x) {
		double fact = 1;
		while(x > 0) {
			fact *= x;
			x--;
		}
		return fact;
	}
	
	static double calcXnSobreXfact(double x, double n) {
		return (Math.pow(x, n) / fatorial(n));
	}

}
