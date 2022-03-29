import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int cont=0;
		int suma=0;
		Scanner sn=new Scanner(System.in);
		System.out.println("Introduce un numero positivo");
		int a=sn.nextInt();
	
		   while (a>=0) {
			   
			   suma=suma+a;
			   cont=cont+1;
			   a=sn.nextInt();
			   
			  
		   }
		   
		  
		 System.out.println("La media es "+suma/cont); 
		
			sn.close();
	}}


	
	
	


