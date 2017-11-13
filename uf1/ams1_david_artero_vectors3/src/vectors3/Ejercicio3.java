package vectors3;

import java.util.Scanner;

public class Ejercicio3 {
	public static final int V = 3;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int votos[]=new int[V], i=0, j=0;
		int esc[]=new int[votos.length];
		int votosAux[]=new int[votos.length];
		
		while(i<3){
			do{
				System.out.println("Introduce los votos del partido "+i);
				if(s.hasNextInt()){
					votos[i]=s.nextInt();
					if(votos[i]>9){
						j++;	
					}
				}else{
					System.out.println("El valor no es entero...");
					s.next();
				}
			}while(j<1);
			i++;
		}
		
		for(i=0;i<votos.length-1;i++){
			for(j=i+1;j<votos.length;j++){
				if(votos[i]!=votos[j]){
					
				}else{
					System.out.println("Partido "+i+": "+votos[i]+" = partido "+j+": "+votos[j]);
					System.out.println("Introduce otro numero de votos: ");
					if(s.hasNextInt()){
						votos[j]=s.nextInt();
						if(votos[i]==votos[j]){
							if(votos[i]<10){
								System.out.println("Valor menor a 10");
								j--;
							}
							j--;
						}else{
						}
					}else{
						System.out.println("Valor no entero...");
						s.next();
					}
				}
			}
		}
		
		for(i=0;i<votos.length;i++){
			votosAux[i]=votos[i];
		}
		
		
		for(i=0;i<7;i++){
			if(votos[0]>votos[1] && votos[0]>votos[2]){
				System.out.println("\nEl partido 1");	
				System.out.println("votos "+votos[0]+" escaños: "+esc[0]);
				votos[0]=votos[0]/((esc.length-1) + 1);
				esc[0]+=1;
				System.out.println("votos "+votos[0]+" escaños: "+esc[0]);
			} 
			
			if(votos[1]>votos[2] && votos[1]>votos[0]){
				System.out.println("\nEl partido 2");
				System.out.println("votos "+votos[1]+" escaños: "+esc[1]);
				votos[1]=votos[1]/((esc.length-1) + 1);
				esc[1]+=1;
				System.out.println("votos "+votos[1]+" escaños: "+esc[1]);
			}
			
			if(votos[2]>votos[0] && votos[2]>votos[1]){
				System.out.println("\nEl partido 3");
				System.out.println("votos "+votos[2]+" escaños: "+esc[2]);
				votos[2]=votos[2]/((esc.length-1) + 1);		
				esc[2]+=1;
				System.out.println("votos "+votos[2]+" escaños: "+esc[2]);
			}
			
			else if(votos[0]==votos[1]||votos[0]==votos[2]||votos[1]==votos[2]){
				System.out.println(":::::::Numeros iguales::::::");
				if(votosAux[0]>votosAux[1] && votosAux[0]>votosAux[2]){
					System.out.println("\nEl partido 1");
					System.out.println("votos "+votos[0]+" escaños: "+esc[0]);
					votos[0]=votos[0]/((esc.length-1) + 1);
					esc[0]+=1;
					System.out.println("votos "+votos[0]+" escaños: "+esc[0]);
				}
				
				if(votosAux[1]>votosAux[2] && votosAux[1]>votosAux[0]){
					System.out.println("\nEl partido 2");
					System.out.println("votos "+votos[1]+" escaños: "+esc[1]);
					votos[1]=votos[1]/((esc.length-1)+ 1);
					esc[1]+=1;
					System.out.println("votos "+votos[1]+" escaños: "+esc[1]);
				}
				
				if(votosAux[2]>votosAux[1] && votosAux[2]>votosAux[0]){
					System.out.println("\nEl partido 3");
					System.out.println("votos "+votos[2]+" escaños: "+esc[2]);
					votos[2]=votos[2]/((esc.length-1) + 1);
					esc[2]+=1;
					System.out.println("votos "+votos[2]+" escaños: "+esc[2]);
				}
			}
		}
		
		for(i=0;i<votos.length;i++){
			System.out.println("partido "+(i+1)+": votos "+votosAux[i]+" escaños: "+esc[i]);
		}
	}
}
