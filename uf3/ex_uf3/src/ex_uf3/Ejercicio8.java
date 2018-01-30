package ex_uf3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File temp =new File("clientes.txt");
		PrintStream ps = new PrintStream(temp);
		Scanner s = new Scanner(System.in);
		int i=0;
		String[] personas=new String[10];
		String res="";		
		boolean bol = false;
		
		do{
			System.out.println("introduce la persona: "+i+" :");
			personas[i]=introPersonas(i);
			System.out.println("Quieres seguir? ");
			res=s.next();
			i++;
			if(res.equals("no")){
				bol=true;
			}
			if(i==personas.length){
				bol=true;
			}
		}while(bol!=true);
		
		introDisco(personas, i);
	}

	private static void introDisco(String[] personas, int num) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File temp=null;
		String fixe="";
		Scanner s = new Scanner(System.in);
		
		System.out.println("introduce el nombre del fichero");
		fixe=s.next();
		
		temp=new File(fixe);
		PrintStream ps = new PrintStream(temp);
		
		for(int i=0;i<num;i++){
			ps.println(personas[i]);
		}
		ps.println("fi");
	}

	public static String introPersonas(int i) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String persona="", nom="", cognom="";
		int nif=0, edad=0;
		double altura=0;
		
		System.out.print("introduce el nombre: ");
		nom=s.next();
		System.out.print("Introduce el apellido: ");
		cognom=s.next();
		System.out.print("Introduce el nif: ");
		nif=introInt();
		System.out.print("Introduce el edad: ");
		edad=introInt();
		System.out.print("Introduce el altura: ");
		altura=introDouble();
		
		persona=nom+":"+cognom+":"+nif+":"+edad+":"+altura;
		
		return persona;
	}

	private static double introDouble() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		double val = 0;
		boolean bol=false;
		
		do{
			if(s.hasNextDouble()){
				val=s.nextDouble();
				bol=true;
			}else{
				System.out.println("No es un valor real..");
				s.next();
			}
		}while(bol!=true);
		
		return val;
	}

	public static int introInt() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int valor=0;
		boolean bol = false;
		do{
			if(s.hasNextInt()){
				valor=s.nextInt();
				bol=true;
			}else{
				System.out.println("el valor no es entero...");
				s.next();
			}
		}while(bol!=true);
		
		return valor;
	}

}
