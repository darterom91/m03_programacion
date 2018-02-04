import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Exercici3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercici3 programa = new Exercici3();
		programa.inicio();
	}
	public void inicio(){
		File archivo = new File("reals.bin");
		System.out.println("Leyendo los valores del archivo...");
		leer (archivo);
		System.out.println("Ordenando valores del archivo...");
		ordenar(archivo);
		System.out.println("Mostrando valores del archivo (ahora ordenado)");
		leer (archivo);
	}
	public void leer(File archivo){
		try {
			RandomAccessFile gafas = new RandomAccessFile(archivo, "r");
			long tamaño = gafas.length()/8;
			for (long i=0;i<tamaño;i++){
				System.out.println(gafas.readDouble());
			}
			gafas.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void ordenar(File archivo){
		try {
			RandomAccessFile gafas = new RandomAccessFile(archivo,"r");
			RandomAccessFile lapiz = new RandomAccessFile(archivo,"rw");
			long tamaño = gafas.length()/8;
			while (gafas.getFilePointer()<gafas.length()){
				if (gafas.readDouble()>gafas.readDouble()){
					gafas.skipBytes(-8);
					lapiz.writeDouble(gafas.readDouble());
					gafas.skipBytes(-16);
					lapiz.writeDouble(gafas.readDouble());
				}else{
					gafas.skipBytes(-16);
					lapiz.writeDouble(gafas.readDouble());
					lapiz.writeDouble(gafas.readDouble());
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