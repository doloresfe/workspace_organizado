import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String cadena="";
		System.out.println("Dime una frase para posteriormnete darle la vuelta");
		String a=s.nextLine();
		
	
		
		for (int i = a.length()-1; i >=0; i--) {

			cadena += a.charAt(i);
			
		}
		System.out.println(cadena);
	}

}
