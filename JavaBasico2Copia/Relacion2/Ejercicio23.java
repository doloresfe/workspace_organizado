import java.util.Scanner;



public class Ejercicio23 {

	public static void main(String[] args) {
		int cont=0;
		Scanner sn=new Scanner(System.in);
		System.out.println("Escribe numeros,cuando la suma sea 10.000 se para el programa");
		
		do {
			int a=sn.nextInt();
			cont=cont+a;
			
		} while (cont<10000);
		
			
			System.out.println("El contador ya no sumara porque has pasado de 10.000");
	}

	
}
