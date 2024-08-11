import java.util.Locale;
import java.util.Scanner;

public class Circulo_Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double pi = 3.14159;
		double raio, area;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o raio:");
		raio = sc.nextDouble();
		area = pi * Math.pow(raio, 2);
		sc.close();
		System.out.printf("Area = %.4f%n", area);
	}

}
