package ej5;

import java.util.Scanner;

public class Probar {
	
	static int[] cartas=new int[41];

	public static void mostrarMenu() {

		System.out.println("1.Crear baraja");
		System.out.println("2.Mostrar las cartas(40)");
		System.out.println("3.Sacar una carta");
		System.out.println("4.Sacar 5 cartas");
		System.out.println("5.Mostrar las cartas(34)");
		System.out.println("6.Barajar de nuevo");
		System.out.println("7.Sacar 5 cartas despues de barajar");
		System.out.println("8.Salir");
	}
	
	
	
	
	public static void mostrarCarta(int[] cartas) {
		
		
		for (int i = 1; i <cartas.length; i++) {
			
			System.out.println(cartas[i]);
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int opcion;
		
		mostrarMenu();
	
		do {
			
			do {
				System.out.println("Introduce una opcion");
				 opcion = s.nextInt();
			} while (opcion!=1 && opcion!=2 && opcion!=3 && opcion!=4 && opcion!=5 && opcion!=6 && opcion!=7 && opcion!=8);
			

			switch (opcion) {
			case 1:
				
				break;
			case 2:
					mostrarCarta(cartas);
				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			case 7:

				break;
			case 8:

				break;
			}
		} while ( opcion!=8);
		

	}

}
