package Fecha;

public class Fecha {

	private int dia;
	private int mes;
	private int anio;

	public Fecha() {

	}

	public Fecha(int dia, int mes, int anio) {

		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		return dia + "-" + mes + "-" + anio;
	}

	public boolean fechaCorrecta() {

		boolean diaCorrecto = false;
		boolean mesCorrecto = false;
		boolean anioCorrecto = false;

		if (mes >= 1 && mes <= 12) {
			mesCorrecto = true;
		}

		if (anio >= 0) {

			anioCorrecto = true;
		}

		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			if (dia >= 1 && dia <= 31) {
				diaCorrecto = true;
			}
			break;
		case 4, 6, 9, 11:
			if (dia >= 1 && dia <= 30) {
				diaCorrecto = true;
			}
			break;
		case 2:
			if (esBisiesto() == true && (dia >= 1 && dia <= 29)) {

				diaCorrecto = true;
			} else if (esBisiesto() == false && (dia >= 1 && dia <= 28)) {

				diaCorrecto = true;
			}
			break;
		}

		return diaCorrecto && mesCorrecto && anioCorrecto;

	}

	private boolean esBisiesto() {
		if (anio % 4 == 0 && anio % 10 != 0 && anio % 400 == 0) {

			return true;
		} else {
			return false;
		}
	}

	public void diaSiguiente() {
		if (fechaCorrecta()) {
			
		
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:

			if (dia == 31 && mes == 12) {

				mes = 1;
				dia = 1;
				anio = anio + 1;

			} else if (dia==31) {

				dia=1;
				mes=mes+1;
				
			}else {
				dia++;
			}

			break;

		case 4, 6, 9, 11:

			if (dia == 30) {

				dia = 1;
				mes = mes + 1;

			} else {

				dia++;
			}
			break;
		case 2:

			if (esBisiesto() && dia == 29) {

				dia = 1;
				mes = mes + 1;

			} else if (esBisiesto() == false && dia == 28) {

				dia = 1;
				mes = mes + 1;
			} else {

				dia++;
			}
			break;
		}
		} else {
			System.out.println("La fecha introducida no es correcta");
		}

	}

}
