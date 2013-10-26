package futbol;

@SuppressWarnings("serial")
public class CantidadPartidosException extends Exception
{
	public CantidadPartidosException() {
        super("La cantidad de partidos no coinciden");
    }
}
