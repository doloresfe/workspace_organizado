import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		
		 Scanner s= new Scanner(System.in);
		 
	
		
		 String contra= new String ("hola");
		String s4;
		boolean salida=true;
		
		 
System.out.println("Te doy una pista la contraseña tiene "  +contra.length()+" caracteres");

System.out.println("El primer caracter es "+contra.charAt(0));
int ultimo=(contra.length()-1);
System.out.println("El ultimo caracter es " +contra.charAt(ultimo));
System.out.println();
	

	do {
		
		System.out.println("Introduce la contraseña");
		 s4=s.nextLine();

		
	
	salida = s4.equalsIgnoreCase(contra);

	
		
	} while (!s4.equals(contra));
		
	if (salida) {
		System.out.println("Has acertado");
	}
		

	}

}
