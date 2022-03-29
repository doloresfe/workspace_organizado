import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		Scanner sn=new Scanner(System.in);
		int a=0;
		int b=0;
		do {
			System.out.println("Dime un numero entero");
			a=sn.nextInt();
			
			System.out.println("Dime un numero entero");
			 b=sn.nextInt();
			if (a==b) {
				System.out.println("Los 2 numeros introducidos son iguales");
			}
		}while (a==b);
		
		
		if (a<b) {
			System.out.println("Los numeros desde "+a+" hasta "+b+" son ");
			for (int i = a; i < b; i=i+7) {
				System.out.println(i);
			}
			
		}else {
			System.out.println("Los numero desde "+b+" hasta "+a+" son");
			for (int i = b; i < a; i=i+7) {
				System.out.println(i);
			}
			
		}
		
		sn.close();
		
	}

}
