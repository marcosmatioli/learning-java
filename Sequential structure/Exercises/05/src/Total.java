import java.util.Locale;
import java.util.Scanner;

public class Total {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int cod1,cod2, qt1, qt2;
		double valor1,valor2,total;
		
		/*
		 * Peça 1
		 * */
		cod1 = sc.nextInt();
		qt1 = sc.nextInt();
		valor1 = sc.nextDouble();
		/*
		 * Peça 2
		 * */
		cod2 = sc.nextInt();
		qt2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		sc.close();
		
		total = (qt1 * valor1) + (qt2 * valor2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",total);
	}

}