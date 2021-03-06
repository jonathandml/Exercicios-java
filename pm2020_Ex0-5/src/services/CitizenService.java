package services;

import java.util.List;

import entities.Citizen;

public class CitizenService {
	
	public static double averageSalary(List<Citizen> list) {
		double sum = 0.0;
		for(Citizen c : list) {
			sum += c.getSalary();
		}
		return sum / list.size();
	}
	
	public static int averageNOfChildren(List<Citizen> list) {
		int sum = 0;
		for(Citizen c : list) {
			sum += c.getNumberOfChildren();
		}
		return sum / list.size();
	}
	
	public static double maxSalary(List<Citizen> list) {
		double max = 0;
		for(Citizen c : list) {
			if(max < c.getSalary())
				max = c.getSalary();
		}
		return max;
	}
	
	public static double richPercentage(List<Citizen> list) {
		int count = 0;
		for(Citizen c : list) {
			if(c.getSalary() >= 2000.00) {
				count++;
			}
		}
		return (double) count / list.size() * 100.0;
	}
	
	
}
