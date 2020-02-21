package entities;

import exception.WithdrawException;

public class Conta {
	private String titular;
	private int numero;
	private double saldo;
	private static int contador = 0;
	
	public Conta(String titular, int numero) {
		this.titular = titular;
		this.numero = numero;
		contador++;
	}

	public Conta(String titular, int numero, double saldo) {
		contador++;
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
		
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public static int getContador() {
		return contador;
	}
	
	public void depositar(double quantia) {
		saldo += quantia;
	}
	
	public void sacar(double quantia) {
		if(quantia > saldo) {
			throw new WithdrawException("Saldo Insuficiente!!");
		}
		
		saldo -= quantia;
	}
	
	@Override
	public String toString() {
		
		return titular + ", conta " + numero + ", saldo: R$ " + String.format("%.2f", saldo); 
	}

	
	
	
	
	
	
	
	
	
}
