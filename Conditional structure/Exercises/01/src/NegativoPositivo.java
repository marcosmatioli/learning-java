import java.util.Scanner;

public class NegativoPositivo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		if (x >= 0) {
			System.out.println("Não negativo");
		} else {
			System.out.println("Negativo");
		}
		sc.close();
	}
}
