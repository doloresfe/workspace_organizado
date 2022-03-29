package Libro;

public class Libro {

	
	private String titulo;
	private String autor;
	private int numEjemplar;
	private int numEjemplarPrestado;
	
	public Libro() {
		
	}

	public Libro(String titulo, String autor, int numEjemplar, int numEjemplarPrestado) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplar = numEjemplar;
		this.numEjemplarPrestado = numEjemplarPrestado;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumEjemplar() {
		return numEjemplar;
	}

	public void setNumEjemplar(int numEjemplar) {
		this.numEjemplar = numEjemplar;
	}

	public int getNumEjemplarPrestado() {
		return numEjemplarPrestado;
	}

	public void setNumEjemplarPrestado(int numEjemplarPrestado) {
		this.numEjemplarPrestado = numEjemplarPrestado;
	}
	
	
	public boolean prestamo() {
        boolean prestado = true;
        if (numEjemplar > numEjemplarPrestado) {
            numEjemplarPrestado++;
        } else {
            prestado = false;
        }
        return prestado;
    }
	
	
	
	public boolean devolucion() {
        boolean devuelto = true;
        if (numEjemplarPrestado == 0) {
            devuelto = false;
        } else {
            numEjemplarPrestado--;
        }
        return devuelto;
    }
	
	@Override
	public String toString() {
		return "Titulo:  " + titulo +"\n" +
				"Autor:  " + autor + "\n"+
				"Ejemplares:  " + numEjemplar+"\n"+
				"Prestados:  " + numEjemplarPrestado;
	}
	
	
}
