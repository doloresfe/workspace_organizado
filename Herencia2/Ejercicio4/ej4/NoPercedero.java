package ej4;

public class NoPercedero extends Producto {

	private String tipo;

	public NoPercedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}
	
	public NoPercedero() {
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double calcular(int cantidadProducto) {

		double totalPrecio = precio * cantidadProducto;
		return totalPrecio;
	}
	
	@Override
	public String toString() {
		return super.toString()+" \n Tipo:" + tipo;
	}
	
	
	
	
	
	
}
