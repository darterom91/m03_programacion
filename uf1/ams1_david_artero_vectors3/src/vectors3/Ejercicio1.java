package vectors3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int dni=0, res=0, i=0;
		char letras[]={'t','r','w','a','g','h','y','f','p','d','x','b','n','j','z','s','q','v','h','l','c','k','e'};
		do{
			System.out.println("introduce tu dni: ");
			if(s.hasNextInt()){
				dni=s.nextInt();
				if(dni>10000000){
				i++;
				}else{
					System.out.println("El dni es menor a 10000000.");
				}
			}else{
				System.out.println("No es un valor entero");
			}
		}while(i<1);
		
		res=dni%23;
		System.out.println("dni: "+dni+" letras: "+letras[res]);
		
	}

}
