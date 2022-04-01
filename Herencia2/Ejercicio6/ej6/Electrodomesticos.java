package ej6;

public class Electrodomesticos {

	private  static double precioBase = 100;
	private String color = "blanco";
	private static char consumoEnergetico = 'F';
	private static int peso = 5;

	public Electrodomesticos() {

	}

	public Electrodomesticos(double precioBase, int peso) {

		this.precioBase = precioBase;
		this.peso = peso;
	}

	public Electrodomesticos(double precioBase, String color, char consumoEnergetico, int peso) {

		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	

	// comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
	// sino es correcta usara la letra por defecto. Se invocara al crear el objeto
	// y no sera visible.

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public static  boolean comprobarConsumoEnergetico(char letra) {

		
		
		if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' 
				|| letra == 'E' || letra == 'F') {

			return true;

		} else {
			return  false;
		}

	}

	// comprobarColor(String color): comprueba que el color es correcto,
	// sino lo es usa el color por defecto.
	// Se invocara al crear el objeto y no sera visible.
	public static boolean comprobarColor(String color) {

		String color1 = color.toLowerCase();

		if (color1 == "blanco" || color1 == "negro" || color1 == "rojo" || color1 == "azul" || color1 == "gris") {

			return true;

		} else {

			return false;
		}
	}

	// precioFinal(): según el consumo energético, aumentara su precio, y según su
	// tamaño, también. Esta es la lista de precios:

	public static boolean precioFinal() {

		if (consumoEnergetico=='A') {
			precioBase=precioBase+100;
			return true;
			
		}else if (consumoEnergetico=='B') {
			precioBase=precioBase+80;
			return true;
		}else if (consumoEnergetico=='C') {
			precioBase=precioBase+60;
			return true;
		}else if (consumoEnergetico=='D') {
			precioBase=precioBase+50;
			return true;
		}else if (consumoEnergetico=='E') {
			precioBase=precioBase+30;
			return true;
		}else if (consumoEnergetico=='F') {
			precioBase=precioBase+10;
			return true;
		}
		
		int [] comprobarNumero=new int[20];
		
		for (int i = 0; i < comprobarNumero.length; i++) {
			
			comprobarNumero[i]=i;
			
		}
		
		for (int i = 0; i < comprobarNumero.length; i++) {
			if (peso==comprobarNumero[i]) {
				
				precioBase=precioBase+10;
				
			}
		}
	}

}
