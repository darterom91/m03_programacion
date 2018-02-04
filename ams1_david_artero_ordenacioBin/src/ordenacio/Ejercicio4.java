package ordenacio;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0, aux;
		System.out.println("El valor es: "+num);
		int[] vecA={1,2,3,4,5,6,7,8,9,10}; 
		int[] vecB={15,16,17,18,19,0,11,12,13,14};
		num=vecA.length + vecB.length;
		int vecT[]=new int[num];
		
		System.out.println("\n\nEl long de vecT: "+num);
		//muestra de los vecA y B, y tambien la asignaciona a cada posicion del vecT
		
		System.out.println("Vector A:");
		for(int i=0;i<vecA.length;i++){
			System.out.println("linea "+i+ "["+vecA[i]+"]");
			vecT[i]=vecA[i];
		}
		
		System.out.println("\n\nVector B:");
		for(int i=0;i<vecA.length;i++){
			System.out.println("linea "+i+ "["+vecB[i]+"]");
			vecT[i+10]=vecB[i];
		}
		
		for(int i=0;i<vecT.length-1;i++){
			for(int j=i+1;j<vecT.length;j++){
				if(vecT[i]>vecT[j]){
					aux=vecT[i];
					vecT[i]=vecT[j];
					vecT[j]=aux;
				}
			}
		}
		System.out.println("\n\nVector 20:");
		for(int i=0;i<vecT.length;i++){
			System.out.println("linea "+i+ "["+vecT[i]+"]");
		}
	}

}
