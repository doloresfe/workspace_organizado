package ej3;

public class Comercial extends Empleado{

	private int comision;

	public Comercial(String nombre, int edad, double salario, int comision) {
		super(nombre, edad, salario);
		this.comision = comision;
	}

	public int getComision() {
		return comision;
	}

	public void setComision(int comision) {
		this.comision = comision;
	}
	
	public  void  plus() {
		
		if (edad>30 && comision>200) {
			
			salario=salario+plus;
		}
	}

	@Override
	public String toString() {
		return super.toString()+" "+ "Comison="+comision+"]";
	}
	
	
	
	
}
