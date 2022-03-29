package Funciones;


public class funcionesMatematicas {
	
	//Funcion es capicua
	
public static int escapicua(int numero) {
		
	    
	    while (numero != 0) {
	    	
	    	
	    	
	    	numero%=10;
	    	numero /= 10;
	         
	    }
		return numero;}




// . potencia: Dada una base y un exponente devuelve la potencia.

public static int potencia(int base,int exponente) {
	
	int res=1;
	
		for (int i = 1; i <=exponente; i++) {
			
			res=res*base;
	
		}
	return res;
	
	
}

// es primo

public static boolean esprimo( int numero) {
	
	boolean esPrimo = true;
	
	for (int i = 2; i < numero; i++) {
		
		if ((numero % i)==0) {
			
				esPrimo=false;
		}
		
	}
	
	return esPrimo;
	


}


//contar numero de los digitos

public static int digito ( int n) {
	
	int i=0;
		
	 while (n != 0) {
		 
	    	n /= 10;
	    	  i++;
	         
	    }
	
	return i;
	}

//voltear numero

public static int voltea(int e) {
	int acum=0;
	
	 while (e > 0) {
   	  int r=e%10;
   	  e /= 10;
   	  acum=acum*10+r;
   	  
   }

	return acum;
}

//Muestra los números primos que hay entre 1 y 1000
public static void primos1000( ) {
	
	for (int i = 1; i < 1000; i++) {
		
		
		
		if (esprimo(i)==true) {
			System.out.print( " "+i);
			
			
		}
	}
	
	
}

public static int escapicua1( int q) {
	
	
	if (voltea(q)==q) {
		
		System.out.print( "El numero es capicua");
		
		
	}else {
		System.out.println("El numero no es capicua");
	}
	
	return q;

}

}


