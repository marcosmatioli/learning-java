import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y, resultado;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		sc.close();
		resultado = x + y;
		System.out.println("A soma dos dois valores é: "+resultado);
	}

}
