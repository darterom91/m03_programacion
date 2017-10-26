package ej_random;

public class Ejercicios_random {
	public static final int EJ = 10;

	public static void main(String[] args) {
		int ejercicios[] = new int[EJ];

		for (int i = 0; i < ejercicios.length; i++) {
			if (i % 2 == 0) {
				ejercicios[i] = (int) Math.floor(Math.random() * (5 - 1) + 1);
			} else {
				ejercicios[i] = (int) Math.floor(Math.random() * (10 - 1) + 1);
			}
		}
		
		System.out.println("Ejercicios de examen para repasar\n"
						+  "========== == ====== ==== =======\n");
		for (int i = 0; i < ejercicios.length; i++) {
			if (i % 2 == 0) {
				int option = (int) Math.floor(Math.random() * (3 - 1)+1);
				switch (option) {
				case 1:
					System.out.println("Practica 1: ej [" + ejercicios[i] + "]");
					break;
				case 2:
					System.out.println("Practica 2: ej [" + ejercicios[i] + "]");
					break;
				}

			} else {
				int option =(int) Math.floor(Math.random() * (3 - 1)+1); 
				switch (option) {
				case 1:
					System.out.println("Practica 3: ej [" + ejercicios[i] + "]");
					break;
				case 2:
					System.out.println("Practica 4: ej [" + ejercicios[i] + "]");
					break;
				}
			}
		}

	}
}
