package ams1_david_artero_estructures_repetitives;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num, num2, cont=1, res;
		do {
			System.out.println("Introduce un numero multiple de 10");
			num=s.nextInt();
			num2=num;
			
		}while(num%10!=0);
		
		System.out.println("num: "+num);
		
		do {
			num = num / 10;
			System.out.println("num: "+num);
			cont= cont + 1;
		}while(num%10==0);
		cont=cont-1;
		System.out.println("\nResultado\n"
						+  "=========");
		System.out.println(num+" * 10^"+cont+" = "+num2);
	}

}
