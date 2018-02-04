import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercici2 programa = new Exercici2();
		programa.inicio();
	}
	public void inicio(){
		try {
			File archivo = new File ("cotxes.txt");
			File benzina = new File ("benzina.txt");
			PrintStream lapizbenzina = new PrintStream(benzina);
			File diesel = new File ("diesel.txt");
			PrintStream lapizdiesel = new PrintStream(diesel);
			File electrics = new File ("electrics.txt");
			PrintStream lapizelectrics = new PrintStream(electrics);
			try {
				Scanner lector = new Scanner (archivo);
				String marca = " ";
				while (marca.equals("Fi") == false){
					System.out.println("Recopilando datos...");
					marca = lector.next();
					if (marca.equals("Fi")){
						fin();
						break;
					}
					String modelo = lector.next();
					int matrinum = lector.nextInt();
					String matrilet = lector.next();
					double capacidad = lector.nextDouble();
					String motor = lector.next();
					int contador = -1, num=0, periodo=0;
					while (num!=-1){
						contador++;
						num=lector.nextInt();
						if (num>periodo){
							periodo=num;
						}
					}
					System.out.println("Grabando datos...");
					if (motor.equals("BENZINA")){
						lapizbenzina.println(marca+" "+modelo+" "+matrinum+" "+matrilet+" "+capacidad+" "+motor+" num revisions: "+contador+" last:"+periodo);
					}else if (motor.equals("DIESEL")){
						lapizdiesel.println(marca+" "+modelo+" "+matrinum+" "+matrilet+" "+capacidad+" "+motor+" num revisions: "+contador+" last:"+periodo);
					}else if (motor.equals("ELECTRIC")){
						lapizelectrics.println(marca+" "+modelo+" "+matrinum+" "+matrilet+" "+capacidad+" "+motor+" num revisions: "+contador+" last:"+periodo);
					}
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public void fin(){
		System.out.println("Programa finalizado");
	}
}
