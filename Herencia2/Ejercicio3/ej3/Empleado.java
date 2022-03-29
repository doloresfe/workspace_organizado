package ej3;

public  abstract class  Empleado {

	 protected  String nombre;
	 protected  int edad;
	 protected  double salario;
	 protected int  plus=300;
	
	public Empleado(String nombre, int edad, double salario) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public  int getPlus() {
		return plus;
	}

	public void setPlus(int plus) {
		this.plus = plus;
	}
	
	
	public void  plus() {
		
		salario=salario+plus;
		
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", salario=" + salario  ;
	}

	
	
	
	
	
	
}
