package Oca;

import java.util.Scanner;

public class JuegoOca {

	public static int tiraDados(int minDado, int maxDado) {

		int aleatorio = (int) (Math.random() * (minDado - maxDado) + maxDado);

		return aleatorio;

	}

	public static void pintaPista(int fichaJ1, int fichaJ2) {

		for (int i = 1; i < 12; i++) {
			System.out.print("\t"+i );
		}
		System.out.println();

		for (int i = 0; i < fichaJ1; i++) {
			System.out.print("\t");
		}
		System.out.print("J1");

		System.out.println();
		for (int i = 0; i < fichaJ2; i++) {
			System.out.print("\t");
		}
		System.out.print("J2");

	}

	public static boolean sumaDeNumeroEsPrimo(int num1, int num2) {

		int sumaNumero = num1 + num2;

		for (int i = 2; i < sumaNumero; i++) {
			if ((sumaNumero % i) == 0) {
				return false;
			}
		}

		return true;

	}

	public static String imprimeComoVaLaCarrera(String nombreJ1, String nombreJ2, int fichaJ1, int fichaJ2) {

		if (fichaJ1 > fichaJ2) {
			return "Va ganando el jugador: " + nombreJ1;
		} else if (fichaJ1 < fichaJ2) {
			return "Va ganando el jugador: " + nombreJ2;
		} else {
			return "Van empate";
		}
	}

	public static String esGanador(String nombreJ1, String nombreJ2, int fichaJ1, int fichaJ2) {

		if (fichaJ1 >= 11) {
			return nombreJ1;
		} else if (fichaJ2 >= 11) {
			return nombreJ2;
		} else {
			return "";
		}
	}

	public static void main(String[] args) {

		int fichaJ1 = 0;
		int fichaJ2 = 0;
		String nombreJ2 = "";
		String nombreJ1 = "";
		String caracterAvanzar;

		Scanner numero = new Scanner(System.in);
		Scanner nombre = new Scanner(System.in);
		System.out.println("!BIENVENIDOS  A LA CARRERA DEL SIGLO");

		System.out.println();
		System.out.println("¿Cual es el numero minimo?");
		int minDado = numero.nextInt();
		System.out.println("¿Cual es el numero maximo?");
		int maxDado = numero.nextInt();

		System.out.println();
		System.out.println("¿Cual es el nombre del jugador 1 ?");
		nombreJ1 = nombre.nextLine();

		do {
			System.out.println();

			System.out.println("¿Cual es el nombre del jugador 2 ?");
			nombreJ2 = nombre.nextLine();
			if (nombreJ1.equals(nombreJ2)) {
				System.out.println("Los nombres son iguales");
			}
		} while (nombreJ1.equals(nombreJ2));

		while (esGanador(nombreJ1, nombreJ2, fichaJ1, fichaJ2) == "") {

			int tirada1 = tiraDados(minDado, maxDado);
			int tirada2 = tiraDados(minDado, maxDado);

			System.out.println("Turno del jugador " + nombreJ1);

			System.out.println("Ha sacado un " + tirada1 + " en la primera tirada");
			System.out.println("Ha sacado un " + tirada2 + " en la segunda tirada");

			if (sumaDeNumeroEsPrimo(tirada1, tirada2) == true) {
				fichaJ1 = (tirada1 + tirada2)+fichaJ1;
				System.out.println("¡Tirada valida!");
			} else {
				System.out.println("¡Tirada no válida!");
			}

			pintaPista(fichaJ1, fichaJ2);
			System.out.println();
			System.out.println(imprimeComoVaLaCarrera(nombreJ1, nombreJ2, fichaJ1, fichaJ2));
			
			if (esGanador(nombreJ1, nombreJ2, fichaJ1, fichaJ2) == nombreJ1) {
				System.out.println("El ganador es: " + esGanador(nombreJ1, nombreJ2, fichaJ1, fichaJ2));
			}
			
			// ahora para jugador 2
			if (!(esGanador(nombreJ1, nombreJ2, fichaJ1, fichaJ2)==nombreJ1 || esGanador(nombreJ1, nombreJ2, fichaJ1, fichaJ2)==nombreJ2)) {
				System.out.println("Pusa cualquier tecla  para avanzar");
				caracterAvanzar = nombre.nextLine();
			}
			
			//para que no entre aqui si ya ha ganado el jugador 1
			if (!(esGanador(nombreJ1, nombreJ2, fichaJ1, fichaJ2) == nombreJ1)) {
				
			
			System.out.println();
			int tirada3 = tiraDados(minDado, maxDado);
			int tirada4 = tiraDados(minDado, maxDado);

			System.out.println("Turno del jugador " + nombreJ2);

			System.out.println("Ha sacado un " + tirada3 + " en la primera tirada");
			System.out.println("Ha sacado un " + tirada4 + " en la segunda tirada");

			if (sumaDeNumeroEsPrimo(tirada3, tirada4) == true) {
				fichaJ2 = (tirada3 + tirada4)+fichaJ2;
				System.out.println("¡Tirada valida");
			} else {
				System.out.println("¡Tirada no válida!");
			}

			pintaPista(fichaJ1, fichaJ2);
			System.out.println();
			System.out.println(imprimeComoVaLaCarrera(nombreJ1, nombreJ2, fichaJ1, fichaJ2));
			
			}
			
			if (esGanador(nombreJ1, nombreJ2, fichaJ1, fichaJ2) == nombreJ2) {
				System.out.println("El ganador es: " + esGanador(nombreJ1, nombreJ2, fichaJ1, fichaJ2));
			}
			

			if (!(esGanador(nombreJ1, nombreJ2, fichaJ1, fichaJ2)==nombreJ1 || esGanador(nombreJ1, nombreJ2, fichaJ1, fichaJ2)==nombreJ2)) {
				System.out.println("Pusa cualquier tecla  para avanzar");
				caracterAvanzar = nombre.nextLine();
			}

		}
		
	}
}
