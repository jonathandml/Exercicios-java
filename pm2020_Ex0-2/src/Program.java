import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String cpf;
		do {
			System.out.println("Digite o cpf");
			cpf = entrada.nextLine();
			if(cpf.length() != 9)
				System.out.println("Favor digitar um valor válido de 9 digitos");
			 
		}while(cpf.length() != 9);
		
		int somaDosProdutos = 0;
		int peso = cpf.length() + 1;
		for (int i = 0; i < cpf.length(); i++) {
			somaDosProdutos += Integer.parseInt(Character.toString(cpf.charAt(i))) * peso;
			peso --;
		}
		
		//System.out.println(somaDosProdutos);
		
		int dezena;
		if(somaDosProdutos % 11 == 0 || somaDosProdutos % 11 == 1) {
			dezena = 0;
		}else {
			dezena = 11 - (somaDosProdutos % 11);
		}
		
		peso = 11;
		int somaDosProdutos2 = 0;
		for (int i = 0; i < cpf.length(); i++) {
			somaDosProdutos2 += Integer.parseInt(Character.toString(cpf.charAt(i))) * peso;
			peso --;
		}
		somaDosProdutos2 += dezena * peso;
		
		//System.out.println(somaDosProdutos2);
		
		int unidade;
		if(somaDosProdutos2 % 11 == 0 || somaDosProdutos2 % 11 == 1) {
			unidade = 0;
		}else {
			unidade = 11 - (somaDosProdutos2 % 11);
		}
		
		
		System.out.printf("Digito verificador deste cpf: %d%d", dezena,unidade);
		//int n1 = Integer.parseInt(Character.toString(a.charAt(8)));
		entrada.close();
		
				
		

	}

}
