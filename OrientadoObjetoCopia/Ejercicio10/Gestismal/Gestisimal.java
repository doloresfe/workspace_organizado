package Gestismal;

public class Gestisimal {

	private String codigo="libre";
	private String descripcion;
	private double precioCompra;
	private double precioVenta;
	private int stock;

	public Gestisimal() {
	}

	public Gestisimal(String  codigo, String descripcion, double precioCompra, double precioVenta, int stock) {

		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.stock = stock;
	}

	// getter

	public String getCodigo() {

		return codigo;
	}
	// setter

	public void setCodigo(String codigo) {

		this.codigo = codigo;
	}

	// getter

	public String getdescripcion() {

		return descripcion;
	}
	// setter

	public void setdescripcion(String descripcion) {

		this.descripcion = descripcion;
	}

	// getter

	public double getprecioCompra() {

		return precioCompra;
	}
	// setter

	public void setprecioCompra(double precioCompra) {

		this.precioCompra = precioCompra;
	}

	// getter

	public double getprecioVenta() {

		return precioVenta;
	}
	// setter

	public void setprecioVenta(double precioVenta) {

		this.precioVenta = precioVenta;
	}

	// getter

	public int getstock() {

		return stock;
	}
	// setter

	public void setstock(int stock) {

		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Codigo: " + codigo +"\n"+
				"Descripcion: " + descripcion + "\n"+
				"PrecioCompra: " + precioCompra+"\n"+
				"PrecioVenta: " + precioVenta +"\n"+
				"Stock: " + stock;
	}
	
	public void incremento(int nEntradaMercancia) {
	if (nEntradaMercancia>=1) {
		
		stock=stock+nEntradaMercancia;	
	}		
	}
	
	public void descremento(int nSalidaMercancia) {
		if (stock==0) {
			System.out.println("Lo siento no se pueden retirar productos porque no hay");
		}else if(nSalidaMercancia>stock) {
			System.out.println("Lo siento el numero de retirada es superior a la stock");
		}else if(nSalidaMercancia>=1) {
			System.out.println("Mercancia retirada");
			stock=stock-nSalidaMercancia;
		}
		
		
		
		
	}
	
	
	
	
}
