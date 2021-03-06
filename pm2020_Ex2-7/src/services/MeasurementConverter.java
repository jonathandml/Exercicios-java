package services;

public class MeasurementConverter {
	
	public static final double FEET_METERS = 3.2808;
	public static final double FEET_INCHES = 12.0;
	public static final double FEET_CENTIMETERS = 30.48;
	public static final double INCHES_METERS = 39.37;
	public static final double INCHES_CENTIMETERS = 2.54;
	public static final double METERS_CENTIMETERS = 100.0;
	
	public static double converterPesParaMetros(double valor) {	
		return valor / FEET_METERS;
	}
	
	public static double converterPesParaPolegadas(double valor) {
		return valor * FEET_INCHES;
	}
	
	public static double converterPesParaCentimetros(double valor) {
		return valor * FEET_CENTIMETERS;
	}
	
	public static double converterPolegadasParaMetros(double valor) {
		return valor / INCHES_METERS;
	}
	
	public static double converterPolegadasParaCentimetros(double valor) {
		return valor * INCHES_CENTIMETERS;
	}
	
	public static double converterPolegadasParaPes(double valor) {
		return valor / FEET_INCHES;
	}
	
	public static double converterMetrosParaPes(double valor) {
		return valor * FEET_METERS;
	}
	
	public static double converterMetrosParaPolegadas(double valor) {
		return valor * INCHES_METERS;
	}
	
	public static double converterMetrosParaCentimetros(double valor) {
		return valor * METERS_CENTIMETERS;
	}
	
	public static double converterCentimetrosParaPes(double valor) {
		return valor / FEET_CENTIMETERS;
	}
	
	public static double converterCentimetrosParaMetros(double valor) {
		return valor / METERS_CENTIMETERS;
	}
	
	public static double converterCentimetrosParaPolegadas(double valor) {
		return valor / INCHES_CENTIMETERS;
	}
	
}
