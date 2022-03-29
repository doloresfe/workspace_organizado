package Cuenta;

public class Cuenta {

	private String nombreCliente;
	private String numeroCuenta;
	private double tipoInteres;
	private double saldo;
	
	public Cuenta() {
		
	}
	
	public Cuenta(String nombreCliente, String numeroCuenta,double tipoInteres,double saldo) {
	
		this.nombreCliente=nombreCliente;
		this.numeroCuenta=numeroCuenta;
		this.tipoInteres=tipoInteres;
		this.saldo=saldo;
		
	}
	
	//getter solo consultar,coger,devolver,comparar,operar
	
	public String getNombreCliente() {
		return nombreCliente;
	}
	
	//setter moficar,guardar
	
	public void setNombreCliente(String nombreClienteP) {
		
		this.nombreCliente=nombreClienteP;
		
	}
	
	//getter
	public String getNumeroCuenta() {
		
		return numeroCuenta;
	}
	
	//setter
	
	public void setNumeroCuenta(String numeroCuentaP) {
		
		this.numeroCuenta=numeroCuentaP;
	}
	
	//getter
	
	public double getTipoInteres() {
		
		return tipoInteres;
	}
	
	//setter
	
	public void setTipoInteres( double tipoInteresP) {
		
		this.tipoInteres=tipoInteresP;
	}
	
	//getter  
	
	public double getSaldo() {
		
		
		return saldo;
	}
	
	//setter
	
	public void setSaldo(double saldoP) {
		
		this.saldo=saldoP;
	}
	
	//ingreso
	
	public boolean ingreso(double saldoIngreso ) {
		
		if (saldoIngreso>0) {
			saldo=saldoIngreso+saldo;
			return true;	
		}else {
			
			return false;
		}	
	}
	
	public boolean reintegro(double cantidad) {
		
		if (saldo>=cantidad) {
			saldo=saldo-cantidad;
			return true;
		} else {
			return false;
		}
		
	}
	
	
	public boolean transferencia(Cuenta destino, double importe) {
		
		if (saldo>=importe) {
			destino.setSaldo(destino.getSaldo()+importe);
			return true;
		}else {
			
			return false;
		}
		
	}
	
	
	
	
	
	
	
	
}
