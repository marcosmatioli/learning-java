import java.util.Locale;
import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int soma = 0;
		/*
		 * como eu não coloquei =< então ele vai até ser maior o numero, se fosse igual ele ia parar no 4
		 * mas como não coloquei então vai até 5 mesmo
		 * */
		for(int j = 0;j < x;j++) {
			int i = sc.nextInt();
			soma += x;
		}
			
		System.out.println(soma);
		sc.close();
	}

}
