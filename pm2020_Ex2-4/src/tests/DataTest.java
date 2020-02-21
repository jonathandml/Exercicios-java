package tests;

import static org.junit.jupiter.api.Assertions.*;
import entities.Data;
import org.junit.jupiter.api.Test;

class DataTest {
	
	@Test
	public void nextDaySameMonthTest() {
		Data d = new Data("21/08/2020");
		d.proximoDia();
		assertEquals(22, d.getDia());
		assertEquals(8, d.getMes());
		assertEquals(2020, d.getAno());
	}
	
	@Test
	public void nextDayDifferentMonthTest() {
		Data d = new Data("31/08/2020");
		d.proximoDia();
		assertEquals(1, d.getDia());
		assertEquals(9, d.getMes());
		assertEquals(2020, d.getAno());
	}
	
	@Test
	public void nextDayDifferentYearTest() {
		Data d = new Data("31/12/2020");
		d.proximoDia();
		assertEquals(1, d.getDia());
		assertEquals(1, d.getMes());
		assertEquals(2021, d.getAno());
	}
	
	@Test
	public void leapYearTest() {
		assertEquals(true, new Data("01/01/2020").eAnoBisexto());
		assertEquals(false, new Data("01/01/2021").eAnoBisexto());
		assertEquals(false, new Data("01/01/2022").eAnoBisexto());
		assertEquals(false, new Data("01/01/2023").eAnoBisexto());
		assertEquals(true, new Data("01/01/2024").eAnoBisexto());
	}
	
	@Test
	public void dayOfWeekTest() {
		assertEquals("Domingo", new Data("16/02/2020").diaDaSemana());
		assertEquals("Segunda-feira", new Data("17/02/2020").diaDaSemana());
		assertEquals("Terca-feira", new Data("18/02/2020").diaDaSemana());
		assertEquals("Quarta-feira", new Data("19/02/2020").diaDaSemana());
		assertEquals("Quinta-feira", new Data("20/02/2020").diaDaSemana());
		assertEquals("Sexta-feira", new Data("21/02/2020").diaDaSemana());
		assertEquals("Sabado", new Data("22/02/2020").diaDaSemana());
		
	}
	
	@Test
	public void addDaysSameMonthTest() {
		Data d = new Data("21/08/2020");
		d.adicionaDias(8);
		assertEquals(29, d.getDia());
		assertEquals(8, d.getMes());
		assertEquals(2020, d.getAno());
	}
	
	@Test
	public void addDaysDifferentMonthTest() {
		Data d = new Data("29/08/2020");
		d.adicionaDias(8);
		assertEquals(6, d.getDia());
		assertEquals(9, d.getMes());
		assertEquals(2020, d.getAno());
	}
	
	@Test
	public void addDaysDifferentYearTest() {
		Data d = new Data("29/12/2020");
		d.adicionaDias(8);
		assertEquals(6, d.getDia());
		assertEquals(1, d.getMes());
		assertEquals(2021, d.getAno());
	}
	
	@Test
	public void inFullTest() {
		assertEquals("15 de maio de 2020", new Data("15/05/2020").porExtenso());
		
	}
	
	

}
