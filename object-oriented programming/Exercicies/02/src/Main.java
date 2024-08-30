import java.util.Locale;
import java.util.Scanner;

import entities.Employer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employer emp = new Employer();
		
		System.out.println("Name: ");
		emp.name = sc.next();
		System.out.println("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println("Employer: "+ emp);
		
		System.out.println("Wihch percentage to increase salary? ");
		emp.increseSalary(sc.nextDouble());
		
		System.out.println("Update data: "+ emp);
		
		sc.close();
	}

}
