package hedonia;

import org.apache.commons.lang3.StringUtils;

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
		
		archivoSalida.grabarLinea("************************************************************");
		archivoSalida.grabarLinea("Linea\t" + StringUtils.rightPad("Entrada", 40) + "Salida");
		archivoSalida.grabarLinea("************************************************************");
		
		int nroLinea = 0;
		while (archivoEntrada.hayMasLineas())
		{
			nroLinea++;
			String linea = archivoEntrada.linea();
			String retorno = "";
			
			if (parser.checkLine(linea))
				retorno = "YES";
			else
				retorno = "NO";
			archivoSalida.grabarLinea(nroLinea + "\t\t" + StringUtils.rightPad(linea, 40) + retorno);
		}
		
		archivoSalida.grabarLinea("************************************************************");
		archivoSalida.cerrar();

	}	
}
