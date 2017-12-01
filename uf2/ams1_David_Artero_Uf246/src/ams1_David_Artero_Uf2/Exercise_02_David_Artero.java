package ams1_David_Artero_Uf2;

import java.util.Scanner;
public class Exercise_02_David_Artero {

    public static Scanner keyboard;
    
    public static void main(String[] arguments){

    	keyboard = new Scanner(System.in);
        int number1,number2;
        System.out.println("Introduce el valor I");
        number1 = readNumber();
        System.out.println("Introduce el valor II");
        number2 = readNumber();
        numberN(number1,number2);      
    
    }
 
    public static int readNumber() {
    	Scanner s = new Scanner(System.in);
       int num=0, j;
       for(int i=0;i<1;i++){
    	   if(s.hasNextInt()){
    		   num=s.nextInt();
    	   }else{
    		  System.out.println("El valor no es entero");
    		  s.next();
    		  i--;
    	   }
       }
    	return num;
    }
    
    public static void numberN(int num1, int num2){
    	int S=0, R=0, M=0;
    	double D=0;
    	S=num1+num2;
    	R=num1-num2;
    	M=num1*num2;
    	D=num1/num2;
    	
    	System.out.println("Suma: "+S);
    	System.out.println("Resta: "+R);
    	System.out.println("Multiplicacion: "+M);
    	System.out.println("Division: "+D);
    }
}
