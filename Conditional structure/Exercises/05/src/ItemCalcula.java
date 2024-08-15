import java.util.Locale;
import java.util.Scanner;

public class ItemCalcula {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod = sc.nextInt();
		int qtd = sc.nextInt();
		
		double resultado = 0.0;
		
		if (cod == 1) {
			resultado = 4.00 * qtd;
		} else if (cod == 2) {
			resultado = 4.50 * qtd;
		} else if (cod == 3) {
			resultado = 5.00 * qtd;
		} else if (cod == 4) {
			resultado = 2.00 * qtd;
		} else if (cod == 5) {
			resultado = 1.50 * qtd;
		}
		
		System.out.printf("Total R$ %.2f%n", resultado);
		
		sc.close();
	}

}
