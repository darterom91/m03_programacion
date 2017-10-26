package Examen;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num=0, cont=0, num2;
		
		do{
			System.out.print("Introduce le nombre: ");
			if(s.hasNextInt()){
				num=s.nextInt();
			}else{
				System.out.println("El numero no es entero");
			}
			System.out.println("\n");
		}while(num%10!=0);
		
		num2=num;
		
		int i=0;
		
		do{
				num=num/10;
				System.out.println("num: "+num+" es multiple de 10");
				cont=cont+1;
		}while(num%10==0);
		
		System.out.println("\n"+num+" * 10 per "+cont+" = "+num2);
	}

}
