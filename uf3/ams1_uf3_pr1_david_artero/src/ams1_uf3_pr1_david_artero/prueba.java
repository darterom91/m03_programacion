package ams1_uf3_pr1_david_artero;

import java.io.File;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prueba prog = new prueba();
		prueba.inicio();
	}

	public static void inicio() {
		// TODO Auto-generated method stub
		String nomDir = System.getProperty("user.dir");
		File[] files;
		File dir = new File(nomDir);
		
		files=dir.listFiles();
		
		for(int i=0; i<files.length;i++){
			if(files[i].isDirectory()){
			System.out.println("DIR "+files[i].getName());
			}else{
				System.out.println("FILE "+files[i].getName());
			}
		}
	}

}
