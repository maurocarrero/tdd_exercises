package hedonia;

import utilidades.ArchivoGrabacion;
import utilidades.ArchivoLectura;

public class Hedonia {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ArchivoLectura archivoEntrada = new ArchivoLectura("hedonia.in");
		ArchivoGrabacion archivoSalida = new ArchivoGrabacion("hedonia.out");
		HedoniaParser parser = new HedoniaParser();
		
		archivoSalida.grabarLinea("****************************************");
		archivoSalida.grabarLinea("Linea\tEntrada\t\tSalida");
		archivoSalida.grabarLinea("****************************************");
		
		int nroLinea = 0;
		while (archivoEntrada.hayMasLineas())
		{
			nroLinea++;
			String linea = archivoEntrada.linea();
			String retorno = "";
			
			if (parser.checkSentence(linea))
				retorno = "YES";
			else
				retorno = "NO";
			
			archivoSalida.grabarLinea(nroLinea + "\t\t" + linea + "\t\t\t" + retorno);
		}
		
		archivoSalida.grabarLinea("****************************************");
		archivoSalida.cerrar();

	}	
}
