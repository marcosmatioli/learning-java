import java.util.Locale;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, horas;
		double salary,horas_salario;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Number,work hours and work value:");
		num = sc.nextInt();
		horas = sc.nextInt();
		horas_salario = sc.nextDouble();
		sc.close();
		salary = horas_salario *(double) horas; 
		System.out.printf("NUMBER = %d \n SALARY = U$ %.2f%n", num,salary);
	}

}