package ej4;

import java.util.Scanner;

public class TestProducto {

	static Scanner s = new Scanner(System.in);
	static int maxiArray = 5;
	static Producto[] productos = new Producto[maxiArray];
	static int cont = 0;

	public static void productoPer() {
		int nPerecedero;
		String nombre;
		double precio;
		int diaC;

		do {

			System.out.println("Cuantos productos perecedero");
			nPerecedero = s.nextInt();

		} while (nPerecedero > 5 || nPerecedero <= 0);

		for (int i = 0; i < nPerecedero; i++) {

			s.nextLine();
			System.out.println("Introduce el nombre del producto");
			nombre = s.nextLine();

			System.out.println("Introduce el precio");
			precio = s.nextDouble();

			System.out.println("Introduce el dia de caducidad");
			diaC = s.nextInt();

			Percedero perecederoAnadir = new Percedero(nombre, precio, diaC);
			productos[i] = perecederoAnadir;
			cont++;

		}

	}

	public static void noPerecedero() {

		int cuantoP;
		String nombre;
		double precio;
		String tipo;

		do {
			System.out.println("Cuantos productos no perecedero quieres");
			cuantoP = s.nextInt();
		} while (cuantoP > 5 || cuantoP <= 0);

		for (int i = 0; i < cuantoP; i++) {

			s.nextLine();
			System.out.println("Introduce el nombre");
			nombre = s.nextLine();

			System.out.println("Introduce el precio");
			precio = s.nextDouble();
			s.nextLine();
			System.out.println("Introduce el tipo");
			tipo = s.nextLine();

			

			NoPercedero anadirNP = new NoPercedero(nombre, precio, tipo);
			productos[i] = anadirNP;
			cont++;
		}
	}

	public static void pintarMenu() {

		System.out.println("----------------------------");
		System.out.println("1.Crear producto perecedero");
		System.out.println("2.Crear prducto no perecedero");
		System.out.println("3.Salir");
		System.out.println("-----------------------------");

	}

	public static void menuProducto() {

		int opcion = 0;
		do {
			System.out.println("Elige uno de este menu");
			pintarMenu();
			do {
				System.out.println("Que opcion quieres");
				opcion = s.nextInt();
			} while (opcion != 1 && opcion != 2 && opcion != 3);

			System.out.println("Opcion elegida " + opcion);

			switch (opcion) {
			case 1:
				productoPer();
				break;

			case 2:
				noPerecedero();
				break;
			case 3:
				System.out.println("Adios");
				break;
			}

		} while (opcion != 3 || cont > 5);

	}
	
	public static void listar() {
		
		for (int i = 0; i <cont-1; i++) {
			
			System.out.println(productos[i]);
		}
	}
	
	public static void totalP() {
		
		double totalPrecio=0;
		
		for (int i = 0; i <cont-1; i++) {
			
			totalPrecio=totalPrecio+ productos[i].calcular(5);
			
		}
		System.out.println("Total pedido: "+totalPrecio);
	}

	public static void main(String[] args) {
		
		
		menuProducto();
		listar();
		
		totalP();
		
		

	}

}
