package ej2;

public  abstract class Poligono {

	protected int numeroLado;

	public Poligono(int numeroLado) {
		super();
		this.numeroLado = numeroLado;
	}

	public int getNumeroLado() {
		return numeroLado;
	}

	public void setNumeroLado(int numeroLado) {
		this.numeroLado = numeroLado;
	}

	@Override
	public String toString() {
		return "Poligono [numeroLado: " + numeroLado;
	}
	
	public abstract double  area();
}
