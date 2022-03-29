import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		
		Scanner sn=new Scanner(System.in);
		
		System.out.println("Dime la base positiva");
		int a=sn.nextInt();
		System.out.println("Dime la exponente positivo ");
		int b=sn.nextInt();
		
		
		for (int i = a; i < b+1; i++) {
			 double resultado=Math.pow(a, i);
			System.out.println("La base "+a+" por el exponente "+i+ "="+resultado);
			
		}
		sn.close();
	}	
}

	
	
		
	


