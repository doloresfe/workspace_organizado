import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner sn=new Scanner(System.in);
		System.out.println("Introduce el numero que quieres que se muestra la tabla");
		int a=sn.nextInt();
		
		System.out.println("Tabla del"+a);
		System.out.println("------------");
		
		
		for(int i = 1; i<=10; i++){
            System.out.println(a + " * " + i + " = " + a*i);                                                     
       }
		
		sn.close();
	}

}
