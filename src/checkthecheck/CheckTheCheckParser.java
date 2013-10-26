package checkthecheck;

import java.util.ArrayList;
import java.util.List;

public class CheckTheCheckParser
{
	private final char[] _piezasChar = {'p', 'n', 'b', 'r', 'q', 'k', '.'}; 
	private List<Tablero> _tableros;
	
	public CheckTheCheckParser() {
		this._tableros = new ArrayList<Tablero>();
	}
	
	public List<Tablero> getTableros() {
		return this._tableros;
	}
	
	public List<String> parse(List<String> data) {
		
		List<String> results = new ArrayList<String>();
		construirTableros(data);
		int cont = 1;
		for (Tablero tablero : this._tableros) {
			results.add("#" + cont + ": " + check(tablero));
			cont++;
		}
		return results;
	}

	public String check(Tablero tablero) {
		if (tablero.reyEnJaque(EnumBando.negro))
			return "Rey negro en jaque.";
		if (tablero.reyEnJaque(EnumBando.blanco))
			return "Rey blanco en jaque";
		return "Ningún rey está en jaque";
	}

	public void construirTableros(List<String> data)
	{
		String[] tablero = new String[8];
		int cont = 0;
		for (String linea : data) {
			if (cont < 8 && linea.length() > 0)
				tablero[cont++] = linea;
			if (cont == 8) {
				this._tableros.add(construirTablero(tablero));
				cont = 0;
			}
		}	
	}
	
	public Tablero construirTablero(String[] tablero) {
		
		Pieza[][] tableroMatriz = new Pieza[8][8];
		int indexLinea = 0;
		String linea = "";
		Pieza pieza;
		
		for (int x=0; x < 8; x++) {
			linea = tablero[indexLinea++];
			for (int y=0; y < 8; y++) {
				char piezaChar = linea.charAt(y);
				if (isAdmittedChar(piezaChar)) {
					pieza = construirPieza(piezaChar, x, y);
					tableroMatriz[x][y] = pieza;
				}
			}
		}
		
		Tablero tableroObj = new Tablero(tableroMatriz);	
		return tableroObj;
	}
	
	public Pieza construirPieza(char piezaChar, int x, int y) {
		
		if (piezaChar == 'p')
			return new Pawn(EnumBando.negro, x, y);
		if (piezaChar == 'n')
			return new Knight(EnumBando.negro, x, y);
		if (piezaChar == 'b')
			return new Bishop(EnumBando.negro, x, y);
		if (piezaChar == 'r')
			return new Rook(EnumBando.negro, x, y);
		if (piezaChar == 'q')
			return new Queen(EnumBando.negro, x, y);
		if (piezaChar == 'k')
			return new King(EnumBando.negro, x, y);
		
		if (piezaChar == 'P')
			return new Pawn(EnumBando.blanco, x, y);
		if (piezaChar == 'N')
			return new Knight(EnumBando.blanco, x, y);
		if (piezaChar == 'B')
			return new Bishop(EnumBando.blanco, x, y);
		if (piezaChar == 'R')
			return new Rook(EnumBando.blanco, x, y);
		if (piezaChar == 'Q')
			return new Queen(EnumBando.blanco, x, y);
		if (piezaChar == 'K')
			return new King(EnumBando.blanco, x, y);
		
		return null;
	}

	public boolean isAdmittedChar(char caracter)
	{
		for (int i=0; i < this._piezasChar.length; i++) {
			char casilla = this._piezasChar[i];
			if (Character.toUpperCase(casilla) == caracter || Character.toLowerCase(casilla) == caracter)
				return true;
		}
		return false;
	}
}
