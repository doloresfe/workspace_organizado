package Contador;

public class TestContador {

	public static void main(String[] args) {
		
		Contador cont1= new Contador();
		
		cont1.setCont(5);
		
		cont1.ingrementa();
		
		System.out.println("Total contador 1 vez ingrementado  "+cont1.getCont());

		cont1.ingrementa();
		cont1.ingrementa();
		
		System.out.println("Total contador 2 veces ingrementado "+cont1.getCont());
		
		cont1.descremento();
		
		System.out.println("Total contador 1 vez descrementado "+cont1.getCont());
		
		
		Contador cont2= new Contador();
		
		cont2.setCont(10);
	
		cont2.ingrementa();
		cont2.descremento();
		
		System.out.println("Total contador 2:  "+cont2.getCont());
		
		
		Contador cont3=new Contador(cont2);
		
		System.out.println("Total contador 3  "+cont3.getCont());
	}

}
