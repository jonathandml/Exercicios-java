package application;

import java.util.Scanner;

import entities.Conta;
import exception.WithdrawException;

public class Program {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Conta conta;

		try {
			System.out.println("Digite o numero da conta: ");
			int numero = entrada.nextInt();
			System.out.println("Digite o nome do titular: ");
			entrada.nextLine();
			String titular = entrada.nextLine();
			System.out.println("Deseja fazer um depósito inicial? s/n");
			char op = entrada.nextLine().charAt(0);
			if (op == 's') {
				System.out.println("Digite o valor do depósito: ");
				double valorInicial = entrada.nextDouble();
				conta = new Conta(titular, numero, valorInicial);
			} else {
				conta = new Conta(titular, numero);
			}
			System.out.println("--------------------------");
			System.out.println("Dados da conta");
			System.out.println(conta);
			System.out.println("--------------------------");
			System.out.println();
			System.out.println("Digite a quantia a ser depositada: ");
			double quantia = entrada.nextDouble();
			conta.depositar(quantia);
			System.out.println("--------------------------");
			System.out.println();
			System.out.println("Dados da conta atualizados");
			System.out.println(conta);
			System.out.println("--------------------------");
			System.out.println();
			System.out.println("Digite a quantia a ser sacada: ");
			quantia = entrada.nextDouble();
			conta.sacar(quantia);
			System.out.println("--------------------------");
			System.out.println();
			System.out.println("Dados da conta");
			System.out.println(conta);
		} catch (WithdrawException e) {
			System.out.println(e.getMessage());
		}
		
		entrada.close();

	}

}
