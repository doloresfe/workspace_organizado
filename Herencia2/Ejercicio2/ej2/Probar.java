package ej2;

import java.util.Scanner;

public class Probar {

	static Scanner s = new Scanner(System.in);

	static Poligono[] nuevoP = new Poligono[5];
	static int cont=0;

	public static void llenarPoligono() {

	}

	public static void menu() {

		System.out.println("1.Introduce triangulo");
		System.out.println("2.Introduce rectangulo");
		System.out.println("3.Salir");

	}

	public static void menuOpciones() {

		int opcion = 0;

		do {
					menu();
			do {
				System.out.println("Introduce una opcion");
				opcion = s.nextInt();
			} while (opcion != 1 && opcion != 2 && opcion != 3);

			switch (opcion) {
			case 1:

				llenarTriangulo();

				break;
			case 2:

				llenarREctangulo();

				break;
			case 3:
				imprimir();
				break;
			}

		} while (opcion != 3);

	}

	public static void llenarTriangulo() {

		int nTriangulo;
		int lado1;
		int lado2;
		int lado3;
		do {
			System.out.println("Dime el numero de triangulos a llenar");
			nTriangulo = s.nextInt();

		} while (nTriangulo > 5);

		for (int i = 0; i < nTriangulo; i++) {

			System.out.println("Dime el lado 1");
			lado1 = s.nextInt();

			System.out.println("Dime el lado 2");
			lado2 = s.nextInt();

			System.out.println("Dime el lado 3");
			lado3 = s.nextInt();

			Triangulo anadirTriangulo = new Triangulo(lado1, lado2, lado3);
			nuevoP[i] = anadirTriangulo;
			
			cont++;
		}
		
		
		
	}

	public static void llenarREctangulo() {

		int nRectagulo;
		int lado1;
		int lado2;
		do {
			System.out.println("Dime el numero de rectangulos a llenar");
			nRectagulo = s.nextInt();

		} while (nRectagulo > 5);

		for (int i = 0; i < nRectagulo; i++) {

			System.out.println("Dime el lado 1");
			lado1 = s.nextInt();

			System.out.println("Dime el lado 2");
			lado2 = s.nextInt();

			Rectangulo anadirRect = new Rectangulo(lado1, lado2);
			nuevoP[i] = anadirRect;
			cont++;
		}
	}
	
	public static void imprimir() {
		
		for (int i = 0; i < cont-1; i++) {
			
			System.out.println(nuevoP[i]);
		}
	}

	public static void main(String[] args) {

		menuOpciones();
		
		
	}

}
