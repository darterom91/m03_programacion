package ams1_david_artero_estructures_repetitives;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 7, i, res=0, cont = 0, cont2=0;
		for (i = 1; i < 1000; i++) {
			if (i % num == 0) {
				cont++;
				if (cont <= 100) {
					res+=i;
					System.out.println("primer: " + i+" cont: "+cont+" res: "+res);
					cont2=cont;
				}
			}
		}
		System.out.println("\nres: "+res+" cont: "+cont2);
	}

}
