package ams1_david_artero_estructures_repetitives;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 7, res, i, cont=0;
		
		for(i=1;i<1000;i++){
			if(i%num==0) {
				res=num*i;
				System.out.println("res: "+i);
				cont++;
			}
		}
		
		System.out.println("El numero de multiples de 7 son de "+cont);
	}

}
