package Ejercicios;

public class Ejercicio6 {
	public static void main(String[] args) {
		String frase = "Endevina el valor de la paraula del diccionari.";
		int cont;
		int iniciSubcadena = frase.indexOf('v'); 
		int fiSubcadena = frase.lastIndexOf('v'); 
		char letras[] = new char[frase.length()];
		for(int i=0;i<letras.length;i++){
			letras[i]=frase.charAt(i);
		}
		for(int i=0;i<letras.length;i++){
			System.out.print(letras[i]);
		}
		cont=0;
		for(int i=0;i<letras.length;i++){
			if(letras[i]=='v'){
				cont++;
			}
		}
		
		if(cont<1){
			System.out.println("\nNo  hi ha una v");
		}else if(cont==1){
			System.out.println("\nNomés hi ha una v");
		}else{
			System.out.println("\n"+frase.substring(iniciSubcadena+1, fiSubcadena));
			System.out.println("La cantidad de v son: "+cont);
		}
	}
}
