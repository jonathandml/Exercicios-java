package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many students for course A?");
		int a = sc.nextInt();
		Set<Student> A = new HashSet<>();
		for (int i = 0; i < a; i++) {
			System.out.print("Student " + (i+1) +": ");
			A.add(new Student(sc.nextInt()));
		}
		
		System.out.print("How many students for course A?");
		int b = sc.nextInt();
		Set<Student> B = new HashSet<>();
		for (int i = 0; i < b; i++) {
			System.out.print("Student " + (i+1) +": ");
			B.add(new Student(sc.nextInt()));
		}
		
		System.out.print("How many students for course A?");
		int c = sc.nextInt();
		Set<Student> C = new HashSet<>();
		for (int i = 0; i < c; i++) {
			System.out.print("Student " + (i+1) +": ");
			C.add(new Student(sc.nextInt()));
		}
		
		Set<Student> total = new HashSet<>();
		total.addAll(A);
		total.addAll(B);
		total.addAll(C);
		System.out.println("Total students: " + total.size());
		sc.close();
		
	}
}
