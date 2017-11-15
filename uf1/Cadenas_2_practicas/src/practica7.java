
public class practica7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra[]={"rata", "Cosa", "cano"}, aux;
		for(int i=1;i<=palabra.length;i++){
			for(int j=0;j<palabra.length-i;j++){
				if(palabra[j].compareTo(palabra[j+1]) > 0){
					aux=palabra[j];
					palabra[j]=palabra[j+1];
					palabra[j+1]=aux;
				}
			}
		}
		
		for(int j=0;j<palabra.length;j++){
			System.out.print(palabra[j]+" ");
		}
		char letra = 'A';
		int codLetra = letra;
		
		char letra1 = 'a';
		int codLetra1 = letra1;
		
		char letra11 = 'B';
		int codLetra11 = letra11;
		
		char letra111 = 'b';
		int codLetra111 = letra111;
		
		char letra1111 = 'C';
		int codLetra1111 = letra1111;
		
		char letra11111 = 'c';
		int codLetra11111 = letra11111;
		
		System.out.println("\nCodigo de letra mayuscula: "+codLetra);
		System.out.println(  "Codigo de letra minuscula: "+codLetra1);
		System.out.println(  "Codigo de letra mayuscula: "+codLetra11);
		System.out.println(  "Codigo de letra minuscula: "+codLetra111);
		System.out.println(  "Codigo de letra mayuscula: "+codLetra1111);
		System.out.println(	 "Codigo de letra minuscula: "+codLetra11111);
	}

}
