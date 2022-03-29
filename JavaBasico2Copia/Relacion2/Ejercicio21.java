import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		
		int cont_impar=0;
		int may_pares=0;
		int suma=0;
		
		Scanner sn=new Scanner(System.in);
		
		System.out.println("Introduce numero y cuando quiera que pare pon un numero negativo");
         int a=sn.nextInt();
         
         
    			
    		
         
         while (a>0) {
        	a=sn.nextInt();	
        	
        	if (a%2==1 && a>0) {
        		suma=suma+a;
    			cont_impar++;	
        	}
        	
        	if (a%2==0 && a>may_pares) {
        		
    			may_pares=a;	
        	}
		}
        
		
		
         System.out.println("La media de los impares es "+suma/cont_impar);
         System.out.println("El mayor de los pares es "+may_pares);
		
		
		
		
		
	sn.close();
		
	}

}
