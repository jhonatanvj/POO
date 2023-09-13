import java.util.Scanner;

public class Aplmain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		String texto, clave;
		System.out.println("Ingrese el texto: ");
		texto = leer.nextLine();
		System.out.println("Ingrese la clave: ");
		clave = leer.nextLine();

		int n = clave.length();
		int n2 = texto.length();
		char letrastexto[] = new char[texto.length()];
		char letrasclave[] = new char[clave.length()];

		for (int i = 0; i < texto.length(); i++) {
			letrastexto[i] = texto.charAt(i);
		}

		// Almacenar las letras de la clave en letrasclave
		for (int i = 0; i < clave.length(); i++) {
			letrasclave[i] = clave.charAt(i);
		}

		// Ordenar las letras de la clave
		for (int i = 0; i < clave.length() - 1; i++) {
			for (int j = i + 1; j < clave.length(); j++) {
				if (letrasclave[i] > letrasclave[j]) {
					char aux2 = letrasclave[i];
					letrasclave[i] = letrasclave[j];
					letrasclave[j] = aux2;
				}
			}
		}
		new String(letrasclave);

		// Crear la matriz de acuerdo con el tamaño de la clave
		char matriz[][] = new char[n2 / n + 1][n];
		int aux = 0;
		for (int i = 0; i < n2 / n + 1; i++) {
			for (int j = 0; j < n; j++) {
				if (aux < n2) {
					matriz[i][j] = letrastexto[aux];
					aux++;
				} else {
					matriz[i][j] = ' ';
				}
			}
		}

		int[] posiciones = new int[letrasclave.length];

		for (int i = 0; i < letrasclave.length; i++) {
			char letra = letrasclave[i];
			int posicion = clave.indexOf(letra);
			posiciones[i] = posicion;
		}
		int filas = matriz.length;
		int columnas = matriz[0].length;
		int total = filas * columnas;
		char[] caracteresOrdenados = new char[total];

		System.out.println("\nTexto encriptado:");
		int index = 0;
		int w = 0;

		while (w < letrasclave.length) {
			for (int i = 0; i < n2 / n + 1; i++) {
				for (int j = 0; j < n; j++) {
					if (j == posiciones[w]) {
						caracteresOrdenados[index++] = matriz[i][j];
					}
				}
			}
			w++;
		}

		for (int i = 0; i < caracteresOrdenados.length; i++) {

			System.out.print(caracteresOrdenados[i]);

		}

		leer.close();

	}
}
