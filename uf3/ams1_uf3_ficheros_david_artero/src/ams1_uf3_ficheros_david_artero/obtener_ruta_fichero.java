package ams1_uf3_ficheros_david_artero;
import java.io.File;

public class obtener_ruta_fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		obtener_ruta_fichero programa = new obtener_ruta_fichero();
		programa.inici();
	}

	public void inici() {
		// TODO Auto-generated method stub
		File carpetaAbsoluta = new File("/home/info.web/ams1-24/eclipse-workspace/ams1_uf3_ficheros_david_artero");
		File fixer = new File("/home/info.web/ams1-24/eclipse-workspace/src/exemples.java");
		
		File carpetaRel = new File("src");
		File fixer2 = new File("src/exemples.java");
		mostrarRutas(carpetaAbsoluta);
		mostrarRutas(fixer);
		mostrarRutas(carpetaRel);
		mostrarRutas(fixer2);
	}
	public void mostrarRutas(File f){
		System.out.println("La ruta es "+f.getAbsolutePath());
		System.out.println("Mi padre es: "+f.getParent());
		System.out.println("Mi nombre es: "+f.getName());
	}
}
