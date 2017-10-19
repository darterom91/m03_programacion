package ams1_david_artero_estructures_repetitives2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num, i, res = 0;
		System.out.print("Introduce un numero: ");
		num=s.nextInt();
		System.out.println("");
		for(i=0;i<num;i++){
			res=res+i;
			if(res<num){
				System.out.print(res+" ");
			}
		}
	}

}
