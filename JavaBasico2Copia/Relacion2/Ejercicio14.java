import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		Scanner sn=new Scanner(System.in);
		
		System.out.println("Dime la base positiva");
		int a=sn.nextInt();
		System.out.println("Dime la exponente positivo ");
		int b=sn.nextInt();
		
		double resultado=Math.pow(a, b);
		System.out.println("El resultado es"+resultado );
		

		sn.close();
	}

}
