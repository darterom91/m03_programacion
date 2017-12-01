package ams1_David_Artero_Uf2;

import java.util.Scanner;

public class Exercise_03_David_Artero	{
	public static int N = 10;
	public static Scanner keyboard;
    public static void main(String[] arguments) {
    	
        keyboard = new Scanner(System.in);
        int[] box_numbers;
        int quantity_pair,quantity_odd, j=0;
        box_numbers = readNumber();

        	System.out.println("pair: "+(quantity_pair=numberN(box_numbers,true)));
        	System.out.println("odd: "+(quantity_odd=numberN2(box_numbers,false)));
    }
 
    public static int[] readNumber() {
       int i=0, nums[]=new int[N];
       do{
    	   System.out.println("Introduce el numero "+i+": ");
    	   if(keyboard.hasNextInt()){
    		   nums[i] = keyboard.nextInt();
    		   i++;
    	   }else{
    		   System.out.println("El valor no es entero...");
    		   keyboard.next();
    	   }
       }while(i<nums.length);
	return nums;
    }
    
    public static int numberN(int[] box_numbers, boolean b) {
    	int contT=0, contF=0;
		for(int i = 0;i<box_numbers.length;i++){
			if(box_numbers[i]%2==0){
					contT++;	
			}
		}   
		return contT;
    }
    
    public static int numberN2(int[] box_numbers, boolean N) {
    	int contT=0, contF=0;
		for(int i = 0;i<box_numbers.length;i++){
			if(box_numbers[i]%2!=0){
					contF++;	
			}
		}   
		return contF;
    }
    
}