package ams1_David_Artero_Uf2;

import java.util.Scanner;

public class ams1_David_Artero_Uf2_pr1 {

	public static int N = 10;
	
	public static void main(String[] args) {
		int option=0, i=0;
		
		do{
			System.out.println("Menu de ejercicios: I \n"
							+  "---- -- ------------- \n"
							+  "| 1- Ejercicio 1    | \n"
							+  "| 2- Ejercicio 2    | \n"
							+  "| 3- Ejercicio 3    | \n"
							+  "| 4- Ejercicio 4    | \n"
							+  "| 5- Ejercicio 5    | \n"
							+  "| 6- Ejercicio 6    | \n"
							+  "| 7- Ejercicio 7    | \n"
							+  "| 8- Ejercicio 8    | \n"
							+  "| 2- Ejercicio 9    | \n"
							+  "| 10- Ejercicio 10  | \n"
							+  "| 11- Ejercicio 11  | \n"
							+  "| 12- Ejercicio 12  | \n"
							+  "| 13- Ejercicio 13  | \n"
							+  "| 14- Ejercicio 14  | \n"
							+  "| 15- Ejercicio 15  | \n"
							+  "| 0- Salir          | \n"
							+  "--------------------- \n");
			System.out.print("\n Introduce la opcion: ");
			option=introInt();
			switch(option){
			case 1:
				System.out.println("1- Ejercicio 1 ");
				ej1();
				break;
			case 2:
				System.out.println("2- Ejercicio 2 ");
				ej2();
				break;
			case 3:
				System.out.println("3- Ejercicio 3 ");
				ej3();
				break;
			case 4:
				System.out.println("4- Ejercicio 4 ");
				ej4();
				break;
			case 5:
				System.out.println("5- Ejercicio 5 ");
				ej5();
				break;
			case 6:
				System.out.println("6- Ejercicio 6 ");
				ej6();
				break;
			case 7:
				System.out.println("7- Ejercicio 7 ");
				ej7();
				break;
			case 8:
				System.out.println("8- Ejercicio 8 ");
				ej8();
				break;
			case 9:
				System.out.println("9- Ejercicio 9 ");
				ej9();
				break;
			case 10:
				System.out.println("10- Ejercicio 10 ");
				ej10();
				break;
			case 11:
				System.out.println("11- Ejercicio 11 ");
				ej11();
				break;
			case 12:
				System.out.println("12- Ejercicio 12 ");
				ej12();
				break;
			case 13:
				System.out.println("13- Ejercicio 13 ");
				ej13();
				break;
			case 14:
				System.out.println("14- Ejercicio 14 ");
				ej14();
				break;
			case 15:
				System.out.println("15- Ejercicio 15 ");
				ej15();
				break;
			case 0:
				System.out.println("0- Salir ");
				break;
			default:
				System.out.println("Opcion no valida ");
				break;
			}
		}while(option!=0);

	}
	//ejercicios 1-15
	public static void ej1() {
		// TODO Auto-generated method stub
		int num1=0, num2=0, num3=0;
		System.out.println("Introduce el valor 1:");
		num1=introInt();
		System.out.println("Introduce el valor 2:");
		num2=introInt();
		System.out.println("Introduce el valor 3:");
		num3=introInt();
		
		System.out.println("El valor mas pequeño es: "+valMin(num1, num2, num3));
	}
	public static int valMin(int num1, int num2, int num3) {
		// TODO Auto-generated method stub
		int res=0;
		if(num1<num2 && num1<num3){
			res=num1;
		}else if(num2<num3 && num2<num1){
			res=num2;
		}else if(num3<num2 && num3<num1){
			res=num3;
		}
		return res;
	}
	
	public static void ej2() {
		// TODO Auto-generated method stub
		double num1=0, num2=0, num3=0;
		System.out.println("Introduce el valor 1:");
		num1=introDouble();
		System.out.println("Introduce el valor 2:");
		num2=introDouble();
		System.out.println("Introduce el valor 3:");
		num3=introDouble();
		
		System.out.println("La media es: "+valMedia(num1, num2, num3));
	}

	public static double valMedia(double num1, double num2, double num3) {
		// TODO Auto-generated method stub
		double res=0;
		res+=num1;
		res+=num2;
		res+=num3;
		res/=3;
		return res;
	}
	public static void ej3() {
		// TODO Auto-generated method stub
		String frase;
		System.out.println("Introduce una frase: ");
		frase=introString();
		System.out.println(palabrasParInpar(frase));
	}
	
	public static String palabrasParInpar(String frase){
		int pos=0, longi=0;
		if(frase.length()%2==0){
			System.out.println("La frase es Par");
			pos=(frase.length()-1)/2;
			longi=frase.length()-1;
			
			System.out.println("pos: "+pos);
			System.out.println("long: "+longi);
			
			System.out.println("La frase es: ");
		}else{
			System.out.println("La frase es inpar");
			pos=(frase.length()-1)/2;
			longi=frase.length()-1;
			
			System.out.println("pos: "+pos);
			System.out.println("long: "+longi);
			
			System.out.println("La frase es: ");
		}
		
		return frase.substring(pos,longi);	
	}
	
	public static void ej4() {
		// TODO Auto-generated method stub
		String frase;
		System.out.println("Introduce una frase: ");
		frase=introString2();
		buscarVocales(frase);
	}
	
	public static void buscarVocales(String frase){
		int vocales[]=new int[5];
		for(int i=0;i<frase.length();i++){
			if(frase.charAt(i)=='a'||frase.charAt(i)=='A'){
				vocales[0]+=1;
			}
			
			if(frase.charAt(i)=='e'||frase.charAt(i)=='E'){
				vocales[1]+=1;
			}
			
			if(frase.charAt(i)=='i'||frase.charAt(i)=='I'){
				vocales[2]+=1;
			}
			
			if(frase.charAt(i)=='o'||frase.charAt(i)=='O'){
				vocales[3]+=1;
			}
			
			if(frase.charAt(i)=='u'||frase.charAt(i)=='U'){
				vocales[4]+=1;
			}
			
		}
		System.out.println("Contar Vocales:    \n"
						+  "------ ------------");
		System.out.println("|a: "+vocales[0]+""
						 + "             |");
		System.out.println("|e: "+vocales[1]+""
						+  "             |");
		System.out.println("|i: "+vocales[2]+""
						+  "             |");
		System.out.println("|o: "+vocales[3]+""
						+  "             |");
		System.out.println("|u: "+vocales[4]+""
						+  "             |\n"
						+ "-------------------\n\n");
	}
	
	public static void ej5() {
		// TODO Auto-generated method stub
		String frase="The quick brown fox jumps over the lazy dog.";
		String palabras[]=frase.split(" ");
		
		System.out.println("El numero de palabras es: "+palabras.length);
	}

	public static void ej6() {
		// TODO Auto-generated method stub
		int num=0;
		System.out.println("Introduce un numero: ");
		num=introInt();
		System.out.println("La suma de los digitos de "+num+" es: "+contarDigitos(num));
	}

	public static int contarDigitos(int num){
		int res=0;
		do{
			res+=num%10;
			num/=10;
		}while(num!=0);
		return res;
	}
	
	public static void ej7() {
		// TODO Auto-generated method stub
		int mult=0 ,pg=0;
		
		for(int i=0;i<20;i++) {
			pg=i;
			pg=numPentagonales(mult, pg);
			System.out.println("num "+i+": "+pg);
		}
	}

	public static int numPentagonales(int mult, int pg) {
		// TODO Auto-generated method stub
		mult=pg*(pg*3-1);
		return pg=mult/2;
	}
	public static void ej8() {
		// TODO Auto-generated method stub
		double M=0, a=0,p=0;
		System.out.println("Introduce la cantidad a invertir: ");
		M=introDouble();
		System.out.println("Cantidad de años: ");
		a=introInt();
		System.out.println("Interes: ");
		p=introDouble();
		finaciasFuturo(M, a, p);
	}

	private static void finaciasFuturo(double m, double a, double p) {
		// TODO Auto-generated method stub
		int i=1;
		double pv=0, res=0;
		
		p=p/100;
		System.out.println(p);
		while(i<a){
			res=p+1;
			res=res*i;
			pv=res*m;
			System.out.println("precio futuro: "+pv);
			i++;
		}
	}
	public static void ej9() {
		// TODO Auto-generated method stub

		// 	( ) * + , - . / 0 1 2 3 4 5 6 7 8 9 : ;                  
		//	< = > ? @ A B C D E F G H I J K L M N O                  
		//	P Q R S T U V W X Y Z [ \ ] ^ _ ` a b c                  
		//	d e f g h i j k l m n o p q r s t u v w                  
		//	x y z
		char letras[]= {
				'(', ')', '*', '+', ',', '-', '.', '/', '0', '1', '2', '3', '4', '5', '6', '7',  '8',  '9', ':', ';', 
				'<', '=', '>', '?', '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',                  
				'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '[', '\'', ']', '^', '_', '`', 'a', 'b', 'c',                  
				'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',                  
				'x', 'y', 'z'};
		char letraA=0, letraB=0;
		int valorA = 0, valorB = 0;
		System.out.println("Introduce la letra inicial");
		letraA=introChar();
		System.out.println("Introduce la letra final");
		letraB=introChar();
		
		for(int i=0;i<letras.length;i++) {
			if(letraA==letras[i]) {
				valorA=i;
			}
		}
		
		for(int i=0;i<letras.length;i++) {
			if(letraB==letras[i]) {
				valorB=i;
			}
		}
		
		for(int i=valorA;i<=valorB;i++) {
			System.out.print("'"+letras[i]+"' ");
			if(i%20==0) {
				System.out.println();
			}
		}
		System.out.println();
	}

	public static void ej10() {
		// TODO Auto-generated method stub
		int any=0;
		System.out.println("Introduce el año");
		any=introInt();
		anyBisiaesto(any);
	}


	public static void anyBisiaesto(int any) {
		// TODO Auto-generated method stub
		if(any%4==0 && any%100!=0 || any%400==0){
			System.out.println(any+" es bisiesto");
		}else{
			System.out.println(any+" no es bisiesto");
		}
		
	}
	public static void ej11() {
		// TODO Auto-generated method stub
		String contrasenya="";
		comprovarPass(contrasenya);
	}

	public static void comprovarPass(String contrasenya) {
		// TODO Auto-generated method stub
		int i=0, contNum=0, contStr=0;
		do{
			
			System.out.println("Introduce una contrasenya: ");
			contrasenya=introString2();
			char pass[]=new char[contrasenya.length()];
				if(pass.length>=8){
					for(int j=0;j<pass.length;j++){
						pass[j]=contrasenya.charAt(j);
					}
			
					for(int j=0;j<pass.length;j++){
						if(pass[j]=='0'
								||pass[j]=='1'
								||pass[j]=='2'
								||pass[j]=='3'
								||pass[j]=='4'
								||pass[j]=='5'
								||pass[j]=='6'
								||pass[j]=='7'
								||pass[j]=='8'
								||pass[j]=='9'){
							contNum++;
						}
					}
					
					for(int j=0;j<pass.length;j++){
						if(pass[j]=='!'
								||pass[j]=='@'
								||pass[j]=='#'
								||pass[j]=='$'
								||pass[j]=='¢'
								||pass[j]=='€'
								||pass[j]=='∞'
								||pass[j]=='%'
								||pass[j]=='&'
								||pass[j]=='¬'
								||pass[j]=='('
								||pass[j]==')'
								||pass[j]=='='
								||pass[j]=='?'
								||pass[j]=='¿'
								||pass[j]=='¡'
								||pass[j]=='`'
								||pass[j]=='+'
								||pass[j]=='*'
								||pass[j]==','
								||pass[j]=='.'
								||pass[j]==';'
								||pass[j]==':'
								||pass[j]=='-'
								||pass[j]=='_'
								||pass[j]=='<'
								||pass[j]=='>'
								||pass[j]=='^'
								||pass[j]=='['
								||pass[j]==']'
								||pass[j]=='º'
								||pass[j]=='ª'){
							contStr++;
						}
					}
					
					if(contStr>0){
						System.out.println("hay caracteres que no estan permitidos...");
						i=0;
						contStr=0;
					}else{
						i++;
					}
					
					if(contNum<2){
						System.out.println("hay menos de 2 numeros...");
						i=0;
						contNum=0;
					}else{
						i++;
					}
			}else{
				System.out.println("El password es tiene menos de 8 caracteres...");
			}
		}while(i<2);
	}
	public static void ej12() {
		// TODO Auto-generated method stub
		int mat[][]=new int[N][N];
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat.length;j++){
				mat[i][j]=(int) Math.floor(Math.random()*(2-0)+0);
			}
		}
		
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat.length;j++){
				System.out.print("["+mat[i][j]+"]");
			}
			System.out.println();
		}
	}

	public static void ej13() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int lado[]= new int[3];
		System.out.println("Introduce el numero 1: ");
		lado[0]=introInt();
		System.out.println("Introduce el numero 2: ");
		lado[1]=introInt();
		System.out.println("Introduce el numero 3: ");
		lado[2]=introInt();
		
		System.out.println("El area es: "+areaTrangulo(lado));
		s.next();
	}

	public static double areaTrangulo(int[] lado) {
		// TODO Auto-generated method stub
		int s=0; 
		double area=0;
		
		for(int i=0;i<lado.length;i++){
			s+=lado[i];
		}
		s/=2;
		System.out.println("s: "+s);
		area=(int) Math.sqrt(s);
		
		return area;
	}
	public static void ej14() {
		// TODO Auto-generated method stub
		double ladosPol[]=new double[5], longi=0, aps=0, area=0;
		
		System.out.println("Introduce la long del los lados: ");
		longi=introDouble();
		
		for(int i=0;i<ladosPol.length;i++){
			ladosPol[i]=longi;
		}
		
		aps=longi/1.45;
		area= 5*longi*aps;
		area=area/2;
		
		System.out.println("El area es: "+area+"\n");
	}

	public static void ej15() {
		// TODO Auto-generated method stub
		int num=0;
		System.out.println("Introduce el numero: ");
		num=introInt();
		for(int i=1;i<num;i++){
			if(num%i==1){
				System.out.println(i);
			}
		}
	}

	public static int introInt() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int valor = 0, i=0;
		do{
			if(s.hasNextInt()){
				valor=s.nextInt();
				i++;
			}else{
				System.out.println("Error valor no entero");
				s.next();
				System.out.println("introduce el valor otra vez");
			}
		}while(i<1);
		
		return valor;
	}
	
	public static Double introDouble() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		double valor = 0;
		int i=0;
		do{
			if(s.hasNextDouble()){
				valor=s.nextDouble();
				i++;
			}else{
				System.out.println("Error valor no real");
				System.out.println("introduce el valor otra vez");
				s.next();
			}
		}while(i<1);
		
		return valor;
	}
	
	public static String introString(){
		Scanner s = new Scanner(System.in);
		boolean bol =false;
		String frase="";
		do{
			frase=s.next();
			if(frase.length()<=4){
				bol=true;
			}else{
				System.out.println("La frase es mayor de 4");
			}
		}while(bol!=true);
		
		return  frase;
	}
	
	public static String introString2(){
		Scanner s = new Scanner(System.in);
		boolean bol =false;
			String frase=s.nextLine();

		return  frase;
	}
	
	public static char introChar(){
		Scanner s = new Scanner(System.in);
		String letras;
		char letra = 0;
		int i=0;
		
		do {
			letras=s.next();
			if(letras.length()<2) {
				letra=letras.charAt(0);
				i++;
			}else {
				System.out.println("Has introducido 2 caracteres");
			}
		}while(i<1);
		
		return  letra;
	}
}
