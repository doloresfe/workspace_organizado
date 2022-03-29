import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		int cont=0;
		Scanner sn=new Scanner(System.in);
		
		System.out.println("Introduce un  numero maximo de 6 cifras");
		int a=sn.nextInt();
		
		 if(a<10) {
			 System.out.println("El numero tiene 1 cifra");
		 }
		 if (a>=10 && a<100) {
			 System.out.println("El numero tiene 2 cifra");
		 }
		  if(a>=100 && a<1000) {
			  System.out.println("El numero tiene 3 cifras");
		  }
		  
		  if(a>=1000 && a<10000) {
			  System.out.println("El numero tiene 4 cifras");
		  }
		  
		  if(a>=10000 && a<100000) {
			  System.out.println("El numero tiene 5 cifras");
		  }
		  
		  if(a>=100000 && a<1000000) {
			  System.out.println("El numero tiene 6 cifras");
		  }
		  
		  else { 
			  System.out.println("Introduce un numero que este dentro del rango");
				  }
		   
			sn.close();
	}

}
