package ams1_david_artero_estructures_repetitives;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bacterias=1, horas = 0, minutos = 0;
		
		//bucle
		while(bacterias<10000000) {
			minutos = minutos + 3;
			bacterias = bacterias * 2;
		}
		
		//numero de bacterias y minutos totales
		System.out.println("Numero de Bacterias: "+bacterias);
		System.out.println("Numero de Minutos: "+minutos);
		
		horas=minutos/60;
		minutos=minutos-60;
		
		//resultado
		System.out.println("\n========= RESULTADO ========");
		System.out.println("| Numero de horas: "+horas+"       |");
		System.out.println("| Numero de Minutos: "+minutos+"    |");
		System.out.println("============================");	
	}

}
