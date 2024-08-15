import java.util.Scanner;

public class MultiplosNaoMultiplo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int resultado;
		if(a > b) {
			resultado = a % b;
			if(resultado == 0) {
				System.out.println("São Múltiplos");
			}else {
				System.out.println("Não são Multiplos");
			}
		}else{
			resultado = b % a;
			if(resultado == 0) {
				System.out.println("São Múltiplos");
			}else {
				System.out.println("Não são Multiplos");
			}
		}
		sc.close();
	}

}
