import java.util.Scanner;

public class practica3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String frase = "";
		
		System.out.println("introduce una frase: ");
		frase=s.nextLine();
		System.out.println(frase);
		frase=frase.replace('a', 'o');
		System.out.println(frase);
		frase=frase.replace('o', 'i');
		System.out.println(frase);
		frase=frase.replace('i', 'a');
		System.out.println(frase);
		frase=frase.replace('a', 'e');
		System.out.println(frase);
		frase=frase.replace('e', 'u');
		System.out.println(frase);
		frase=frase.replace('u', 'a');
		System.out.println(frase);
		System.out.println(frase);
		frase=frase.replace('a', 'o');
		System.out.println(frase);
		frase=frase.replace('o', 'i');
		System.out.println(frase);
		frase=frase.replace('i', 'a');
		System.out.println(frase);
		frase=frase.replace('a', 'e');
		System.out.println(frase);
		frase=frase.replace('e', 'u');
		System.out.println(frase);
		frase=frase.replace('u', 'a');
		System.out.println(frase);
	}

}
