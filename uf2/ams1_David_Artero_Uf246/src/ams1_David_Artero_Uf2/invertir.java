package ams1_David_Artero_Uf2;

import java.io.InputStream;
import java.util.Scanner;

public class invertir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0, res=0, i=0;
		System.out.println("Introduce un numero: ");
		num=introNum();
		do{
			System.out.println(num);
			res=res*10+num%10;
			System.out.println(res);
			num/=10;
		}while(num!=0);
		System.out.println(res);
	}

	public static int introNum() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		int num=0, i=0;
		do{
			if(s.hasNextInt()){
				num=s.nextInt();
				i++;
			}else{
				System.out.println("El valor no es entero...");
				s.next();
			}
		}while(i<1);
		return num;
	}

	private static Scanner Scanner(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}

}
