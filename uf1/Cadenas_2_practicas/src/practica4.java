import java.util.Scanner;

public class practica4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String frase="", frase2=" ", frase3="";
		
		System.out.println("Introduce la frase 1");
		frase=s.nextLine();
		
		System.out.println("Introduce la frase 2");
		frase2=s.nextLine();
		System.out.println("frase: "+frase);
		
		frase+=" "+frase2;
		frase3+=frase;
	
		System.out.println("frase2: "+frase2);
		System.out.println("frase3: "+frase3);
	}
}
