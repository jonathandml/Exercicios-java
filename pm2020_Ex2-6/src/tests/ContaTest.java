package tests;

import static org.junit.jupiter.api.Assertions.*;
import entities.Conta;

import org.junit.jupiter.api.Test;

class ContaTest {
	
	
	@Test
	public void depositTest() {
		Conta c1 = new Conta("Lucinda",12345);
		c1.depositar(200);
		assertEquals(200.0, c1.getSaldo());
	}
	
	@Test 
	public void withdrawTest() {
		Conta c2 = new Conta("Hamilton", 54321, 200.0);
		c2.sacar(50);
		assertEquals(150.0, c2.getSaldo());
	}
	
	/* 
	@Test
	public void CounterTest() {
		assertEquals(2, Conta.getContador());
	}
	*/
	
	 
	 
	
	

}
