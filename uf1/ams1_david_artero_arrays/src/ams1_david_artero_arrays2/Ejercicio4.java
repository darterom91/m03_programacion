package ams1_david_artero_arrays2;

public class Ejercicio4 {
	public static final int vec[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
	public static final int vec2[] = { 10, 9, 11, 12, 13, 15, 14, 16 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vec3[] = new int[vec.length + vec2.length];
		int i = 0, z=0, aux;
		
		//introduce los valores del vec1 al vec3 cada 2 celdas
		while (i < vec3.length) {
			vec3[i] = vec[z];
			i=i+2;
			z++;
		}
		
		//inicializando las variables
		i=1;
		z=0;
		//introduce los valores del vec2 al vec3 cada 2 celdas empezando en 1
		while (i < vec3.length) {
			vec3[i] = vec2[z];
			i=i+2;
			z++;
		}
		System.out.println("============ Sin ordenar =============");
		for (i = 0; i < vec3.length; i++) {
			System.out.print("[" + vec3[i] + "] ");
		}
		
		//ordenacion del vector
		for(i=0;i<vec3.length;i++){
			for(int j=0;j<vec3.length-i-1;j++){
				if(vec3[j]>vec3[j+1]){
					aux = vec3[j+1];
					vec3[j+1]=vec3[j];
					vec3[j]=aux;
				}
			}
		}
		
		//mostrar
		System.out.println("\n\n============ Ordenado =============");
		for (i = 0; i < vec3.length; i++) {
			System.out.print("[" + vec3[i] + "] ");
		}
	}

}
