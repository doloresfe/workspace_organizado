import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		String cadena="";
		String frase2="";
		char c;
		
		System.out.println("Introduce una frase");
		 String frase=s.nextLine();
		 
		 
			for (int i = 0; i < frase.length(); i++) {
				
	            
// quitar espacios	
				c=frase.charAt(i);
				if (c != ' ') { 
					
					frase2=frase2+c;
				}
		
		}
			
						
		 
// dar la vuelta a la cadena
			for (int i = frase2.length()-1; i >=0; i--) {

				cadena += frase2.charAt(i);
				
			}
			
	
//comprobar que sean iguales			
		 if (frase2.equals(cadena)) {
			 
			 System.out.println("Esta frase es palindroma");
			
		}else {
			System.out.println("No es palindroma");
		}

	}

}
