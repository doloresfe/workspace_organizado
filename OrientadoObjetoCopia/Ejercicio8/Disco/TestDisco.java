package Disco;

import java.util.Scanner;

public class TestDisco {

	static Scanner s = new Scanner(System.in);
	

	public static void imprimirOpciones() {

		System.out.println("COLECCION DE DISCO");
		System.out.println("--------------------");
		System.out.println("--------------------");
		System.out.println("     1.Listado");
		System.out.println("     2.Nuevo disco");
		System.out.println("     3.Modificar");
		System.out.println("     4.Borrar");
		System.out.println("     5.salir");
	}

	public static void primeraOpcion(Disco[] array) {

		System.out.println("Listado de disco");
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			if (!array[i].getCodigo().equals("libre")) {
				System.out.println("Disco: "+i);
				System.out.println();
				System.out.println(array[i]);
			}
		}
	}
	

	public static void segundaOpcion(Disco[] array) {
		int guardaPosicion = 0;
	    int contDisco=0;
		boolean salir = false;
		for (int i = 0; i < array.length && salir == false; i++) {
			if (array[i].getCodigo().equals("libre")) {
				guardaPosicion = i;
				salir = true;
			}
		}

		System.out.println("Inserta nuevo disco");
		System.out.println();

		array[guardaPosicion].setCodigo(Integer.toString(guardaPosicion));

		s.nextLine();
		System.out.println("Autor");
		String autorNuevo = s.nextLine();
		array[guardaPosicion].setAutor(autorNuevo);

		System.out.println("Titulo");
		String tituloNuevo = s.nextLine();
		array[guardaPosicion].setTitulo(tituloNuevo);

		System.out.println("Genero");
		String generoNuevo = s.nextLine();
		array[guardaPosicion].setGenero(generoNuevo);

		System.out.println("Duracion");
		int duracionNuevo = s.nextInt();
		array[guardaPosicion].setDuracion(duracionNuevo);
		
		 contDisco++;
		 
	}
	
	
	public static boolean modificarDisco(Disco [] array) {
		
		System.out.println("Diga que posicion de disco quiere modificar");
		int modificar=s.nextInt();
		boolean salir=false;
		for (int i = 0; i < array.length; i++) {
			if (array[modificar].getCodigo().equals("libre")) {
				System.out.println("Lo siento no se puede modificar porque no hay libro");
				return salir=true;
			}
		}
		
		array[modificar].setCodigo(Integer.toString(modificar));
		
		s.nextLine();
		System.out.println("Autor");
		String autorNuevo = s.nextLine();
		array[modificar].setAutor(autorNuevo);

		System.out.println("Titulo");
		String tituloNuevo = s.nextLine();
		array[modificar].setTitulo(tituloNuevo);

		System.out.println("Genero");
		String generoNuevo = s.nextLine();
		array[modificar].setGenero(generoNuevo);

		System.out.println("Duracion");
		int duracionNuevo = s.nextInt();
		array[modificar].setDuracion(duracionNuevo);
		
		System.out.println();
		System.out.println("Disco modificado");
		return salir;
	}
	
	
	public static boolean borrarDisco(Disco [] array) {
		
		System.out.println("Diga que posicion de disco quiere borrar");
		int borrar=s.nextInt();
		boolean salir=false;
		for (int i = 0; i < array.length; i++) {
			if (array[borrar].getCodigo().equals("libre")) {
				System.out.println("Lo siento no se puede borrar porque no hay libro");
				return salir=true;
			}
		}
		
		System.out.println();
		System.out.println("Disco borrado");
		array[borrar].setCodigo("libre");
		return salir;
	}

	
	
	
	public static void main(String[] args) {

		int usuarioOpcion;

		Disco[] arrayDisco = new Disco[100];
		
		//recorrer array para rellenarla vacia si no hago esto me da error
		for (int i = 0; i < arrayDisco.length; i++) {
			arrayDisco[i] = new Disco();
		}
		
		do {
			System.out.println();
			imprimirOpciones();
			System.out.println();
			System.out.println("Introduzca una opcion");
			usuarioOpcion = s.nextInt();

			switch (usuarioOpcion) {
			case 1:
				primeraOpcion(arrayDisco);
				break;
			case 2:
				segundaOpcion(arrayDisco);
				break;
			case 3:
				modificarDisco(arrayDisco);
				break;
			case 4:
				borrarDisco(arrayDisco);
				break;
			case 5:
				System.out.println("¡Hasta luego!");
				break;
			}

		} while (usuarioOpcion != 5);

	}

}
