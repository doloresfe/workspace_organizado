import java.util.Scanner;

public class ejercicio5 {
	
	public static String vocales(String nombre,String apellido) {
		
		char a;
		
		
	String palabra1 = nombre.toLowerCase()+apellido.toLowerCase();
	 String palabra2 = "";
		 
		 for (int i = 0; i < palabra1.length(); i++) {
			
			 a=palabra1.charAt(i);
			 
			if( !(a=='a' || a=='e' ||a=='i' || a=='o' || a=='u') ){
				
				palabra2=palabra2+a;
			}
		}
		
		return palabra2;
		
		
	}
	
	

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String nombre;
		String apellido;
		char a;
		System.out.println("Introduce tu nombre");
		 nombre=s.nextLine();
		 System.out.println("Indroduce tu  primer apellido");
		 apellido=s.nextLine();
		 
//		 String palabra1 = nombre.toLowerCase()+apellido.toLowerCase();
//		 String palabra2 = "";
//		 
//		 for (int i = 0; i < palabra1.length(); i++) {
//			
//			 a=palabra1.charAt(i);
//			 
//			if( !(a=='a' || a=='e' ||a=='i' || a=='o' || a=='u') ){
//				
//				palabra2=palabra2+a;
//			}
//		}
		 
		 //System.out.println(palabra2);
		 String palabra;
		
		 palabra= vocales(nombre, apellido);
		 System.out.println(palabra);

	}

}
