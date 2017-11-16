package Ejercicios;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase ="havia una vez un chico con canas";
		String palabras[]=frase.split(" ");
		
		for(int i=0;i<palabras.length;i++){
			if(i%2!=0){
				System.out.println(palabras[i]);
			}
		}
	}

}
