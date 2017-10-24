package ams1_david_artero_arrays2;

public class Ejercicio4 {
	public static final int vec[]={1,2,3,4,5,6,7,8};
	public static final int vec2[]={10,9,11,12,13,15,14,16};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vec3[]=new int[vec.length+vec2.length];
		int i = 0, aux=(vec3.length/2);
		
		while(i<aux){
			if(i%2==0){
				vec3[i]=vec[i];
				System.out.println("par");
			}else{
				vec3[i-1]=vec[i];
				System.out.println("inpar");
			}
			i++;
		}
		
		for(i=0;i<vec3.length;i++){
			System.out.print("["+vec3[i]+"] ");	
		}
	}

}
