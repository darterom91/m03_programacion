
public class Ejercicio7 {
	public static int N = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vec[]=new int[N], i=0,j=0;
		while(j<vec.length){
			vec[j]=(int) Math.floor(Math.random()*(20-1)+1);
			j++;
		}
		i=0;
		while(i<2){
			j=0;
			while(j<vec.length){
				System.out.print("["+vec[j]+"] ");
				j++;
			}
			i++;
		}
	}

}
