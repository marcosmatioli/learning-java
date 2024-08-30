import java.util.Locale;
import java.util.Scanner;

import method.Rectangle;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height:");
		Rectangle rec = new Rectangle();
		
		rec.width = sc.nextDouble();
		rec.height = sc.nextDouble();
		
		
		System.out.println("Area = "+ rec.area()+ "\nPerimeter = " +rec.perimeter() + "\nDiagonal = " + rec.diagonal());
	
		sc.close();
	}

}
