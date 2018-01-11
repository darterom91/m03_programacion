package practicasUrgentes;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}

	public static void menu() {
		// TODO Auto-generated method stub
		int valor1, valor2;
		int option=0;
		do {
			System.out.println("Menu calculator:\n"
							+  "---- -----------\n"
							+  "1- Calculo MCD\n"
							+  "2- Calculo MCM\n"
							+  "3- suma, resta, divide, multiplica\n"
							+  "4- Calcular Areas\n"
							+  "5- Finalizar programa");
			option=introOption();
			switch(option) {
			case 1:
				System.out.println("1- Calculo MCD");
				System.out.println("Introduce a: ");
				valor1=introOption();
				System.out.println("Introduce b: ");
				valor2=introOption();
				calculComu(valor1, valor2);
				break;
			case 2:
				System.out.println("2- Calculo MCM");
				calculComu();
				break;
			case 3:
				System.out.println("3- suma, resta, divide, multiplica");
				calculOpBasic();
				break;
			case 4:
				System.out.println("4- Calcular Areas");
				calculArea();
				break;
			case 5:
				System.out.println("5- Finalizar programa");
				break;
			default:
				System.out.println(option+" No es valida esta opcion ");
				break;
			}
		}while(option!=4);
	}

	private static void calculComu(int valor1, int valor2) {
		int r=0 ;
			// TODO Auto-generated method stub
//		   A        B
//		   3768 - 1727 = 2041 //como 2041 es mayor que el valor de "b" entonces "a" es igual a 2014
//		   2041 - 1727 = 314// como 314 es menor que el valor que "b" entonces "a" es igual a 1727
//		   1727 - 314   = 1413
//		   1413 - 314   = 1099
//		   1099 - 314   = 785
//		   785   - 314   = 471
//		   471   - 314   = 157
//		   314   - 157   = 157
//		   157   - 157   = 0 //como los 2 resultados son iguales el MCD es 157
//
		while(valor2 != 0){
			 System.out.print(valor1+" - "+valor2+" = ");
	         r = valor2;
	         valor2 = valor1 % valor2;
	         System.out.print(valor2+"\n");
	         valor1 = r;
	    }
	
	}

	private static void calculArea() {
		// TODO Auto-generated method stub
		
	}

	private static void calculOpBasic() {
		// TODO Auto-generated method stub
		
	}

	private static void calculComu() {
		// TODO Auto-generated method stub
		int valor1=0, valor2=0, cont12=0, cont13=0, cont15=0, cont17=0, cont111=0, cont22=0, cont23=0, cont25=0, cont27=0, cont211=0;
		int v1 = 0, v2=0, v3=0, v4=0, v5=0, res=0;
		System.out.println("Introduce el valor 1: ");
		valor1=introOption();
		System.out.println("Introduce el valor 2: ");
		valor2=introOption();
		
		System.out.println("Descomposicion del valor1: "+valor1+"\n"
				         + "-------------- --- ------- ---\n");
		while(valor1!=1) {
			if(valor1%2==0) {
				System.out.print(valor1+" | 2"+" =");
				valor1/=2;
				System.out.print(valor1+" \n");
				cont12++;
			}else {
				if(valor1%3==0) {
					System.out.print(valor1+" | 3"+" =");
					valor1/=3;
					System.out.print(valor1+" \n");
					cont13++;
				}
				if(valor1%5==0) {
					System.out.print(valor1+" | 5"+" =");
					valor1/=5;
					System.out.print(valor1+" \n");
					cont15++;
				}
				if(valor1%7==0) {
					System.out.print(valor1+" | 7"+" =");
					valor2/=7;
					System.out.print(valor1+" \n");;
					cont17++;
				}
				if(valor1%11==0) {
					System.out.print(valor1+" |11"+" =");
					valor1/=5;
					System.out.print(valor1+" \n");
					cont111++;
				}
			}
		}
		
		System.out.println("cont 2: "+cont12+"\ncont 3: "+cont13+"\ncont 5: "+cont15+"\ncont 7: "+cont17+"\ncont 11: "+cont111);
		System.out.println("\n");
		System.out.println("Descomposicion del valor2: "+valor2+"\n"
						 + "-------------- --- ------- ---\n");
		while(valor2!=1) {
			if(valor2%2==0) {
				System.out.print(valor2+" | 2"+" =");
				valor2/=2;
				System.out.print(valor2+" \n");
				cont22++;
			}else {
				if(valor2%3==0) {
					System.out.print(valor2+" | 3"+" =");
					valor2/=3;
					System.out.print(valor2+" \n");
					cont23++;
				}
				if(valor2%5==0) {
					System.out.print(valor2+" | 5"+" =");
					valor2/=5;
					System.out.print(valor2+" \n");
					cont25++;
				}
				if(valor2%7==0) {
					System.out.print(valor2+" | 7"+" =");
					valor2/=7;
					System.out.print(valor2+" \n");;
					cont27++;
				}
				if(valor2%11==0) {
					System.out.print(valor2+" |11"+" =");
					valor2/=5;
					System.out.print(valor2+" \n");
					cont211++;
				}
			}
		}
		System.out.println("cont2 2: "+cont22+"\ncont2 3: "+cont23+"\ncont2 5: "+cont25+"\ncont2 7: "+cont27+"\ncont2 11: "+cont211);
		
		if(cont12>cont22) {
			v1=(int) Math.pow(2, cont12);
		}else if(cont12<cont22){
			v1=(int) Math.pow(2, cont22);
		}
		
		if(cont13>cont23) {
			v2=(int) Math.pow(3, cont13);
		}else if(cont13<cont23){
			v2=(int) Math.pow(3, cont23);
		}
		
		if(cont15>cont25) {
			v3=(int) Math.pow(5, cont15);
		}else if(cont15<cont25){
			v3=(int) Math.pow(5, cont25);
		}
		
		if(cont17>cont27) {
			v4=(int) Math.pow(7, cont17);
		}else if(cont17<cont27){
			v4=(int) Math.pow(7, cont27);
		}
		
		if(cont111>cont211) {
			v5=(int) Math.pow(11, cont111);
		}else if(cont111<cont211){
			v5=(int) Math.pow(11, cont211);
		}
		res=v1+v2+v3;
		res=res+v4;
		res=res+v5;
		System.out.println(v1+" + "+v2+" + "+v3+" + "+v4+" + "+v5+" = "+res);
	}

	public static int introOption() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int option=0, i=0;
		System.out.print("\nIntroduce la opcion: ");
		do{
			if(s.hasNextInt()) {
				option=s.nextInt();
				i++;
			}else {
				System.out.println("EL valor no es entero...");
				System.out.print("\nIntroduce la opcion: ");
				s.next();
			}
		}while(i<1);
		return option;
	}

}
