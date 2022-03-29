import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		int a;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Introduce un numero positivo");
		 a=s.nextInt();
		
		for(int i=0;i<5;i++)
			
		{
			
			System.out.print("Contador: "+i);
			System.out.println(" Numero  "+ (a+i) +" "+(a+i)*(a+i)+" " +(a+1)*(a+i)*(i+a));
			
		
		}

		
	}
	
}


