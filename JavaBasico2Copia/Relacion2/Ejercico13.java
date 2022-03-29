import java.util.Scanner;

public class Ejercico13 {

	public static void main(String[] args) {
		int a;
		int contaneg=0;
		int contapos=0;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println(" introduce numeros");
		
		
		do {
			a=s.nextInt();
			
			if(a<0) {
				contaneg++;
					
					}	
			else {
				contapos++;
				}
		}while(a<=10);
		

			
		
		System.out.println("Hay "+(contapos-1)+" positivos");
		System.out.println("Hay "+contaneg+" negativos");
			
		
		s.close();

		}

	}
