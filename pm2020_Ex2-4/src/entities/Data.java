package entities;

import java.util.Calendar;
import java.util.GregorianCalendar;

import exceptions.DataException;

public class Data {
	private int dia;
	private int mes;
	private int ano;

	public Data() {
		Calendar c = GregorianCalendar.getInstance();
		dia = c.get(Calendar.DAY_OF_MONTH);
		mes = c.get(Calendar.MONTH) + 1;
		ano = c.get(Calendar.YEAR);
	}

	public Data(int dia, int mes, int ano) {
		if (ano <= 0) {
			throw new DataException("Erro, O ano não pode ser 0 ou negativo");
		}
		this.ano = ano;
		if (mes > 12 || mes <= 0) {
			throw new DataException("Erro, Valor inválido para o mês, aceito somente valores de 1 a 12");
		}
		this.mes = mes;
		if (dia > diasNoMes() || dia <= 0) {
			throw new DataException(
					"Erro, Valor inválido para o dia do mes, aceito somente valores de 1 a " + diasNoMes());
		}
		this.dia = dia;

	}

	public Data(String date) {
		String[] fields = date.split("/");
		if (fields.length < 3) {
			throw new DataException("Erro, formato de data errado, o formato correto é 'dia/mes/ano'");
		}

		int dia = Integer.parseInt(fields[0]);
		int mes = Integer.parseInt(fields[1]);
		int ano = Integer.parseInt(fields[2]);

		if (ano <= 0) {
			throw new DataException("Erro, O ano não pode ser 0 ou negativo");
		}
		this.ano = ano;
		if (mes > 12 || mes <= 0) {
			throw new DataException("Erro, Valor inválido para o mês, aceito somente valores de 1 a 12");
		}
		this.mes = mes;
		if (dia > diasNoMes() || dia <= 0) {
			throw new DataException(
					"Erro, Valor inválido para o dia do mes, aceito somente valores de 1 a " + diasNoMes());
		}
		this.dia = dia;

	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	public void adicionaDias(int dias) {
		for (int i = 0; i < dias; i++)
			proximoDia();
	}

	public int diasNoMes() {
		switch (mes) {
		case 1:
			return 31;
		case 2:
			if (eAnoBisexto())
				return 29;
			else
				return 28;
		case 3:
			return 31;
		case 4:
			return 30;
		case 5:
			return 31;
		case 6:
			return 30;
		case 7:
			return 31;
		case 8:
			return 31;
		case 9:
			return 30;
		case 10:
			return 31;
		case 11:
			return 30;
		case 12:
			return 31;
		default:
			return -1;
		}

	}

	public String diaDaSemana() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, ano);
		c.set(Calendar.MONTH, mes - 1);
		c.set(Calendar.DAY_OF_MONTH, dia);
		switch (c.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			return "Domingo";
		case 2:
			return "Segunda-feira";
		case 3:
			return "Terca-feira";
		case 4:
			return "Quarta-feira";
		case 5:
			return "Quinta-feira";
		case 6:
			return "Sexta-feira";
		case 7:
			return "Sabado";
		default:
			return "Deu ruim";
		}

	}

	public boolean eAnoBisexto() {
		return (ano % 4 == 0);
	}

	public void proximoDia() {
		if (dia + 1 > diasNoMes()) {
			dia = 1;
			if (mes == 12) {
				mes = 1;
				ano++;
			} else {
				mes++;
			}

		} else {
			dia++;
		}
	}

	public String porExtenso() {
		String mesPorExtenso = "";
		switch (mes) {
		case 1:
			mesPorExtenso = "janeiro";
			break;
		case 2:
			mesPorExtenso = "fervereiro";
			break;
		case 3:
			mesPorExtenso = "marco";
			break;
		case 4:
			mesPorExtenso = "abril";
			break;
		case 5:
			mesPorExtenso = "maio";
			break;
		case 6:
			mesPorExtenso = "junho";
			break;
		case 7:
			mesPorExtenso = "julho";
			break;
		case 8:
			mesPorExtenso = "agosto";
			break;
		case 9:
			mesPorExtenso = "setembro";
			break;
		case 10:
			mesPorExtenso = "outubro";
			break;
		case 11:
			mesPorExtenso = "novembro";
			break;
		case 12:
			mesPorExtenso = "dezembro";
			break;
		default:
			break;
		}

		return dia + " de " + mesPorExtenso + " de " + ano;
	}

	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		String aux = (dia < 10) ? "0" + dia + "/" : dia + "/";
		s.append(aux);
		aux = (mes < 10) ? "0" + mes + "/" : mes + "/";
		s.append(aux + ano);
		return s.toString() + " - " + diaDaSemana();
	}

}
