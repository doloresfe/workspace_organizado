/*2 == es comparar*/


/*1 = es asignar*/

import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		 
		int cont=1;
		
		Scanner sn=new Scanner(System.in);
		
		System.out.print("Introduce la contraseña");
		int a=sn.nextInt();
		
		do{
			if (a==1234) {
				
				
				System.out.println( "La caja fuerte se ha abierto satisfactoriamente " );	
			}
			else {
				System.out.println("Lo siento, esa no es la combinación");
				
				System.out.println("Introduce la contraseña");
				a=sn.nextInt();
			
			
			}
			
			cont++;
			 
			
		}while(cont<4 && a!=1234);
		
		if(cont==4) {
			System.out.println("Has supedao los 4 intentos");
		}	
		
		
				
		sn.close();
	}

}
