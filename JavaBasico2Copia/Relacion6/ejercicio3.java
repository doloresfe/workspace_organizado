import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String a;
		String b="fin";
		String resultado;
		int cont=0;
		
		do {
			
			System.out.println("Introduce un palabra, cuando quieras terminar pon fin");
			 a=s.nextLine();
			
			 
	String palabra2 = a.toLowerCase();
			 
	 resultado = a.concat(a);
	 
			 
			
		} while (!a.equals(b));
		
	
			
		System.out.println(resultado);	
	}

}
