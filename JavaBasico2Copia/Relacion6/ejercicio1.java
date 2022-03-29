import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a;
		String b;
		
		System.out.println("Introduce un palabra");
		 a=s.nextLine();
		 System.out.println("Introduce otra palabra");
		 b=s.nextLine();
		 
		 
		 System.out.println("La primera palabra tiene "+a.length()+" palabras y la segunda palabra tiene "+ b.length()+" palabras");
		 System.out.println("Por lo tanto");
		 
		 int salida= a.compareTo(b);
		 
		if (salida==0) {
			
			System.out.println("Las 2 palabras son iguales");
		}else {
			if (salida==1) {
				
				System.out.println("La primera palabra es mayor");
			}else {

					System.out.println("La segunda palabra es mayor");
				
			}

	}

}
}
