package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Data;
import exceptions.DataException;

public class Program {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		try {
			Data dataAtual = new Data();
			System.out.println("entre com uma data: ");
			System.out.print("Dia: ");
			int dia = entrada.nextInt();
			System.out.print("Mes: ");
			int mes = entrada.nextInt();
			System.out.print("Ano: ");
			int ano = entrada.nextInt();
			Data dataUsuario = new Data(dia, mes, ano);

			System.out.println("Data atual: " + dataAtual);
			System.out.println("Data Digitada: " + dataUsuario);
			System.out.println("Digite quantos dias deseja avançar: ");
			int dias = entrada.nextInt();
			dataUsuario.adicionaDias(dias);
			System.out.println("Data atualizada: " + dataUsuario);
		} catch (DataException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Erro na entrada de dados, apenas valores inteiros são válidos para data");
		}

		entrada.close();

	}

}
