package ej1;

public class Direcctivo extends Empleado {

		public Direcctivo(String nombre) {
		
			super(nombre);
		}

	public String toString() {
		return super.toString()+"-> Directivo";
	}
}
