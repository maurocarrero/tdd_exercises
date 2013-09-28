/*
 * Created on 03-nov-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package utilidades;
import java.io.*;

/**
 * @author Santi
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ArchivoLectura {

	String nombre;
    String linea= "";
    BufferedReader in;

  public ArchivoLectura(String unNombre)  {
    try {
        in = new BufferedReader(new FileReader(unNombre));
    }
    catch (FileNotFoundException e) {
      System.out.println("no esta");}
  }

  public boolean hayMasLineas() {
    try {
        linea = in.readLine();}
    catch (IOException e) {
        linea = null;
    }
    return (linea !=null);
  }

  public String linea() {
    return linea;
  }

  public void cerrar() {
    try {
      in.close(); }
    catch (Exception e){
      System.out.println("error close ");   // luego se sustituirá por excepciones
    }
  }
}


