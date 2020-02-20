package application;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("João da Silva","10110110110", 20,"Masculino");
		System.out.println(p);
		if(p.eMaiorDeIdade())
			System.out.println(p.getNome() + " é Maior de Idade");
		else
			System.out.println(p.getNome() + " não é Maior de Idade");
		
		System.out.println("--------------------------------");
		Pessoa p2 = new Pessoa("Maria Genoveva","20220220220", 17,"Feminino");
		System.out.println(p2);
		if(p.eMaiorDeIdade())
			System.out.println(p2.getNome() + " é Maior de Idade");
		else
			System.out.println(p2.getNome() + " não é Maior de Idade");

	}

}
