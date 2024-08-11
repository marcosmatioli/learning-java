import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c,d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com os 4 valores para saber a diferença:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		sc.close();
		System.out.println("A diferença entre A e B com relação a C e D é: "+ (a*b-c*d));
		
	}

}
