
public class Ejercicio22 {

	public static void main(String[] args) {
		
		int a=101;
		
	//boolean esPrimo=true;
		int cont=0;
		
		for (int i = 2; i < a; i++) {
			
			//i=5;
			//esPrimo=true;
			cont=0;
			for (int j = 2; j < i; j++) {
				
				if(( i % j)==0){
					//esPrimo=false;
					cont++;
					
				}
				
			}//busca los divisores
			 if (cont==0) {
					System.out.println(i);
				
			}
				
			}
		
	
		    }


}
	
