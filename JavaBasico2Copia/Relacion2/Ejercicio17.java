import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		int cont=0;
		Scanner sn=new Scanner(System.in);
		System.out.println("Dime un numero positivo");
		int b=sn.nextInt();
		
		if (b>0) {
			
			for (int i = 1; i < 100; i++) {

				System.out.println(i+b);
			
			}
			
		}else {
			System.out.println("Introduce un numero valido");
		}
		
		
		

		
		
	sn.close();
		

	}

}
