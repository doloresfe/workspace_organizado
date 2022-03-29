package CuentaTest;

import Cuenta.Cuenta;

public class CuentaTest {

	public static void main(String[] args) {
		
		Cuenta cuentaDolores=new Cuenta();
		
		cuentaDolores.setNombreCliente("Dolores");
		cuentaDolores.setNumeroCuenta("12345678");
		cuentaDolores.setTipoInteres(10.65);
		cuentaDolores.setSaldo(40.000);
		
		
		System.out.println(cuentaDolores.getNombreCliente());
		System.out.println(cuentaDolores.getNumeroCuenta());
		System.out.println(cuentaDolores.getSaldo());
		
		System.out.println("---------------------------------------------");
		
		cuentaDolores.ingreso(300.000);
		
		System.out.println(cuentaDolores.getSaldo());
		
		cuentaDolores.reintegro(40.000);
		
		System.out.println(cuentaDolores.getSaldo());
		
		System.out.println(" ");
		
		Cuenta cuentaDestino=new Cuenta();
		
		cuentaDestino.setNombreCliente("Destino");
		cuentaDestino.setNumeroCuenta("456457567");
		cuentaDestino.setTipoInteres(10.65);
		cuentaDestino.setSaldo(20.000);
		
		
		System.out.println(cuentaDestino.getNombreCliente());
		System.out.println(cuentaDestino.getNumeroCuenta());
		System.out.println(cuentaDestino.getSaldo());
		
		System.out.println("---------------------------------------------");
		
		
		cuentaDolores.transferencia(cuentaDestino, 20.00);
		System.out.println(cuentaDestino.getSaldo());
	}

}
