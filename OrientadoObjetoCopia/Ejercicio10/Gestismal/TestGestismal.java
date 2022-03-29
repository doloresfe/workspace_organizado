package Gestismal;

import java.util.Scanner;

public class TestGestismal {

	static Scanner s=new Scanner(System.in);
	public static void ImprimirOpciones() {
		
		System.out.println("-----------------");
		System.out.println("Menu de opciones");
		System.out.println("-----------------");
		System.out.println("1.Listado");
		System.out.println("2.Alta");
		System.out.println("3.Baja");
		System.out.println("4.Modificación");
		System.out.println("5.Entrada de mercancia");
		System.out.println("6.Salida de mercancia");
		System.out.println("7.Salir");
	}
	
	public static void primeraOpcion(Gestisimal[] array) {
		
		for (int i = 0; i < array.length; i++) {
			if (!array[i].getCodigo().equals("libre")) {
				
				System.out.println("Articulo "+i);
				System.out.println();
				System.out.println(array[i]);
			}
		}
	}
	
	public static void segundaOpcion(Gestisimal[] array) {
		int guardaPosicion = 0;
	   
		boolean salir = false;
		
		for (int i = 0; i < array.length && salir == false; i++) {
			if (array[i].getCodigo().equals("libre")) {
				guardaPosicion = i;
				salir = true;
			}
		}
		
		System.out.println("Inserta el nuevo articulo");
		
		array[guardaPosicion].setCodigo(Integer.toString(guardaPosicion));
		
		s.nextLine();
		System.out.println("Descripcion");
		String descripcionNuevo=s.nextLine();
		array[guardaPosicion].setdescripcion(descripcionNuevo);
		
		System.out.println("Precio de compra");
		Double precioCompraNuevo=s.nextDouble();
		array[guardaPosicion].setprecioCompra(precioCompraNuevo);
		
		System.out.println("Precio de venta");
		Double precioVentaNuevo=s.nextDouble();
		array[guardaPosicion].setprecioVenta(precioVentaNuevo);
		
		System.out.println("Stock");
		int stockNuevo=s.nextInt();
		array[guardaPosicion].setstock(stockNuevo);
		
		System.out.println("Articulo añadido");
	}
	
	public static boolean terceraOpcion(Gestisimal[] array) {
		
		System.out.println("Diga que posicion de articulo quiere borrar");
		int borrar=s.nextInt();
		boolean salir=false;
		for (int i = 0; i < array.length; i++) {
			if (array[borrar].getCodigo().equals("libre")) {
				System.out.println("Lo siento no se puede borrar porque no hay articulo");
				return salir=true;
			}
		}
		System.out.println();
		System.out.println("Articulo borrado");
		array[borrar].setCodigo("libre");
		return salir;
	}
	
	public static boolean cuartaOpcion(Gestisimal[] array) {
		
		System.out.println("Diga que posicion de articulo quiere modificar");
		int modificar=s.nextInt();
		boolean salir=false;
		for (int i = 0; i < array.length; i++) {
			if (array[modificar].getCodigo().equals("libre")) {
				System.out.println("Lo siento no se puede modificar porque no hay articulo");
				return salir=true;
			}
		}
		
		array[modificar].setCodigo(Integer.toString(modificar));
		
		s.nextLine();
		System.out.println("Descripcion");
		String descripcionNuevo=s.nextLine();
		array[modificar].setdescripcion(descripcionNuevo);
		
		System.out.println("Precio de compra");
		Double precioCompraNuevo=s.nextDouble();
		array[modificar].setprecioCompra(precioCompraNuevo);
		
		System.out.println("Precio de venta");
		Double precioVentaNuevo=s.nextDouble();
		array[modificar].setprecioVenta(precioVentaNuevo);
		
		System.out.println("Stock");
		int stockNuevo=s.nextInt();
		array[modificar].setstock(stockNuevo);
		
		System.out.println();
		System.out.println("Articulo modificado");
		return salir;
		
	}
	
	public static boolean quintaOpcion( Gestisimal[] array) {
		
		System.out.println("Diga que posicion de articulo quiere añadir mercancia");
		int incre=s.nextInt();
		
		boolean salir=false;
		for (int i = 0; i < array.length; i++) {
			if (array[incre].getCodigo()=="libre") {
				System.out.println("No hay articulos con este codigo");
				return salir=true;
			} else  {
				System.out.println("Dime el numero de mercancia que quieres añadir");
				int nEntradaMercancia=s.nextInt();
				array[incre].incremento(nEntradaMercancia);
				System.out.println("Mercancia añadida");
				return salir=true;	
			}
			
		}
		return salir;	
	}
	
	public static boolean sextaOpcion( Gestisimal[] array) {
		
		System.out.println("Diga que posicion de articulo quiere quitar mercancia");
		int incre=s.nextInt();
		
		boolean salir=false;
		for (int i = 0; i < array.length; i++) {
			if (array[incre].getCodigo()=="libre") {
				System.out.println("No hay articulos con este codigo");
				return salir=true;
			} else  {
				System.out.println("Dime el numero de mercancia que quieres quitar");
				int nEntradaMercancia=s.nextInt();
				array[incre].descremento(nEntradaMercancia);
				return salir=true;	
			}
			
		}
		return salir;	
	}
	
	
	
	
	public static void main(String[] args) {
	
		int usuarioOpcion;
		Gestisimal[] arrayGestion=new Gestisimal[5];
		
		for (int i = 0; i < arrayGestion.length; i++) {
			arrayGestion[i]=  new Gestisimal();
		}
		
		
	do {
		ImprimirOpciones();
		
		System.out.println("Introduce una opcion");
		usuarioOpcion=s.nextInt();
		
		switch (usuarioOpcion) {
		case 1:
			primeraOpcion(arrayGestion);
			break;
		case 2:
			segundaOpcion(arrayGestion);
			break;
		case 3:
			terceraOpcion(arrayGestion);
			break;
		case 4:
			cuartaOpcion(arrayGestion);
			break;
		case 5:
			quintaOpcion(arrayGestion);
			break;
		case 6:
			sextaOpcion(arrayGestion);
			break;
		case 7:
			System.out.println("¡Hasta luego!");
			break;
		}
		
		
	} while (usuarioOpcion!=7);	
		

	}

}
