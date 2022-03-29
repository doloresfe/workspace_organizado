import java.util.Scanner;
public class Ejercicio5 {
	public static void main(String[] args) {
	
	Scanner sn=new Scanner(System.in);
	System.out.print("Introducir peseta"); 
	 double peseta = sn.nextDouble();
	 
	 double convertidor = peseta*166.38;
	System.out.print("En pesetas es " +convertidor);
}
}
