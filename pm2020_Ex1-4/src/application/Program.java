package application;

import services.MeasurementConverter;

public class Program {

	public static void main(String[] args) {
		
		
		System.out.println("200 centímetros equivale a "+MeasurementConverter.converterCentimetrosParaMetros(200)+" metros");
		System.out.println("200 centímetros equivale a "+MeasurementConverter.converterCentimetrosParaPes(200)+" pés");
		System.out.println("200 centímetros equivale a "+MeasurementConverter.converterCentimetrosParaPolegadas(200)+" polegadas");
		System.out.println("2 metros equivale a "+MeasurementConverter.converterMetrosParaCentimetros(2)+" centímetros");
		System.out.println("2 metros equivale a "+MeasurementConverter.converterMetrosParaPes(2)+" pés");
		System.out.println("2 metros equivale a "+MeasurementConverter.converterMetrosParaPolegadas(2)+" polegadas");
		System.out.println("12 pés equivale a "+MeasurementConverter.converterPesParaCentimetros(12)+"centímetros");
		System.out.println("12 pés equivale a "+MeasurementConverter.converterPesParaMetros(12)+" metros");
		System.out.println("12 pés equivale a "+MeasurementConverter.converterPesParaPolegadas(12)+" polegadas");
		System.out.println("144 polegadas equivale a "+MeasurementConverter.converterPolegadasParaCentimetros(144)+" centímetros");
		System.out.println("144 polegadas equivale a "+MeasurementConverter.converterPolegadasParaMetros(144)+" metros");
		System.out.println("144 polegadas equivale a "+MeasurementConverter.converterPolegadasParaPes(144)+" pés");

	}

}
