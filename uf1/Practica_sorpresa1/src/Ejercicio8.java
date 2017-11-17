
public class Ejercicio8 {
	public static int N = 10;

	public static void main(String[] args) {
		int vec[] = new int[N], i = 0, j = 0, cont = 0;
		for (i = 0; i < vec.length; i++) {
			vec[i] = (int) Math.floor(Math.random() * (20 - 1) + 1);
			if (vec[i] == vec[j]) {
				for (j = i; j < vec.length-1; j++) {
					if (vec[i] == vec[j]) {
						vec[i] = (int) Math.floor(Math.random() * (20 - 1) + 1);
					}
				}
			}else{
				
			}
		}

		System.out.println("Mostrar vector:");
		for (i = 0; i < vec.length; i++) {
			System.out.println(vec[i]);
		}

		System.out.println("Mostrar los numeros pares del vector:");
		for (i = 0; i < vec.length; i++) {
			if (vec[i] % 2 == 0) {
				cont++;
				if(cont==1){
					System.out.println(vec[i]);
				}
			}
		}
	}
}
