package Contador;

public class Contador {

	private int cont;
	
	public Contador() {
		
	}

	public Contador(int cont) {
		super();
	if (cont>0) {
		this.cont=0;
	} else {

		this.cont = cont;
	}
	}
	
	// constructor copia
	
	public Contador(final Contador c) {
		
		this.cont=c.cont;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}
	
	
	public void ingrementa() {
		
		cont=cont+1;
	}
	
	public void descremento() {
		if (cont<=0) {
			cont=0;
		} else {
			cont=cont-1;
		}	
	}
	
	
	
	
	
}
