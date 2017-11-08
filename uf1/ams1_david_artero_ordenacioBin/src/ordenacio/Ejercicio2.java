package ordenacio;

import java.util.Scanner;

public class Ejercicio2 {
	public static final int N = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int vec[]=new int[N], aux, i=0, cont=0 ;
		
		for(i=0;i<vec.length;i++) {
			do {
				System.out.println("introduce el valor del vector "+i+": ");
				if(s.hasNextInt()) {
					vec[i]=s.nextInt();
					cont++;
				}else {
					System.out.println("El valor no es entero...");
					s.next();
				}
			}while(cont<1);
		}
		
		for(i=0;i<vec.length-1;i++) {
			for(int j=i+1;j<vec.length;j++) {
				if(vec[i]>vec[j]) {
					aux=vec[i];
					vec[i]=vec[j];
					vec[j]=aux;
				}
			}
		}
		
		for(int j=0;j<vec.length;j++) {
			System.out.println("linea: "+j+"["+vec[j]+"]");
		}
		
	}

}
