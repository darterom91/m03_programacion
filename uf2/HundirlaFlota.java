package ams1_David_Artero_Uf2;

import java.util.Scanner;
public class HundirlaFlota {
    public static void main(String[] args) {
        
    	menuJuego();

}

	public static void menuJuego() {
		// TODO Auto-generated method stub
    	int option = 0;
    	
    	 Player1();
    	
	}
	
	public static int IntroCordFilaCol() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num=0, i=0;
		do {
			if(s.hasNextInt()) {
				num=s.nextInt();
				i++;
			}else {
				System.out.println("El valor no es entero...");
				s.next();
			}
		}while(i<1);
		return num;
	}

	public static void Player1() {
    	// TODO Auto-generated method stub
    	int filaUsuario1, columnaUsuario1, tiraUsuario1Columna=0, tiraUsuario1Fila = 0;
    	boolean ganaUsuario1 = false;
    	System.out.println("VAMOS A JUGAR A HUNDIR LA FLOTA (barcos de un solo punto)");
    	System.out.println();
    	
    	System.out.print("Player 1 Introduce tus coordenadas para colocar tu barco: ");
    	System.out.println("Intro fila: ");
    	filaUsuario1=IntroCordFilaCol();
    	System.out.println("Intro Columna: ");  	
    	columnaUsuario1 = IntroCordFilaCol();
    	
    	Mapa1(filaUsuario1, columnaUsuario1);
    	
    	Player2(filaUsuario1, columnaUsuario1, tiraUsuario1Columna, tiraUsuario1Fila);
    }

    public static void Player2(int filaUsuario1, int columnaUsuario1, int tiraUsuario1Columna, int tiraUsuario1Fila) {
		// TODO Auto-generated method stub
		int filaUsuario2, columnaUsuario2, tiraUsuario2Columna, tiraUsuario2Fila;
		 boolean ganaUsuario2 = false;
		  System.out.print("Player 2 Introduce tus coordenadas para colocar tu barco: ");
	         System.out.println("Intro fila: ");
	         filaUsuario2=IntroCordFilaCol();
	         System.out.println("Intro Columna: ");
	         
	         columnaUsuario2 = IntroCordFilaCol();
	         
	         Mapa2(filaUsuario2, columnaUsuario2);
	         
	         Tirar(filaUsuario1, columnaUsuario1, filaUsuario2, columnaUsuario2);
	}
    
    public static void Mapa1(int filaUsuario1, int columnaUsuario1) {
    	// TODO Auto-generated method stub
    	int[][] vectorMapaUsuario1 = new int[5][5];
    	System.out.println("MAPA DEL USUARIO 1");
    	for (int i = 0; i < vectorMapaUsuario1.length; i++) {
    		System.out.println("");
    		for (int j = 0; j < vectorMapaUsuario1.length; j++) {
    			if (i == columnaUsuario1) {
    				if (j == filaUsuario1) {
    					vectorMapaUsuario1[i][j] = 1;
    				}
    			} else {
    				vectorMapaUsuario1[i][j] = 0;
    			}
    			System.out.print(vectorMapaUsuario1[i][j]);
    		}
    	}
    	System.out.println();
    	
    }
    
	public static void Mapa2(int filaUsuario2, int columnaUsuario2) {
		// TODO Auto-generated method stub
		  //mapa del usuario 2
		int[][] vectorMapaUsuario2 = new int[5][5];
        System.out.println();
        System.out.println("MAPA DEL USUARIO 2");
        for (int i = 0; i < vectorMapaUsuario2.length; i++) {
            System.out.println("");
            for (int j = 0; j < vectorMapaUsuario2.length; j++) {
                if (i == columnaUsuario2) {
                    if (j == filaUsuario2) {
                        vectorMapaUsuario2[i][j] = 1;
                    }
                } else {
                    vectorMapaUsuario2[i][j] = 0;
                }
                System.out.print(vectorMapaUsuario2[i][j]);
            }
        }
        
	}

	public static void Tirar(int filaUsuario1, int columnaUsuario1, int filaUsuario2, int columnaUsuario2) {
		// TODO Auto-generated method stub
		int tiraUsuario1Columna=0, tiraUsuario1Fila=0, tiraUsuario2Columna=0, tiraUsuario2Fila=0;
		boolean ganaUsuario1 = false, ganaUsuario2 = false;
		
		while (ganaUsuario1 == false && ganaUsuario2 == false) {
			System.out.println("");
			System.out.println("Usuario 1 introduce tus coordenadas para el disparo: ");
			tiraUsuario1Fila = IntroCordFilaCol();
			tiraUsuario1Columna =IntroCordFilaCol();
			
			if (tiraUsuario1Columna == columnaUsuario2 && tiraUsuario1Fila == filaUsuario2) {
				ganaUsuario1 = true;
			} else {
				System.out.println("AGUA!");
				System.out.println();
				System.out.println("Usuario 2 introduce tus coordenadas para el disparo: ");
				System.out.println();
				tiraUsuario1Fila = IntroCordFilaCol();
				tiraUsuario1Columna =IntroCordFilaCol();
				if (tiraUsuario2Columna == columnaUsuario1 && tiraUsuario2Fila == filaUsuario1) {
					ganaUsuario2 = true;
				} else {
					System.out.println("");
					System.out.println("AGUA");
				}
			}
		}
		//salida
		if (ganaUsuario1 == true) {
			System.out.println("¡GANA EL USUARIO 1!");
		}
		if (ganaUsuario2 == true) {
			System.out.println("¡GANA EL USUARIO 2!");
		}
		
	}


}
