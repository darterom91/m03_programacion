package ams1_david_artero_condicionales;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int cargProd, cargDef;
		System.out.print("Inserte cualquier caracter para coger un numero alertorio\n >: ");
		s.next();
		//usar metodo random para introducir valoeres a una variable 
		cargDef=(int) Math.floor(Math.random() * (300 - 100) + 100);
		System.out.println("cargDef: "+cargDef);
		
		System.out.print("Inserte cualquier caracter para coger un numero alertorio\n >: ");
		s.next();
		//usar metodo random para introducir valoeres a una variable
		cargProd=(int) Math.floor(Math.random() * (2000 - 900) + 900);
		
		System.out.println("cargProd: "+cargProd);
		
		if(cargDef>200 && cargProd<1000){
			System.out.println("grau 5");
		}else if(cargDef<200 && cargProd<1000){
			System.out.println("grau 6");
		}else if(cargDef>200 && cargProd>1000){
			System.out.println("grau 7");
		}else if(cargDef<200 && cargProd>1000){
			System.out.println("grau 8");
		}else{
			System.out.println("Cuando los numeros son iguales");
		}
	}

}
