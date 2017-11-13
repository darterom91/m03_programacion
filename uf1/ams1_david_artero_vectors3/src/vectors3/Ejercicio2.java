package vectors3;

import java.util.Scanner;

public class Ejercicio2 {
	public static final int N = 4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//no se como introducir valores grandes y verificar
		Scanner s = new Scanner(System.in);
		int base=5, num = 3231, i = 0, aux = 0, aux2 = 0;
		int[] numero = new int[N];
		int[] numero2 = new int[N];
		int[] res = new int[N];

		for (i = 0; i < numero.length; i++) {
			aux = num % 10;
			System.out.println(aux + " ");
			numero[i] = aux;
			num = num / 10;
		}

		for (i = numero.length - 1; i > -1; i--) {
			numero2[(numero.length - 1) - i] = numero[i];
		}
		
		System.out.println();
		
		for (i = 0; i < numero.length; i++)
			System.out.print(numero2[i] + " ");
		
		aux = N - 1;
		for (i = 0; i < N; i++) {
			res[i] = (int) Math.pow(base, aux - i);
			res[i] = res[i] * numero2[i];
			aux2=aux2+res[i];
			System.out.println("\nres: " + res[i] + " i: " + i);
		}
		System.out.println("resultado: "+aux2);
	}
}
