import java.util.Scanner;

public class Program {
	public static void main(String args[]) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite quantos numeros deseja cadastrar");
		int n = entrada.nextInt();
		int num[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Digite o " + (i + 1) + " numero : ");
			num[i] = entrada.nextInt();
		}
		int cont;
		for (int i = 0; i < n; i++) {
			cont = 0;
			for (int j = 1; j <= num[i]; j++) {

				if (num[i] % j == 0)
					cont++;
			}

			if (cont <= 2) {
				System.out.println("Numero primo : " + num[i] + " na posicao " + i);
			}
		}
		entrada.close();
	}
}
