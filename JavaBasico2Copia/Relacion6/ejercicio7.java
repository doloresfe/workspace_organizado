import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce uan frase");
		 String frase=s.nextLine();
		 System.out.println("Indroduce una palabra");
		String palabra=s.nextLine();
		
		
		for (int i = 0; i < frase.length(); i++) {
			
			if (palabra.equals(frase)) {
				
				int conta=0;
				
				System.out.println("La palabra se repite en esta frase "+conta);

		}
			
		}

}
}
