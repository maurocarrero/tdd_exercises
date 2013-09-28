package tdd_exercises.hedonia;

import utilidades.ArchivoLectura;

public class Hedonia {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ArchivoLectura archivo = new ArchivoLectura("hedonia.in");
		HedoniaParser parser = new HedoniaParser();
		
		System.out.println("****************************************");
		System.out.println("Linea\tEntrada\t\tSalida");
		System.out.println("****************************************");
		
		int nroLinea = 0;
		while (archivo.hayMasLineas())
		{
			nroLinea++;
			String linea = archivo.linea();
			
			System.out.println(nroLinea + "\t");
			System.out.println(linea + "\t\t");
			
			if (parser.checkSentence(linea))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		
		System.out.println("****************************************");

	}	
}
