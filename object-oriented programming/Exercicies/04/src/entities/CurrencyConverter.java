package entities;

public class CurrencyConverter {

	public static double dollarCotacao = 0;
	public static double reais = 0;
	public static double buyDollar = 0;
	public static final double IOF = 0.06;
	
	public static double converter() {
		return reais = dollarCotacao * buyDollar;
	}
	public static double reais(double amount) {
		return reais += amount * IOF;
	}
}
