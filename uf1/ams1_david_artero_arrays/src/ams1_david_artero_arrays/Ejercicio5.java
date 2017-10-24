package ams1_david_artero_arrays;

import java.util.Random;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int vec[] = new int[6];
		int num, cambio = 0;
		boolean bol = false;

		for (int i = 0; i < vec.length; i++) {
			num = r.nextInt(50)+1;
			vec[i]=num;
		}
					
		System.out.println("\n");
		for (int i = 0; i < vec.length; i++) {
			System.out.println("vec[" + i + "]: " + vec[i]);
		}
		System.out.println("\n");
		for(int i=0;i<vec.length;i++){
			for(int j=vec.length-1;j>0;j--){
				if(vec[i]==vec[j]&&i!=j){
					System.out.println("vecj["+i+"j]: "+vec[i]+" = vec["+j+"]: "+vec[j]);
				}
			}
		}
		System.out.println("\n");
		for(int i=0;i<vec.length;i++){
			for(int j=vec.length-1;j>0;j--){
				if(vec[i]==vec[j]&&i!=j){
					cambio++;
					System.out.print("Cambio "+cambio+" ");
					num = r.nextInt(50)+1;
					vec[j]=num;
				}
			}
		}
		System.out.println("\n");
		for (int i = 0; i < vec.length; i++) {
			System.out.println("vec[" + i + "]: " + vec[i]);
		}
	}
}
