import java.util.Scanner;

public class DuracaoJogo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int dia = 24;
		int resultado;

		if (horaInicial >= horaFinal) {
			resultado = dia - Math.abs(horaInicial - horaFinal);
		} else {
			resultado = horaFinal - horaInicial;
		}
		System.out.println("O JOGO DUROU: " + resultado + " HORA(S)");

		sc.close();
	}

}
