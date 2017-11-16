import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int dentadura[][]=new int[2][16];
		for(int i=0;i<dentadura.length;i++) {
			for(int j=0;j<dentadura[i].length;j++){
				dentadura[i][j]=1;
			}
		}
		
		for(int i=0;i<dentadura.length;i++) {
			for(int j=0;j<dentadura[i].length;j++){
				System.out.print(dentadura[i][j]);
			}
			System.out.println();
		}
		
		for(int i=0;i<dentadura.length;i++) {
			for(int j=0;j<dentadura[i].length;j++){
				System.out.println("El estado del diente "+j+" de la fila"+i);
				if(s.hasNextInt()) {
				dentadura[i][j]=s.nextInt();
					if(dentadura[i][j]==1||dentadura[i][j]==0) {
						
					}else {
						System.out.println("El valor es mayor o menor a 0 y 1");
						j--;
					}
				}else {
					System.out.println("Valor no entero...");
					s.next();
					j--;
				}
			}
		}
		System.out.println("\nEl estado de la dentadura del paciente:\n"
							+"-- ------ -- -- --------- --- ---------");
		for(int i=0;i<dentadura.length;i++) {
			for(int j=0;j<dentadura[i].length;j++){
				System.out.print(dentadura[i][j]);
			}
			System.out.println();
		}
		
	}

}
