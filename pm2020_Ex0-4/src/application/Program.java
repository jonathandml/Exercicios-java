/*
 * Sistema de avaliação: 
 *  - 5 provas de 20 pontos
 *  - alunos com 60 pontos ou mais são aprovados
 *  - alunos com menos de 60 e com 40 ou mais pontos tem direito a um exame reavaliativo
 *  - alunos com menos de 40 pontos são reprovados direto
 *  
 *  Entrada de dados feita atraves de um arquivo .csv
 *   - campos separados por virgula
 *   - arquivo de teste na pasta do projeto
 */

package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o caminho do arquivo de entrada: ");
		String path = entrada.nextLine();

		Student[] list = new Student[15]; 

		try (BufferedReader file = new BufferedReader(new FileReader(path))) {
			String line = file.readLine();
			int i = 0;
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				double nota1 = Double.parseDouble(fields[1]);
				double nota2 = Double.parseDouble(fields[2]);
				double nota3 = Double.parseDouble(fields[3]);
				double nota4 = Double.parseDouble(fields[4]);
				double nota5 = Double.parseDouble(fields[5]);
				list[i] = new Student(name, nota1, nota2, nota3, nota4, nota5);
				i++;
				line = file.readLine();
			}

		} catch (IOException e) {
			System.out.println("Erro na leitura do arquivo");
		}
		
		System.out.println();
		
		double soma = 0.0;
		for (Student a : list) {
			System.out.println(a);
			soma += a.finalGrade();
			System.out.println("---------------------------------------");
		}
		System.out.println();
		System.out.printf("Média da classe: %.2f", soma / list.length);

		entrada.close();

	}

}
