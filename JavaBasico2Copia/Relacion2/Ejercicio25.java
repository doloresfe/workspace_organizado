import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		
		Scanner sn=new Scanner(System.in);
		System.out.println("Escribe numeros");
		int a=sn.nextInt();
		
		do {
//Aqui se calcula el resto//		
		int	resto= a%10;
		System.out.print(resto);	
//Aqui se calcula el cociente//
		a=a/10;
		} while (a>0);

		}
	
	}

