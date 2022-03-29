import java.util.Scanner;

public class ejercicio10 {

	public static char caracteres() {
		char caracter=0;
		String palabra1 = "";
		String conjunto1 = "eikmpqrstuv";
		String conjunto2 = "pviumterkqs";
		char cadena=0;
		
		for (int j = 0; j < palabra1.length(); j++) {
			
			caracter=palabra1.charAt(j);
			
			for (int i = 0; i < conjunto1.length(); i++) {

				if (conjunto1.charAt(i) == caracter) {

						
					cadena=conjunto2.charAt(i);	
			}
				
			}
			
		}
	
		
		return cadena ;	
	  }
	
	

	public static void main(String[] args) {

		char caracter=' ';
		String palabra1 = "";
		String cadena="";

		String conjunto1 = "eikmpqrstuv";
		String conjunto2 = "pviumterkqs";

		Scanner s = new Scanner(System.in);

		
		System.out.println("Introduce una frase");
		palabra1 = s.nextLine();

//		char a=caracteres();
//		System.out.println(a);

		
		
		for (int j = 0; j < palabra1.length(); j++) {
			caracter=' ';
			caracter=palabra1.charAt(j);
			System.out.print(caracter);
			for (int i = 0; i < conjunto1.length(); i++) {

				if (conjunto1.charAt(i) == caracter) {

					 System.out.println(conjunto2.charAt(i));
				}	
			}
		}	
	}
	
}
			
	


