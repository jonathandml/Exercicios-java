package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import entities.PessoaFisica;

class PessoaFisicaTest {

	@Test
	void eMaiorTest() {
		assertTrue(new PessoaFisica(18).eMaior());
		assertFalse(new PessoaFisica(17).eMaior());
	}

}
