package checkthecheck.tests;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import checkthecheck.Bishop;
import checkthecheck.CheckTheCheckParser;
import checkthecheck.EnumBando;
import checkthecheck.King;
import checkthecheck.Pawn;
import checkthecheck.Pieza;
import checkthecheck.Rook;
import checkthecheck.Tablero;

public class CheckTheCheckParserTest
{
	private List<String> _data;
	private String[] _tablero;
	private Pieza[][] _tableroMatriz;
	
	@Before
	public void setUp() {
		this._data = new ArrayList<String>();
		// 0
		this._data.add("..k.....");
		this._data.add("ppp.pppp");
		this._data.add("........");
		this._data.add(".R...B..");
		this._data.add("........");
		this._data.add("........");
		this._data.add("PPPPPPPP");
		this._data.add("K.......");
		this._data.add("");
		// 1
		this._data.add("rnbqkbnr");
		this._data.add("pppppppp");
		this._data.add("........");
		this._data.add("........");
		this._data.add("........");
		this._data.add("........");
		this._data.add("PPPPPPPP");
		this._data.add("RNBQKBNR");
		this._data.add("");
		// 2
		this._data.add("rnbqk.nr");
		this._data.add("ppp..ppp");
		this._data.add("....p...");
		this._data.add("...p....");
		this._data.add(".bPP....");
		this._data.add(".....N..");
		this._data.add("PP..PPPP");
		this._data.add("RNBQKB.R");
		this._data.add("");
		// 3
		this._data.add("r.....k.");
		this._data.add(".pp.pppp");
		this._data.add("........");
		this._data.add(".R...B..");
		this._data.add("........");
		this._data.add("........");
		this._data.add(".PPPPPPP");
		this._data.add("K.......");
		this._data.add("");
		// 4
		this._data.add("......k.");
		this._data.add(".pp.pppp");
		this._data.add("........");
		this._data.add(".R...B..");
		this._data.add("........");
		this._data.add(".n......");
		this._data.add("PPPPPPPP");
		this._data.add("K.......");
		this._data.add("");
		// 5
		this._data.add("......k.");
		this._data.add(".pp.pppp");
		this._data.add(".......N");
		this._data.add(".R...B..");
		this._data.add("........");
		this._data.add("........");
		this._data.add("PPPPPPPP");
		this._data.add("K.......");
		this._data.add("");
		// 6
		this._data.add("......k.");
		this._data.add(".pp.pppp");
		this._data.add(".......N");
		this._data.add(".R...B..");
		this._data.add("........");
		this._data.add("........");
		this._data.add("PPPPPPPP");
		this._data.add("K.......");
		this._data.add("");
		// 7
		this._data.add("......k.");
		this._data.add(".pp.pppp");
		this._data.add("........");
		this._data.add("........");
		this._data.add("........");
		this._data.add("........");
		this._data.add(".pPPPPPP");
		this._data.add("K.......");
		this._data.add("");
		// 8
		this._data.add("........");
		this._data.add(".pp.pppp");
		this._data.add("....k...");
		this._data.add(".....P..");
		this._data.add("........");
		this._data.add(".....K..");
		this._data.add(".pPPPPPP");
		this._data.add("........");

		this._tablero = new String[8];
		this._tablero[0] = "..k.....";
		this._tablero[1] = "ppp.pppp";
		this._tablero[2] = "........";
		this._tablero[3] = ".R...B..";
		this._tablero[4] = "........";
		this._tablero[5] = "........";
		this._tablero[6] = "PPPPPPPP";
		this._tablero[7] = "K.......";

		this._tableroMatriz = new Pieza[8][8];
		
		// ..k.....
		this._tableroMatriz[0][2] = new King(EnumBando.blanco, 0, 2);
		
		// ppp.pppp
		for (int i=0; i < 8; i++)
			this._tableroMatriz[1][i] = new Pawn(EnumBando.blanco, 1, i);
		this._tableroMatriz[1][3] = null;
		
		// ........ - Línea vacía, no hago nada.
		
		// .R...B..
		this._tableroMatriz[3][1] = new Rook(EnumBando.negro, 3, 1);
		this._tableroMatriz[3][5] = new Bishop(EnumBando.negro, 3, 5);
		
		// Líneas vacías
		
		// PPPPPPPP
		for (int i=0; i < 8; i++)
			this._tableroMatriz[6][i] = new Pawn(EnumBando.negro, 6, i);
		
		// K.......
		this._tableroMatriz[7][0] = new King(EnumBando.negro, 7, 0);
	}
	
	@Test
	public void construirTablerosTest() {
		CheckTheCheckParser parser = new CheckTheCheckParser();
		parser.construirTableros(this._data);
		Assert.assertNotNull(parser.getTableros());
	}
	
	@Test
	public void construirTableroTest() {
		CheckTheCheckParser parser = new CheckTheCheckParser();
		Tablero tablero = parser.construirTablero(this._tablero);
		Assert.assertNotNull(tablero);
	}
	
	@Test
	public void construirPiezaTest() {
		CheckTheCheckParser parser = new CheckTheCheckParser();
		
		Assert.assertNotNull(parser.construirPieza('p', 0, 7));
		Assert.assertNotNull(parser.construirPieza('n', 3, 5));
		Assert.assertNotNull(parser.construirPieza('B', 5, 1));
		Assert.assertNotNull(parser.construirPieza('r', 0, 1));
		
		Assert.assertNull(parser.construirPieza('.', 0, 0));
	}
	
	@Test
	public void isAdmittedCharTest() {
		CheckTheCheckParser parser = new CheckTheCheckParser();
		
		Assert.assertTrue(parser.isAdmittedChar('p'));
		Assert.assertTrue(parser.isAdmittedChar('n'));
		Assert.assertTrue(parser.isAdmittedChar('b'));
		Assert.assertTrue(parser.isAdmittedChar('r'));
		Assert.assertTrue(parser.isAdmittedChar('q'));
		Assert.assertTrue(parser.isAdmittedChar('k'));
		Assert.assertTrue(parser.isAdmittedChar('P'));
		Assert.assertTrue(parser.isAdmittedChar('N'));
		Assert.assertTrue(parser.isAdmittedChar('B'));
		Assert.assertTrue(parser.isAdmittedChar('R'));
		Assert.assertTrue(parser.isAdmittedChar('Q'));
		Assert.assertTrue(parser.isAdmittedChar('K'));
		Assert.assertTrue(parser.isAdmittedChar('.'));
		
		Assert.assertFalse(parser.isAdmittedChar('a'));
		Assert.assertFalse(parser.isAdmittedChar('z'));
		Assert.assertFalse(parser.isAdmittedChar('#'));
		Assert.assertFalse(parser.isAdmittedChar('s'));
		Assert.assertFalse(parser.isAdmittedChar('1'));
		Assert.assertFalse(parser.isAdmittedChar('2'));
		Assert.assertFalse(parser.isAdmittedChar('7'));
		Assert.assertFalse(parser.isAdmittedChar('0'));
		Assert.assertFalse(parser.isAdmittedChar('?'));
		Assert.assertFalse(parser.isAdmittedChar('&'));
		Assert.assertFalse(parser.isAdmittedChar(','));
		
	}
	
	@Test
	public void getTableroKingsPositionTest() {
		CheckTheCheckParser parser = new CheckTheCheckParser();
		parser.parse(this._data);
		
		Tablero tablero = parser.getTableros().get(0);
		tablero.locateKings();
		
		Assert.assertEquals(7, tablero.getPosicionReyBlanco()[0]);
		Assert.assertEquals(0, tablero.getPosicionReyBlanco()[1]);
		Assert.assertEquals(0, tablero.getPosicionReyNegro()[0]);
		Assert.assertEquals(2, tablero.getPosicionReyNegro()[1]);
	}
	
	@Test
	public void checkTest() {
		CheckTheCheckParser parser = new CheckTheCheckParser();
		parser.parse(this._data);
		
		Tablero tablero1 = parser.getTableros().get(0);
		Assert.assertTrue(tablero1.reyEnJaque(EnumBando.negro));
		Assert.assertFalse(tablero1.reyEnJaque(EnumBando.blanco));

		Tablero tablero2 = parser.getTableros().get(1);
		Assert.assertFalse(tablero2.reyEnJaque(EnumBando.negro));
		Assert.assertFalse(tablero2.reyEnJaque(EnumBando.blanco));
		
		Tablero tablero3 = parser.getTableros().get(2);
		Assert.assertFalse(tablero3.reyEnJaque(EnumBando.negro));
		Assert.assertTrue(tablero3.reyEnJaque(EnumBando.blanco));
		
		Tablero tablero4 = parser.getTableros().get(3);
		Assert.assertFalse(tablero4.reyEnJaque(EnumBando.negro));
		Assert.assertTrue(tablero4.reyEnJaque(EnumBando.blanco));
		
		Tablero tablero5 = parser.getTableros().get(4);
		Assert.assertFalse(tablero5.reyEnJaque(EnumBando.negro));
		Assert.assertTrue(tablero5.reyEnJaque(EnumBando.blanco));
		
		Tablero tablero6 = parser.getTableros().get(5);
		Assert.assertTrue(tablero6.reyEnJaque(EnumBando.negro));
		Assert.assertFalse(tablero6.reyEnJaque(EnumBando.blanco));
		
		Tablero tablero7 = parser.getTableros().get(6);
		Assert.assertTrue(tablero7.reyEnJaque(EnumBando.negro));
		Assert.assertFalse(tablero7.reyEnJaque(EnumBando.blanco));
		
		Tablero tablero8 = parser.getTableros().get(7);
		Assert.assertFalse(tablero8.reyEnJaque(EnumBando.negro));
		Assert.assertTrue(tablero8.reyEnJaque(EnumBando.blanco));
		
		Tablero tablero9 = parser.getTableros().get(8);
		Assert.assertTrue(tablero9.reyEnJaque(EnumBando.negro));
		Assert.assertFalse(tablero9.reyEnJaque(EnumBando.blanco));
	}
}
