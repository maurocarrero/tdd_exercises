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
public class ArchivoGrabacion {

	String nombre;
    String linea;
    BufferedWriter out;

  public ArchivoGrabacion(String unNombre)  {
    try {
        out = new BufferedWriter(new FileWriter(unNombre));
    }
    catch (IOException e) {
      System.out.println("no se puede crear");}  // luego se sustituirá por excepciones
  }

  public boolean  grabarLinea(String linea) {
    boolean ok = true;
    try {
        out.write(linea);
        out.newLine();}
    catch (IOException e) {
      System.out.println("error");
      ok = false;
    }
    return ok;
  }

  public boolean cerrar() {
    boolean ok = true;
    try {
      out.close(); }
    catch (Exception e){
      System.out.println("error");
      ok = false;
    }
    return ok;
  }


}
