package Pizza;

public class Pizza {
	
	private String tamano;
	private String tipo;
	private String estado;
	private  static int totalPedido;
	private static int totalServida;
	
	public Pizza() {
		totalPedido++;
		
	}
	
	public Pizza(String tamano, String tipo) {
		
		this.tamano=tamano;
		this.tipo=tipo;
		estado="pedido";
		totalPedido++;
	}
	
//getter 
	public String getTamano() {
		
		return tamano;
	}
//setter 
	public void setTamano(String tamano) {
		
		this.tamano=tamano;
	}

//getter
	public String getTipo() {
		return tipo;
	}
//setter
	public void setTipo(String tipo) {
		
		this.tipo=tipo;
	}
	
//getter 
	public String getEstado() {
		return  estado;
	}
//setter
	public void setEstado(String estado) {
		this.estado=estado;
	}

	//getter
	public static int getTotalPedida() {
		return totalPedido;
	}
	//setter
	public void setTotalPedida(int totalPedido) {
		
		this.totalPedido=totalPedido;
	}
	//getter 
	public static int getTotalServida() {
		return totalServida;
	}
	//setter
	public void setTotalServida(int totalServida) {
		
		this.totalServida=totalServida;
	}
	
	public String toString() {
		
		return "Pizza " +tipo+ " " +tamano+ ","+estado;
	}
	
	public void sirve() {
		
		if (estado.equals("pedido")) {
			estado="servida";
			totalServida++;
		} else {
				System.out.println("Esa pizza ya se ha servido");
		}
	}
	
	
	
	
	
	
	
	
	
	
}
