package ams1_david_artero_estructures_repetitives2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num,  i;
		System.out.println("introduce un num: ");
		num=s.nextInt();
		for(i=0;i<num;i++){
			for(int j=0;j<i;j++){
				System.out.print("a ");
			}
			System.out.println("");
		}
	}

}
