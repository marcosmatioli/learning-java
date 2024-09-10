import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;
public class Main {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price?");
		CurrencyConverter.dollarCotacao = sc.nextDouble();
		
		System.out.println("How many dollar will be bought?");
		CurrencyConverter.buyDollar = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais: %.2f%n ", CurrencyConverter.reais(CurrencyConverter.converter()));
		
		sc.close();
	}

}
