package ej3;

public class Probar {

	public static void main(String[] args) {
		

Repartidor r1= new Repartidor("pepe",26,2000,"zona3");
Comercial c1=new Comercial("manolo",31,2000,350);


	r1.plus();
	
	c1.plus();
	
		System.out.println("Repartidor "+r1);
		System.out.println("Comercial " +c1);
		

	}

}
