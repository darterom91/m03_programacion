import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercici1 programa = new Exercici1();
		programa.inicio();
	}
		public void inicio(){
			File archivo = new File ("Ex1.txt");
			try {
				System.out.print("Valores originales: ");
				Scanner lector = new Scanner (archivo);
				int [] valores = new int[10];
				for (int i=0;i<10;i++){
					valores[i]=lector.nextInt();
				}
				lector.close();
				System.out.println(Arrays.toString(valores));
				System.out.println("Modificando valores en posicion par...");
				PrintStream lapiz = new PrintStream(archivo);
				for (int i=1;i<11;i++){
					if (i%2==0){
						lapiz.print(valores[i-1]+5+" ");
					}else{
						lapiz.print(valores[i-1]+" ");
					}
				}
				System.out.println("Valores par modificados");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
