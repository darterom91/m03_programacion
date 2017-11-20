package Ejercicio_random2;

public class Examen_rand {
	public static int N = 6;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ej[]=new int[N], option=0;
		String Preguntas[]=new String[ej.length];
		
		for(int i = 0 ; i<ej.length;i++) {
			option=(int) Math.floor(Math.random()*(6-1)+1);
			switch(option) {
			case 1:
				ej[0]=(int) Math.floor(Math.random()*(5-1)+1);
				Preguntas[i]= "Practica"+option+" Ej ["+ej[0]+"]" ;
				break;
			case 2:
				ej[1]=(int) Math.floor(Math.random()*(6-1)+1);
				Preguntas[i]= "Practica"+option+" Ej ["+ej[1]+"]" ;
				break;
			case 3:
				ej[2]=(int) Math.floor(Math.random()*(3-1)+1);
				Preguntas[i]= "Practica"+option+" Ej ["+ej[2]+"]" ;
				break;
			case 4:
				ej[3]= 1;
				Preguntas[i]= "Practica"+option+" Ej ["+ej[3]+"]" ;
				break;
			case 5:
				ej[4]=(int) Math.floor(Math.random()*(8-1)+1);
				Preguntas[i]= "Practica"+option+" Ej ["+ej[4]+"]" ;
				break;
			case 6:
				ej[5]=(int) Math.floor(Math.random()*(4-1)+1);
				Preguntas[i]= "Practica"+option+" Ej ["+ej[5]+"]" ;
				break;
			}
		}
		
		for(int i=0;i<Preguntas.length;i++){
			System.out.println(Preguntas[i]+ " Pregunta examen: "+(i+1));
		}
	}

}
