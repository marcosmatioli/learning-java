import java.util.Scanner;

public class ImparPar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		x = x % 2;

		if (x == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
		sc.close();
	}
}
