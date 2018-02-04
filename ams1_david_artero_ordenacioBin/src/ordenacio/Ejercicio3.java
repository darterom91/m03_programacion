package ordenacio;

public class Ejercicio3 {
	public static void main(String[] args) {
		int vecT[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,0}, num=0, aux;
		num=vecT.length/2;
		System.out.println("El valor es: "+num);
		int[] vecA=new int[num]; 
		int[] vecB=new int[num];
		
		for(int i=0;i<vecT.length-1;i++) {
			System.out.println("i: "+i);
			for(int j=i+1;j<vecT.length;j++) {
				System.out.println("j: "+j);
				if(vecT[i]>vecT[j]) {
					aux=vecT[i];
					vecT[i]=vecT[j];
					vecT[j]=aux;
				}
			}	
		}
		System.out.println("Vector de 20 Pos:");
		//Mostrando el vector de 20 pos
		for(int j=0;j<vecT.length;j++) {
			System.out.println("linea: "+j+" ["+vecT[j]+"]");
		}
		
		//asignando los valores a cada psicion del vector
		for(int i=0;i<vecA.length;i++) {
			vecA[i]=vecT[i];
		}
		
		for(int i=0;i<vecA.length;i++) {
			vecB[i]=vecT[i+10];
		}
		
		//Mostrando vectores
		System.out.println("\n\nVector A:\n");
		for(int j=0;j<vecA.length;j++) {
			System.out.println("linea: "+j+" ["+vecA[j]+"]");
		}	
		
		System.out.println("\n\nVector B:\n");
		for(int j=0;j<vecB.length;j++) {
			System.out.println("linea: "+j+" ["+vecB[j]+"]");
		}	
	}
}