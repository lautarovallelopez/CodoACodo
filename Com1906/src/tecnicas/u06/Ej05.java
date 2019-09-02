package tecnicas.u06;

import java.util.Scanner;

public class Ej05 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5) Crear un arreglo de n posiciones y llenarlo con nombres de personas.

		int n = asignartamano("ingrese el tamaño de posiciones");
		String[] nombres = new String[n];

		leernombres("ingrese nombres", nombres);
		mostrarnombres(nombres);

	}

	static int asignartamano(String mensaje) {
		Scanner te = new Scanner(System.in);
		System.out.println(mensaje);
		int tam = te.nextInt();
		return tam;

	}

	static void leernombres(String mensaje, String[] n) {
		int i;
		for (i = 0; i < n.length; i++) {
			Scanner te = new Scanner(System.in);
			System.out.println("ingrese nombres");
			n[i] = te.nextLine();

		}

	}

	static void mostrarnombres(String[] n) {
		int j;
		for (j = 0; j < n.length; j++) {
			System.out.println(n[j]);
		}

	}

}
