import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		
		Scanner sn=new Scanner(System.in);
		System.out.println("Dime un numero");
		
		int b=sn.nextInt();
		
		boolean esPrimo = true;
	    
	    for (int i = 2; i < b; i++) {
	      if ((b % i) == 0) {
	        esPrimo = false;
	      }
	    }
	        
	    if (esPrimo) {
	      System.out.println("El número introducido es primo.");
	    } else {
	      System.out.println("El número introducido no es primo.");
	    }

	    sn.close();
	}
	
	

	}


