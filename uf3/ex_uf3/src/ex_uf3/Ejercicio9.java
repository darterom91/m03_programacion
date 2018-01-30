package ex_uf3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File temp =new File("personas.txt");
		FileReader fr;
		try {
			fr = new FileReader(temp);
			BufferedReader br = new BufferedReader(fr);
			String lista="";
			String pers[] = new String[10];
			int cont=0;
			while((lista=br.readLine())!=null){
				if(!lista.equals("fi")){
					pers[cont]=lista;
					cont++;
				}
			}
			
			for(int i=0;i<cont;i++){
				if(pers[i].contains(":18:")){
				System.out.println(pers[i]);
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
