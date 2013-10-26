package futbol;

import java.util.ArrayList;
import java.util.List;

import utilidades.ArchivoGrabacion;
import utilidades.ArchivoLectura;

public class Futbol {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ArchivoLectura archivoEntrada = new ArchivoLectura("futbol.in");
		ArchivoGrabacion archivoSalida = new ArchivoGrabacion("futbol.out");
		FutbolParser parser = new FutbolParser();
		
		List<String> data = new ArrayList<String>();
		
		while (archivoEntrada.hayMasLineas())
			data.add(archivoEntrada.linea().trim());
		
		parser.execute(data);
		List<String> output = parser.getResultsTable();

		archivoSalida.grabarLinea("****************************************");
		archivoSalida.grabarLinea("Pos\tEquipo\t\t\tPts\tPG\tDG\tGF\tGC");
		archivoSalida.grabarLinea("****************************************");
		for (String linea : output) {
			archivoSalida.grabarLinea(linea);
		}
		archivoSalida.cerrar();

	}	
}
