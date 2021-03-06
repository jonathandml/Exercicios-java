package entities;

import exception.WithdrawException;

public class Conta {
	private String titular;
	private int numero;
	private double saldo;
	
	public Conta(String titular, int numero) {
		this.titular = titular;
		this.numero = numero;
	}

	public Conta(String titular, int numero, double saldo) {
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
