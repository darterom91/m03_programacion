package Examen;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = 0, i=0, cont=0;
		
		while(i<1){
			System.out.println("Introduce un numero < 10");
			if(s.hasNextInt()){
				num=s.nextInt();
				if(num>=10){
					i++;
				}else{
					System.out.println("El valor: "+num+"< 10");
				}
			}else{
				System.out.println("El valor no es entero");
			}
			
		}
		System.out.println("El num es: "+num);
		i=0;
		while(i<num){
			num=num/10;
			System.out.println(num);
				cont++;
				i++;
		}
		System.out.println("La cantida es: "+cont);
	}

}
