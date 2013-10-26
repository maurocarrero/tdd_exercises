package checkthecheck;

import java.util.ArrayList;
import java.util.List;

import utilidades.ArchivoGrabacion;
import utilidades.ArchivoLectura;

public class CheckTheCheck
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ArchivoLectura archivoEntrada = new ArchivoLectura("checkthecheck.in");
		ArchivoGrabacion archivoSalida = new ArchivoGrabacion("checkthecheck.out");
		CheckTheCheckParser parser = new CheckTheCheckParser();
		
		List<String> data = new ArrayList<String>();
		
		while (archivoEntrada.hayMasLineas())
			data.add(archivoEntrada.linea().trim());

		List<String> respuesta = parser.parse(data);
		
		for (String linea : respuesta) {
			archivoSalida.grabarLinea(linea);
		}
		archivoSalida.cerrar();

	}	
}
