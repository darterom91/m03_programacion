package ordenacio;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Se incializan las posiciones del vector y se les da sus valores por defecto. 
		int vector[]= {89,7,73,100,49,25,1,87,12}, aux; //Se crea la var aux para hacer el intercambio de numeros y posiciones
		//Va posicion en posicion desde -1, se detiene en cada posicion 
		for(int i=0;i<vector.length-1;i++) {
			//en cada vuelta compara mira todas las posiciones del vector
			for(int j=i+1;j<vector.length;j++) {
				//mira si el valor de la i que es el valor que no cambia es es mayor al de su lado, 
				//hasta el final de las vueltas
				if(vector[i]>vector[j]) {
					//Se hace el intercambio de posiciones
					aux=vector[i];
					vector[i]=vector[j];
					vector[j]=aux;
				}
			}
		}
		
		//muestra todos los valores del vector.
		for(int j=0;j<vector.length;j++) {
			System.out.println("Linea: "+j+" ["+vector[j]+"]");
		}

	}

}
