package Fraccion;

public class Fraccion {

	private int num;
	private int den;
	
	public Fraccion() {
		
	}
	
	public Fraccion(int num, int den) {
		
		this.num=num;
		this.den=den;
	}
	
	public Fraccion(Fraccion c) {
		
		num=c.num;
		den=c.den;
		
	}
	
	
	public int getnum() {
		
		return num;
	}
	
	public void setnum(int num) {
		
		this.num=num;
	}
	
	public int getden() {
		
		return den;
	}
	
	public void setden(int den) {
		this.den=den;
	}

	@Override
	public String toString() {
		return num+"/"+den;
	}
	
	public Fraccion suma( Fraccion s) {
		
		int denominadorDEMiRedultado= den*s.den;
		int numeradorDemiresultado= ((denominadorDEMiRedultado/den)*num)+((denominadorDEMiRedultado/s.den)*s.num);
		
		Fraccion pepitogrillo = new Fraccion(numeradorDemiresultado,denominadorDEMiRedultado);
		return pepitogrillo;
	}
	
	
	
	
	
}
