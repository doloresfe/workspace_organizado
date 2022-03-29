import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		
		String espacio=" ";
		int letras;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce un palabra, y te dire los espacios quie tiene");
		String a=s.nextLine();
		
		 int cont=0;
		for (int i = 0; i < a.length(); i++) {
            
           
			if (a.charAt(i) == ' ') { 
				cont++;}
	
	}
		System.out.println(cont);

}
}
