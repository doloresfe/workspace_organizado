package ej3;

public class Repartidor extends Empleado {

	private String zona;

	public Repartidor(String nombre, int edad, double salario, String zona) {
		super(nombre, edad, salario);
		this.zona = zona;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}
	
	public  void  plus() {
		
		if (edad>25 && zona.equals("zona3")) {
			
			salario=salario+plus;
		}
	}

	@Override
	public String toString() {
		return  super.toString()+" "+ "Zona="+zona+"]";
	}
	
	
}
