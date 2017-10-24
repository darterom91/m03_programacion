package ams1_david_artero_arrays2;

public class Ejercicio3 {
	public static final int vec[]={1,6,4,8,3,7,3,6,9,4,2,9,6};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Ejercicio a
		  
		  Se utiliza una constante de vectores iniciada con todas sus posiciones con valores, dentro del bloque main se inicia la i=1, resultat = 0.
		  Luego se utiliza un while que se accione mientras i!=9 dara vuletas y un if que comprueba el numero anterior con el numero actual.
		  
		  En verdad esta cogiendo el numero 0 del vector en la 1r vuelta y si el numero 0 < 1 se aumenta en resultat = resultat + 1.
		  
		  
		  Resultat =  4
		  */
		int i=1, resultat=0;
		while(vec[i]!=9){
			if(vec[i-1]<vec[i]){
				System.out.println("vec["+(i-1)+"] = "+vec[i-1]+" < vec[+"+i+"+] = "+vec[i]);
				resultat++;
			}
			i++;
		}
		System.out.println("Resultat = "+resultat);
		
		/*Ejercicio b
		  
		  Se utiliza una constante de vectores iniciada con todas sus posiciones con valores, dentro del bloque main se inicia la i=12, resultat = 0,
		  luego se utiliza un while que se accione mientras [i>(vec.length/2)] dara vuletas y un if els en el cual si vec[i]==4 reste 
		  resultat-- y si no resultat++.
		  
		  
		  
		  creo que es un bucle infinito ya que la i no se hace mas pequeña comparado a vec.length/2 
		  
		  seria: 12 > 6 constantemente
		  
		  Para solucionarlo haria falta un i-- en cada vuelta;
		  
		  */
		
		i=vec.length-1; 
		resultat=0;
		
		while(i>vec.length/2){
			if(vec[i]==4){
				resultat++;
			}else{
				resultat--;
			}
			i--;
		}
		System.out.println("resultat = "+resultat);
	}

}
