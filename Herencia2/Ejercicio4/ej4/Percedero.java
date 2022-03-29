package ej4;

public class Percedero extends Producto {

	private int diaCaducar;

	public Percedero(String nombre, double precio, int diaCaducar) {
		super(nombre, precio);
		this.diaCaducar = diaCaducar;
	}
	public Percedero() {
		
	}

	public int getDiaCaducar() {
		return diaCaducar;
	}

	public void setDiaCaducar(int diaCaducar) {
		this.diaCaducar = diaCaducar;
	}

	public double calcular(int cantidadProducto) {

		double totalPrecio=0;
		
		totalPrecio = precio * cantidadProducto;

		if (diaCaducar == 1) {

			totalPrecio = precio / 4;

		} else if (diaCaducar == 2) {

			totalPrecio = precio / 3;

		} else if (diaCaducar == 3) {
			totalPrecio = precio / 2;

		}
		return totalPrecio;

	}

	@Override
	public String toString() {
		return super.toString() + " \n Dia Caducar: " + diaCaducar;
	}

}
