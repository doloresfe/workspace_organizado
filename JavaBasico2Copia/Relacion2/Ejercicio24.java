import java.util.Scanner;

public class Ejercicio24 {
	public static void main(String[] args) {
		
		int cont=0;
		Scanner sn=new Scanner(System.in);
		System.out.println("Escribe numeros");
		int a=sn.nextInt();
		
		
		
		for (int i = 0; i < a; i++) {
			
			System.out.println(i+1);
			
			for (int j = 0; j < i; j++) {
				
				System.out.println(j+i);
	 	
			}
		}			
			
		
		
		sn.close();	
}

}
