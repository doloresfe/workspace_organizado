package Empleado;

import java.util.Scanner;

public class TestEmpleado {

	public static void main(String[] args) {
		
		int nEmpleado;
		
		
		Scanner s=new Scanner(System.in);
		Empleado empleado1=new Empleado();
		
		do {
			System.out.println("Dime el nuemero de empleado");
			nEmpleado=s.nextInt();
			
		} while (nEmpleado>20 || nEmpleado<=0);

		Empleado[] array=new Empleado[nEmpleado];
		
		
		for (int i = 0; i < nEmpleado; i++) {
			
			array[i] = new Empleado();
			
			s.nextLine();
			System.out.println("Introduce el nif");
			String n=s.nextLine();
			array[i].setNif(n);
			
			System.out.println("Introduce el nombre");
			String nombre=s.nextLine();
			array[i].setNombre(nombre);
			
			System.out.println("Introcuze el sueldo base");
			double sueldo=s.nextDouble();
			array[i].setSueldoBase(sueldo);
			
			System.out.println("Introduce las horas extras");
			int hextra=s.nextInt();
			array[i].setHorasExtra(hextra);
			
			System.out.println("Introduce el IRPF");
			double irpf=s.nextDouble();
			array[i].setTipoIRPF(irpf);
			
			s.nextLine();
			System.out.println("Pon S si estas casado o N si no ");
			String casado=s.nextLine();
			array[i].setCasado(casado);
			
			System.out.println("Numero de hijos");
			int hijo=s.nextInt();
			array[i].setHijo(hijo);
			
		}
		
		System.out.println("Introduce el importe de pago de las horas extras");
		double importe=s.nextDouble();
		
		
		
		System.out.println("El empleado que mas cobra: ");
		System.out.println(array[masCobra(array)]);
		System.out.println();
		System.out.println("El empleado que menos cobra: ");
		System.out.println(array[menoCobra(array)]);
		System.out.println();
		System.out.println("El empleado que mas cobra hora extras");
		System.out.println(array[masHoraExtra(array)]);
		System.out.println();
		System.out.println("El empleado que menos cobra hora extras");
		System.out.println(array[menoHoraExtra(array)]);
		System.out.println();
		System.out.println("Ordenacion por salario");	
		ordenarSalario(array);
		
		for (int j = 0; j < array.length; j++) {
			
			System.out.println(array[j]);
		}
		
	}
	
	public static int masCobra(Empleado[] array) {
		
		int pos1=0;
		
		double mayor=array[0].getSueldoBase();
		for (int i = 0; i < array.length; i++) {
			if (array[i].getSueldoBase()>mayor) {
				mayor=array[i].getSueldoBase();
				pos1=i;
			}
		
		}
		return pos1;
	}
	
public static int menoCobra(Empleado[] array) {
		
		int pos1=0;
		
		double menor=array[0].getSueldoBase();
		for (int i = 0; i < array.length; i++) {
			if (menor > array[i].getSueldoBase()) {
				menor=array[i].getSueldoBase();
				pos1=i;
			}
		
		}
		return pos1;
	}

public static int masHoraExtra(Empleado[] array) {
	
	int pos1=0;
	
	double masHoraExtra=array[0].getSueldoBase();
	for (int i = 0; i < array.length; i++) {
		if (masHoraExtra < array[i].complementoHoraExtra()) {
			masHoraExtra=array[i].complementoHoraExtra();
			pos1=i;
		}
	
	}
	return pos1;	
}

public static int menoHoraExtra(Empleado[] array) {
	
	int pos1=0;
	
	double menosHoraExtra=array[0].getSueldoBase();
	for (int i = 0; i > array.length; i++) {
		if (menosHoraExtra > array[i].complementoHoraExtra()) {
			menosHoraExtra=array[i].complementoHoraExtra();
			pos1=i;
		}
	
	}
	return pos1;	
}

public static void ordenarSalario(Empleado[] array) {
	
	 int i, j;
	 Empleado aux;
     for (i = 0; i < array.length - 1; i++) {
         for (j = 0; j < array.length - i - 1; j++) {                                                              
             if (array[j + 1].sueldoBruto() < array[j].sueldoBruto()) {
                 aux = array[j + 1];
                 array[j + 1] = array[j];
                 array[j] = aux;
             }
         }
     }
}


}
