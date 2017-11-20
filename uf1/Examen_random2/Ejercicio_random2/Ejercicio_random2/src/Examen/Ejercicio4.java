package Examen;

import java.util.Scanner;

import org.omg.CORBA.TRANSACTION_UNAVAILABLE;

public class Ejercicio4 {
	public static int N = 5;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int vecP[] = new int[N], i = 0, num=0, res=0, base=4;
		do{
			System.out.println("Introduce el numero de 5 digitos: ");
			if(s.hasNextInt()){
				num=s.nextInt();
				if(num>9999 && num<100000){
				i++;
				}else{
					System.out.println("El valor no tiene 5 digitos...");
				}
			}else{
				System.out.println("El valor no es entero...");
				s.next();
			}
		}while(i<1);
		
		i=0;
		
		while(num>0){
			res=num%10;
			System.out.println(res);
			num=num/10;
			System.out.println(num);
			vecP[i]=res;	
			i++;
		}
		
		System.out.println("Mostrando el vector");
		for(i=vecP.length-1;i>=0;i--){
			System.out.println("["+vecP[i]+"]");
		}
		
		System.out.println("Mostrando el vector\n");
		for(i=vecP.length-1;i>=0;i--){
			res=(int) Math.pow(base, i);
			System.out.println("res: "+res);
			vecP[i]=vecP[i]*res;
			System.out.println("vec: "+vecP[i]);
		}
		res=0;
		for(i=0;i<vecP.length;i++){
			System.out.println(vecP[i]);
			res=res+vecP[i];
		}
		System.out.println("El resultado total: "+res);
	}
}
