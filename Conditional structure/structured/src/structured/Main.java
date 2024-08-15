package structured;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Que hora são?");

		int x = sc.nextInt();

		if (x < 12) {
			System.out.println("Bom Dia");
		} else if (x < 18) {
			System.out.println("Bom Tarde");
		} else {
			System.out.println("Bom Noite");
		}
		sc.close();
	}

}
