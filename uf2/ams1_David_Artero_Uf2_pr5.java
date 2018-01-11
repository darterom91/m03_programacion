package ams1_David_Artero_Uf2;

import java.util.Scanner;

public class ams1_David_Artero_Uf2_pr5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}

	public static void menu() {
		// TODO Auto-generated method stub
		int option=0, option2=0, i=0, num1, num2;
		do {
			System.out.println("Menu Ejercicios PR5:\n"
							+  "---- ---------- ----\n"
							+  "1- Ejercicio 1 \n"
							+  "2- Ejercicio 2 \n"
							+  "3- Ejercicio 3 \n"
							+  "4- Ejercicio 4 \n"
							+  "5- Ejercicio 5 \n"
							+  "6- Ejercicio 6 \n"
							+  "7- Salir \n");
			System.out.print("\n\n>: ");
			option=introOption();
			switch(option) {
			case 1:
				System.out.println("1- Ejercicio 1\n"
								+  "-- --------- --------\n"
								+  "1- Forma No recursiva\n"
								+  "2- Forma recursiva\n"
								+  "---------------------\n\n");
				System.out.print(">: ");
				option2=introOption();
					switch(option2) {
					case 1:
						System.out.print("1- Suma No recursiva\n"
								+        "---------------------\n\n");
						System.out.print("Introduce el numero: ");
						num1=introOption();
						System.out.print("Introduce las veces que se suma: ");
						num2=introOption();
						System.out.println("El resultado es "+multiVeces(num1, num2));
						break;
					case 2:
						System.out.print("2- Suma recursiva\n"
								+        "-------------------\n\n");
						System.out.print("Introduce el numero: ");
						num1=introOption();
						System.out.print("Introduce las veces que se suma: ");
						num2=introOption();
						num2-=1;
						System.out.println("El resultado es "+multiVecesRecu(num1, num2));
						break;
						
					default:
						System.out.println(option2+"- No valido");
						break;
					}
				break;
			case 2:
				System.out.println("2- Ejercicio 2\n"
								+  "--------------------------\n"
								+  "1- Potencias no recursivas\n"
								+  "2- potencias recursivas\n"
								+  "--------------------------\n\n");
				System.out.print(">: ");
				option2=introOption();
				switch(option2) {
				case 1:
					System.out.print("1- Potencias no recursivas\n"
									+"--------------------------\n");
					System.out.print("Introduce el numero: ");
					num1=introOption();
					System.out.print("Introduce las veces que se Multiplica: ");
					num2=introOption();
					num2-=1;
					System.out.println("El resultado es "+potenciaVeces(num1, num2));
					break;
				case 2:
					System.out.print("2- potencias recursivas\n"
									+"-----------------------");
					System.out.print("Introduce el numero: ");
					num1=introOption();
					System.out.print("Introduce las veces que se Multiplica: ");
					num2=introOption();
					num2-=1;
					System.out.println("El resultado es "+potenciaVecesRecu(num1, num2));
					break;
				default:
					System.out.println(option2+"- No valido");
					break;
				}
				
				break;
			case 3:
				System.out.println("3- Ejercicio 3\n"
						+  "---------------------------------\n"
						+  "1- DECIMAL A BINARI no recursivas\n"
						+  "2- DECIMAL A BINARI recursivas\n"
						+  "---------------------------------\n\n");
				System.out.print(">: ");
				option2=introOption();
				switch(option2) {
				case 1:
					System.out.print("1- DECIMAL A BINARI no recursivas\n"
									+"--------------------------\n");
					System.out.print("Introduce el numero: ");
					num1=introOption();
					decimalBinari(num1);
					break;
				case 2:
					System.out.print("2- DECIMAL A BINARI recursivas\n"
									+"-----------------------\n");
					System.out.print("Introduce el numero: ");
					num1=introOption();
					decimalBinariRecu(num1);
					System.out.println();
					break;
				default:
					System.out.println(option2+"- No valido");
					break;
				}
				
				break;
			case 4:
				System.out.print("Suma recursiva\n"
						+        "----- ---------\n\n");
				System.out.print("Introduce el numero: ");
				num1=introOption();
				System.out.print("Introduce las veces que se suma: ");
				num2=introOption();
				num2-=1;
				System.out.println("El resultado es "+multiVecesRecu(num1, num2));
				
				break;
			case 5:
				System.out.println("5- Ejercicio 5");
				System.out.print("potencias recursivas\n"
								+"--------- -----------");
				System.out.print("Introduce el numero: ");
				num1=introOption();
				System.out.print("Introduce las veces que se Multiplica: ");
				num2=introOption();
				num2-=1;
				System.out.println("El resultado es "+potenciaVecesRecu(num1, num2));
				break;
			case 6:
				System.out.println("6- Ejercicio 6");
				System.out.print("DECIMAL A BINARI recursivas\n"
								+"------- - ------ ----------\n");
				System.out.print("Introduce el numero: ");
				num1=introOption();
				decimalBinariRecu(num1);
				System.out.println();
				break;
			case 7:
				System.out.println("7- Salir");
				break;
			default:
				System.out.println(option+"- No es una opcion valida");
				break;
			}
		}while(option!=7);
		
	}

	private static void decimalBinariRecu(int num1) {
		// TODO Auto-generated method stub
		 if (num1 < 2) {
	            System.out.println(num1);
	        } else {
	        	decimalBinariRecu(num1 / 2);
	            System.out.println(num1 % 2);
	        }
	}

	private static void decimalBinari(int num1) {
		// TODO Auto-generated method stub
		int res=0;
		while(num1!=0){
			num1/=2;
			res=num1%2;
			System.out.println(res);
		}
	}

	private static int potenciaVecesRecu(int num1, int num2) {
		// TODO Auto-generated method stub
		if(num2==0) {
			return num1;
		}else {
		return num1*potenciaVecesRecu( num1, num2-1);
		}
	}

	private static int potenciaVeces(int num1, int num2) {
		// TODO Auto-generated method stub
		int res=0;
		for(int i=0;i<num2;i++) {
			res*=num1;
		}
		return res;
	}
	
	

	private static int multiVeces(int num1, int num2) {
		int res = 0;
		// TODO Auto-generated method 
			for(int i=0;i<num2;i++) {
				res+=num1;
			}
		return res;
	}
	private static int multiVecesRecu(int num1, int num2) {
		int res = 1;
		// TODO Auto-generated method 
			if(num2==0) {
				return num1;
			}else {
				return num1 + multiVecesRecu(num1, num2-1);	
			}
	}
	public static int introOption() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int option=0, i=0;
		do {
			if(s.hasNextInt()) {
				option=s.nextInt();
				i++;
			}else {
				System.out.println("El valor no es entero...");
				s.next();
			}
		}while(i<1);
		
		return option;
	}

}
