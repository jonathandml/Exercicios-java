package entities;

public class Citizen {
	private double salary;
	private int age;
	private int NumberOfChildren;
	
	public Citizen(double salary, int age, int numberOfChildren) {
		this.salary = salary;
		this.age = age;
		NumberOfChildren = numberOfChildren;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumberOfChildren() {
		return NumberOfChildren;
	}

	public void setNumberOfChildren(int numberOfChildren) {
		NumberOfChildren = numberOfChildren;
	}

	
	
}
