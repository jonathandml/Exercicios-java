package application;

import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno: ");
		String nome = entrada.nextLine();
		System.out.println("Digite a matricula do aluno: ");
		int matricula = entrada.nextInt();
		System.out.println("Digite a carga horaria: ");
		int cargaHoraria = entrada.nextInt();
		
		Aluno a = new Aluno(nome, matricula, cargaHoraria);
		
		System.out.println(a);
		System.out.println("Login: " + a.getLogin());
		
		entrada.close();
		

	}

}
