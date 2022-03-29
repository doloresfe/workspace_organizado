package Libro;

import java.util.Scanner;

public class TestLibro {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		Libro libro1= new Libro("El quijote","Cervante",1,0);
		
		Libro libro2=new Libro();
		
		System.out.println("Datos del libro 2");
		
		System.out.println("Introduce el titulo");
		String titulo=s.nextLine();
		libro2.setTitulo(titulo);
		
		System.out.println("Introduce el autor");
		String autor=s.nextLine();
		libro2.setAutor(autor);
		
		System.out.println("Introduce el numero de ejemplares");
		int ejemplare=s.nextInt();
		libro2.setNumEjemplar(ejemplare);
		
		System.out.println("Introduce el numero de ejemplares prestados");
		int prestado=s.nextInt();
		libro2.setNumEjemplarPrestado(prestado);
		
		System.out.println("Datos del libro 1");
		System.out.println(libro1.toString());
		
		if (libro1.prestamo()) {
			System.out.println("Prestamo realizado con éxito");
		} else {
			System.out.println("El prestamo no se ha podido realizar");
		}
		
		if (libro1.devolucion()) {
			System.out.println("Devolución realizada con éxito");
		} else {
			System.out.println("La devolución no se ha podido realizar");
		}
		
		libro1.prestamo();
		if (libro1.prestamo()==false) {
			System.out.println("No quedan ejemplares del libro");
		} 
		
		System.out.println();
		System.out.println("Datos del libro 1");
		System.out.println(libro1.toString());
		System.out.println();
		System.out.println("Datos del libro 2");
		System.out.println(libro2.toString());
	}

}
