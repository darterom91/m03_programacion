package ams1_uf3_ficheros_david_artero;

public class ficheros_prueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dirWork = System.getProperty("user.dir");
		System.out.println(dirWork);
		dirWork = "/Escriptori/";
		System.out.println(dirWork);
		System.setProperty("user.dir", dirWork);
	}

}
