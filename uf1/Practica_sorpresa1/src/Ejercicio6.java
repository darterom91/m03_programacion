
public class Ejercicio6 {
	public static int N = 5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vec[]=new int[N], res=0;
		double media=0;
		for(int i=0;i<vec.length;i++){
			vec[i]=(int) Math.floor(Math.random()*(20-1)+1);
			System.out.print(res+" + "+vec[i]+"= ");
			res = res+vec[i];
			System.out.print(res+"\n");
		}
		media=(double)res/vec.length;
		System.out.println("El resultado es: "+res);
		System.out.println("La media es: "+media);
		
	}

}
