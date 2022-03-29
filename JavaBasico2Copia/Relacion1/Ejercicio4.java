import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.print("Introducir euro"); 
		 double euro = sn.nextDouble();
		 
		 double convertidor = euro*166.38;
		System.out.print("En pesetas es " +convertidor);

	}

}
