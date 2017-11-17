
public class Ejercicio5 {
	public static int N = 200;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vec[] = new int[N], i = 0, j = 0, aux=0, mayor=0;

		while (i < vec.length) {
			vec[i] = (int) Math.floor(Math.random() * (200 - 1) + 1);
			i++;
		}
		
		for (i = 0; i < vec.length; i++) {
			System.out.print("[" + vec[i] + "]");
		}
		System.out.println();
		
		for (i = 0; i < vec.length-1; i++) {
			for(j=i+1;j<vec.length;j++){
				if(vec[i]>vec[j]){
					aux=vec[i];
					vec[i]=vec[j];
					vec[j]=aux;
				}
			}
		}
		
		for (i = 0; i < vec.length; i++) {
			System.out.print("[" + vec[i] + "]");
		}
		System.out.println();
		
		for (i = 0; i < vec.length; i++) {
			for(j=0;j<vec.length;j++){
				if(vec[i]<vec[j]){
					mayor=vec[j];
				}
			}
		}
		
		System.out.println("El numero mayor es el "+mayor);

	}

}
