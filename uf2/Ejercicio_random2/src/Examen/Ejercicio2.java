package Examen;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vec[] = new int[10], aux;
		for (int i = 0; i < vec.length; i++) {
			vec[i] = (int) Math.floor(Math.random() * (20 - 0) + 0);
		}

		System.out.println("Mostrar sin ordenar");
		for (int i = 0; i < vec.length; i++) {
			System.out.println(i + " :" + vec[i]);
		}

		for (int i = 0; i < vec.length - 1; i++) {
			for (int j = i + 1; j < vec.length; j++) {
				if (vec[i] > vec[j]) {
					aux = vec[i];
					vec[i] = vec[j];
					vec[j] = aux;
				}
			}
		}

		System.out.println("Mostrar ordenados");
		for (int i = 0; i < vec.length; i++) {
			System.out.println(i + " :" + vec[i]);
		}

		for (int i = 0; i < vec.length; i++) {
			vec[i] = (int) Math.floor(Math.random() * (20 - 0) + 0);
		}

		System.out.println("Mostrar sin ordenar");
		for (int i = 0; i < vec.length; i++) {
			System.out.println(i + " :" + vec[i]);
		}

		for (int i = 0; i < vec.length; i++) {
			for (int j = 0; j < vec.length - 1; j++) {

				if (vec[j] > vec[j + 1]) {
					aux = vec[j];
					vec[j] = vec[j + 1];
					vec[j + 1] = aux;

				}
			}
		}
		System.out.println("Mostrar ordenados");
		for (int i = 0; i < vec.length; i++) {
			System.out.println(i + " :" + vec[i]);
		}
	}

}
