package text;

import java.io.*;

public class EscribeFichero
{
    public static void main(String[] args)
    {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            //fichero = new FileWriter("prueba.txt");
            fichero = new FileWriter("prueba.txt",true);
            pw = new PrintWriter(fichero);

            for (int i = 10; i < 20; i++)
                pw.println("Linea " + i);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
}