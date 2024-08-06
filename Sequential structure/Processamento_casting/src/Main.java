
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double b,B,h,area;
		
		/*
		 * importante colocar .0 se for double
		 * importante colocar f na frente do numero para dizer que ele é float
		 * */
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b+B) / 2.0 * h;
		
		System.out.println(area);
		
		int a,p;
		double resultado;
		
		a = 5;
		p = 2;
		/*
		 * adicionando um (double) a gente faz um casting e ele entende
		 * */
		System.out.println(resultado = (double) a / p);
		
		double l;
		int k;
		/*
		 * aqui utilizamos um casting de int para dizer que não importa o valor que é para ele tentar
		 * */
		l = 5.0;
		k = (int) l;
		System.out.println(k);
	}

}
