package Examen;

import java.util.Scanner;

public class Ejercicio5 {
	public static int N = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int vec[] = { 110, 50, 40 }, vec2[] = { 110, 50, 40 }, esc[] = new int[3], i = 0, j = 0;
			for (i = 0; i < vec.length; i++) {
				if(vec[0]>vec[1]&&vec[0]>vec[2]){
					esc[0]+=1;
					System.out.println(vec[0]+" > "+vec[1]);
					System.out.println(vec[0]+" > "+vec[2]);
					System.out.println("esc partit 0: "+esc[0]);
					vec[0]=vec[0]/(esc[0]+1);
				}
				if(vec[1]>vec[2]&&vec[1]>vec[0]){
					esc[1]+=1;
					System.out.println(vec[1]+" > "+vec[0]);
					System.out.println(vec[1]+" > "+vec[2]);
					System.out.println("esc partit 1: "+esc[1]);
					vec[1]=vec[1]/(esc[1]+1);
				}
				if(vec[2]>vec[1]&&vec[2]>vec[0]){
					esc[2]+=1;
					System.out.println(vec[2]+" > "+vec[1]);
					System.out.println(vec[2]+" > "+vec[0]);
					System.out.println("esc partit 2: "+esc[2]);
					vec[2]=vec[2]/(esc[2]+1);
				}
			}
		
			if(vec2[0]>vec2[1]&&vec[0]>vec[1]){
				esc[0]+=1;
			}
			if(vec2[1]>vec2[2]&&vec[1]>vec[0]){
				esc[1]+=1;
			}
			if(vec2[2]>vec2[1]&&vec[2]>vec[0]){
				esc[2]+=1;
			}
			
		for (j = 0; j < vec.length; j++) {
			System.out.println("Partido "+j+" esc: "+esc[j]+" votos: "+vec2[j]);
		}
	}

}
