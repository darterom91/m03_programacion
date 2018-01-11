package ams1_uf3_pr1_david_artero;

import java.io.File;

public class Ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio_1 prog = new Ejercicio_1();
		prog.inicio();
	}

	public void inicio() {
		// TODO Auto-generated method stub
		String respuesta;
		File fixer = new File("temp");
		boolean crearCarpeta = fixer.mkdir();	
		
		System.out.println("Creado el directorio "+fixer.getAbsolutePath()+" ? "+crearCarpeta);
		
		if(!crearCarpeta){
			boolean carpDel = fixer.delete();
			System.out.println("Fue borrada la carpeta "+fixer.getAbsolutePath()+"? "+carpDel);
		}else{
			System.out.println("No se ha borrado la carpeta ya que se acaba de crear "+fixer.getName());
		}
		
	}

}
