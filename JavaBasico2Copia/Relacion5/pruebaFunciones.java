import java.util.Scanner;

import Funciones.funcionesMatematicas;

public class pruebaFunciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		// . potencia: Dada una base y un exponente devuelve la potencia.
		
		int base=5;
		int exp=3;
		int res=1;
		
		for (int i = 1; i<=3; i++) {
			res=res*base;
			
			
		}
		//System.out.println(res);
		/*
		//----------------------------------------------
		System.out.println("---------------------------------------------");
		System.out.println("Calcular potencia de una base y un exponente");
		
		System.out.println("Introduce la base");
		int a=s.nextInt();
		System.out.println("Introduce el exponente");
		int b=s.nextInt();
		
		
		
		int resultado=Funciones.funcionesMatematicas.potencia(a, b);
		System.out.println(resultado);
		*/
		
		//-----------
		// prueba primo
		/*
		 * System.out.println("------------------------------");
		System.out.println("Comprobacion de numeros primos");
		
		System.out.println("Introduce un numero");
		 a=s.nextInt();
		
		
		boolean resultado2=Funciones.funcionesMatematicas.esprimo(a);
		
		if (resultado2==true) {
			System.out.println("Es primo");
		}else {
			System.out.println("No es primo");
		}
		
		System.out.println(resultado2);
		
		*/
		/*
		// contar digitos 
		System.out.println("-------------------------------------");
		
		System.out.println("Introduce un numero");
		int p=s.nextInt();
		 
		 int resultado3=Funciones.funcionesMatematicas.digito(p); 
		 System.out.println("El numero de digitos es "+resultado3);
		 */
		
		 /*
		 // Voltea un numero
		 
		System.out.println("-----------------------------");
		System.out.println("Introduce un numero");
		int o=s.nextInt();
		
		 int resultado4=Funciones.funcionesMatematicas.voltea(o); 
		 System.out.println(resultado4);
		
*/
		System.out.println("-----------------------------");
		
		
		
//Muestra los números primos que hay entre 1 y 1000.
		
		//Funciones.funcionesMatematicas.primos1000();
		

		
	//Muestra los números capicúa que hay entre 1 y 99999.	
		System.out.println("Introduce un numero");
		int t=s.nextInt();
		
		int resultado9=Funciones.funcionesMatematicas.escapicua1(t);
		
		

	}

	}

