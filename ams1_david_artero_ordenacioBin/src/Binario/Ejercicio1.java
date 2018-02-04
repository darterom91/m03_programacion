package Binario;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vec[] = { 10, 25, 31, 46, 52, 63, 71, 84, 91, 92 };
		int inf = 0, sup = vec.length, med = 0, valor = 84;
		boolean trobat = false;
		// Se utiliz el bucle para poder cambiar el valor de 84 a 1
		// Es la busqueda binaria
		while ((inf <= sup) && !trobat) {
			med = (sup + inf) / 2;
			if (vec[med] == valor) {
				trobat = true;
			}
			if (valor < vec[med]) {
				sup = med - 1;
			} else {
				inf = med + 1;
			}
		}
		if (trobat) {
			System.out.println(+valor + " se ha encontrado");
		} else {
			System.out.println(+valor + " no se ha encontrado");
		}
		
		inf = 0; 
		sup = vec.length;
		med = 0;
		valor = 1;
		trobat=false;
		while ((inf <= sup) && !trobat) {
			med = (sup + inf) / 2;
			if (vec[med] == valor) {
				trobat = true;
			}
			if (valor < vec[med]) {
				sup = med - 1;
			} else {
				inf = med + 1;
			}
		}
		if (trobat) {
			System.out.println(+valor + " se ha encontrado");
		} else {
			System.out.println(+valor + " no se ha encontrado");
		}
	}

}
