package entities;

import java.util.ArrayList;
import java.util.List;
import entities.enums.Situation;


public class Student {
	
	private String name;
	private Situation situation;
	private List<Double> grades = new ArrayList<>();
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student(String name, double nota1,double nota2,double nota3,double nota4,double nota5) {
		this.name = name;
		grades.add(nota1);
		grades.add(nota2);
		grades.add(nota3);
		grades.add(nota4);
		grades.add(nota5);
		defineSituation();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Situation getSituation() {
		return situation;
	}

	public void addGrade(double grade) {
		grades.add(grade);
	}
	
	public double finalGrade() {
		return grades.stream().reduce(0.0, Double::sum);
	}
	
	public double averageGrade() {
		return grades.stream().reduce(0.0, Double::sum) / grades.size();
	}
	
	public void defineSituation() {
		if(grades.stream().reduce(0.0, Double::sum) >= 60.0)
			situation = Situation.APROVADO;
		else if(grades.stream().reduce(0.0, Double::sum) >= 40)
			situation = Situation.EXAME;
		else
			situation = Situation.REPROVADO;
	}
	
	@Override
	public String toString() {
		return String.format("Aluno: %s\nMédia: %.1f\nSituação: %s", name, averageGrade(), situation.toString());
	}
	
	
}
