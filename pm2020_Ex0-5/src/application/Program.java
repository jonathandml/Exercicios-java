package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Citizen;
import services.CitizenService;



public class Program {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o caminho do arquivo de entrada: ");
		String path = entrada.nextLine();

		List<Citizen> list = new ArrayList<>(); 

		try (BufferedReader file = new BufferedReader(new FileReader(path))) {
			String line = file.readLine();
			
			while (line != null) {
				String[] fields = line.split(",");
				double salary = Double.parseDouble(fields[0]);
				int age = Integer.parseInt(fields[1]);
				int numberOfChildren = Integer.parseInt(fields[2]);
				
				list.add(new Citizen(salary, age, numberOfChildren));
				line = file.readLine();
			}

		} catch (IOException e) {
			System.out.println("Erro na leitura do arquivo");
		}
		
		System.out.printf("Média de salário: R$%.2f\n",CitizenService.averageSalary(list));
		System.out.println("Média do número de filhos: " + CitizenService.averageNOfChildren(list));
		System.out.println("Maior salário: " + CitizenService.maxSalary(list));
		System.out.printf("%.1f%% dos habitantes possui salário maior que R$2000.0\n",CitizenService.richPercentage(list));
		entrada.close();

	}

}
