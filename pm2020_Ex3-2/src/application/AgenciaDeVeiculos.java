package application;

import entities.Caminhao;
import entities.SUV;
import entities.Utilitario;
import entities.Veiculo;

public class AgenciaDeVeiculos {

	public static void main(String[] args) {
		Veiculo v1 = new Veiculo("Fusca",12000,"Preto");
		Veiculo v2 = new Caminhao("Mercedes-Benz Axor", 300000.0, "Vermelho", 2500);
		Veiculo v3 = new Caminhao("Hyundai HR", 120000.0, "Branco", 1800);
		Veiculo v4 = new Utilitario("Peugeot Expert", 100000, "Prata", 5);
		Veiculo v5 = new SUV("Citroen Aircross", 80000, "Azul", 5);
		Veiculo v6 = new SUV("KIA Sportage", 90000, "Amarelo", 7);
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v6);
		

	}

}
