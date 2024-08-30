import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student aluno = new Student();

		System.out.println("Digite o nome do aluno: ");
		aluno.name = sc.next();

		System.out.println("Entre com as 3 notas do aluno: ");

		aluno.p1 = sc.nextDouble();
		aluno.p2 = sc.nextDouble();
		aluno.p3 = sc.nextDouble();

		System.out.println(aluno.toString());
		
		sc.close();
	}

}
