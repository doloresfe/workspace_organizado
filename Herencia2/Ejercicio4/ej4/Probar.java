package ej4;

import java.util.Scanner;

public class Probar {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		Percedero p1 = new Percedero();
		NoPercedero np1 = new NoPercedero();
		double totalPedido=0;

		Producto[] listaProductos = new Producto[3];
		
		listaProductos[0]=new Producto("dfsdfsdf",12);
		listaProductos[1]=new Percedero("asdasdasdasdsdasd",14,1);
		listaProductos[2]=new NoPercedero("hh",14,"carne");
		
		for (Producto p:listaProductos) {
			
			System.out.println(p.toString()+"\nPrecio Total:"+p.calcular(5));
			System.out.println();
			totalPedido=totalPedido+p.calcular(5);
		}
		
		System.out.println(totalPedido);
		
			
		
		
//		p1.calcular(5);
//		np1.calcular(5);
//		System.out.println(p1);
//		System.out.println(np1);
                                                  
	}

}
