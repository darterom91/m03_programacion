
public class Ejercicio10 {
	public static int N = 8;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char mat[][] = new char[N][8];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (i % 2 != 0) {
					if (j % 2 != 0) {
						mat[i][j] = 'B';
					} else {
						mat[i][j] = 'N';
					}
				}else{
					if (j % 2 != 0) {
						mat[i][j] = 'N';
					} else {
						mat[i][j] = 'B';
					}
				}
			}
		}

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("[" + mat[i][j] + "] ");
			}
			System.out.println("\n");
		}
	}

}
