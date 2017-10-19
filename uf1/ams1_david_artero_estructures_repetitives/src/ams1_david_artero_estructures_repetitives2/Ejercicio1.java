package ams1_david_artero_estructures_repetitives2;

public class Ejercicio1 {

	public static final int VALOR=25;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, n=0;
		
		for(i=0; i<VALOR;i++) {
			if(i%10==0) {
				System.out.println(i);
				n++;
			}
		}
		
		System.out.println("El resultat es "+n+". ");
			
	}

}
