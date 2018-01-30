package ex_uf3;

import java.io.File;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File temp = new File("pollo");
		if(temp.exists()){
			temp.delete();
			System.out.println(temp.getAbsolutePath()+":  BORRADA");
		}else{
			temp.mkdir();
			System.out.println(temp.getAbsolutePath()+":  CREADA");
		}
	}

}
