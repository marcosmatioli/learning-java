import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String x;
		int y;
		double k;
		char m;

		x = sc.next();
		y = sc.nextInt();
		k = sc.nextDouble();
		m = sc.next().charAt(0);
		System.out.println("Seu nome é: " + x + ", e sua idade é: " + y + " e sua renda é: " + k + "e do sexo: " + m);
		System.out.printf("Seu nome é: %s  e sua idade é: %d e sua renda é: %.3f%ne do sexo: %s ", x, y, k, m);

		System.out.println("--------------------------");
		/*
		 * tem que tomar cuidado com a saida isso se da ao nextline e o next, não da pra
		 * entrar com o ultimo dado que no caso é o s3
		 */
		String s1, s2, s3;
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc.close();
	}

}