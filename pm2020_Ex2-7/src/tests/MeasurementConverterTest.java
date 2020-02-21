package tests;

import static org.junit.jupiter.api.Assertions.*;
import services.MeasurementConverter;

import org.junit.jupiter.api.Test;

class MeasurementConverterTest {
	
	@Test
	public void converterPesParaMetrosTest() {	
		assertEquals(3.66, MeasurementConverter.converterPesParaMetros(12),0.01);
	}
	
	@Test
	public void converterPesParaPolegadasTest() {
		assertEquals(144.0, MeasurementConverter.converterPesParaPolegadas(12),0.01);
	}
	@Test
	public void converterPesParaCentimetrosTest() {
		assertEquals(365.76, MeasurementConverter.converterPesParaCentimetros(12),0.01);
	}
	@Test
	public void converterPolegadasParaMetrosTest() {
		assertEquals(3.66, MeasurementConverter.converterPolegadasParaMetros(144),0.01);
	}
	@Test
	public void converterPolegadasParaCentimetrosTest() {
		assertEquals(365.76, MeasurementConverter.converterPolegadasParaCentimetros(144),0.01);
	}
	@Test
	public void converterPolegadasParaPesTest() {
		assertEquals(12.0, MeasurementConverter.converterPolegadasParaPes(144),0.01);
	}
	@Test
	public void converterMetrosParaPesTest() {
		assertEquals(6.56, MeasurementConverter.converterMetrosParaPes(2),0.01);
	}
	@Test
	public void converterMetrosParaPolegadasTest() {
		assertEquals(78.74, MeasurementConverter.converterMetrosParaPolegadas(2),0.01);
	}
	@Test
	public void converterMetrosParaCentimetrosTest() {
		assertEquals(200, MeasurementConverter.converterMetrosParaCentimetros(2),0.01);
	}
	@Test
	public void converterCentimetrosParaPesTest() {
		assertEquals(6.56, MeasurementConverter.converterCentimetrosParaPes(200),0.01);
	}
	@Test
	public void converterCentimetrosParaMetrosTest() {
		assertEquals(2, MeasurementConverter.converterCentimetrosParaMetros(200),0.01);
	}
	@Test
	public void converterCentimetrosParaPolegadasTest() {
		assertEquals(78.74, MeasurementConverter.converterCentimetrosParaPolegadas(200),0.01);
	}

}
