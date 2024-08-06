import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y = 32;
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.00;

		System.out.println(y);
		/*
		 * aqui basicamente a gente consegue demilitar a quantidade de casas decimais no
		 * caso ele aparece a virgula e para aparecer o ponto tem que adicionar um
		 * comando.
		 */

		/*
		 * aqui ele considera do Estados Unidos e ele considera o ponto na hora dos
		 * numeros quebrados
		 */

		System.out.printf("%.2f%n", x);
		System.out.printf("%.3f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.printf("Resultado com printf = %.2f metros%n", x);
		System.out.println("Resultado com println = " + x + " metros");
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

		System.out.println("----------------------WORK HOME------------------------");
		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.00;
		double price2 = 650.00;
		double measure = 53.234567;

		System.out.printf(
				"Produtcs:\n%s, which price is $ %.2f%n" + "%s, which price is $ %.2f%n \n"
						+ "Record: %d years old, code %d and gender: %s \n\n"
						+ "Measue with eight decimal places: %.8f%n" + "Rouded Three decimal places): %.3f%n",
				product1, price1, product2, price2, age, code, gender, measure, measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);

	}
}