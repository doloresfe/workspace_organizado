package Fecha;

import java.util.Scanner;

public class TestFecha {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int dia;
		int mes;
		int anio;
		Fecha fechaNueva=new Fecha(29,2,2024);
		Fecha fecha2=new Fecha();
		
		
//		System.out.println(fechaNueva.fechaCorrecta());
//		
//		System.out.println("Escriba el dia");
//		dia=s.nextInt();
//		fecha2.setDia(dia);
//		
//		System.out.println("Escriba el mes");
//		mes=s.nextInt();
//		fecha2.setMes(mes);
//		
//		System.out.println("Escriba el año");
//		anio=s.nextInt();
//		fecha2.setAnio(anio);
//		
//		System.out.println(fecha2.fechaCorrecta());
		
		fechaNueva.diaSiguiente();
		
		System.out.println(fechaNueva);
	}

}
