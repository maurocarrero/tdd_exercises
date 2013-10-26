package checkthecheck.tests;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import checkthecheck.Bishop;
import checkthecheck.EnumBando;
import checkthecheck.King;
import checkthecheck.Knight;
import checkthecheck.Pawn;
import checkthecheck.Pieza;
import checkthecheck.Queen;
import checkthecheck.Rook;
import checkthecheck.Tablero;

public class TableroTest
{
	private Pieza[][] _tablero1;
	private Pieza[][] _tablero2;
	private Pieza[][] _tablero3;
	
	@Before
	public void setUp() {
		
		/*
		 	..k.....
			ppp.pppp
			........
			.R...B..
			........
			........
			PPPPPPPP
			K.......
		 */
		
		this._tablero1 = new Pieza[8][8];
		
		// ..k.....
		this._tablero1[0][2] = new King(EnumBando.blanco, 0, 2);
		
		// ppp.pppp
		for (int i=0; i < 8; i++)
			this._tablero1[1][i] = new Pawn(EnumBando.blanco, 1, i);
		this._tablero1[1][3] = null;
		
		// ........ - Línea vacía, no hago nada.
		
		// .R...B..
		this._tablero1[3][1] = new Rook(EnumBando.negro, 3, 1);
		this._tablero1[3][5] = new Bishop(EnumBando.negro, 3, 5);
		
		// Líneas vacías
		
		// PPPPPPPP
		for (int i=0; i < 8; i++)
			this._tablero1[6][i] = new Pawn(EnumBando.negro, 6, i);
		
		// K.......
		this._tablero1[7][0] = new King(EnumBando.negro, 7, 0);
		
		/*
			rnbqkbnr
			pppppppp
			........
			........
			........
			........
			PPPPPPPP
			RNBQKBNR
		*/
		
		this._tablero2 = new Pieza[8][8];
		this._tablero2[0][0] = new Rook(EnumBando.negro, 0, 0);
		this._tablero2[0][1] = new Knight(EnumBando.negro, 0, 1);
		this._tablero2[0][2] = new Bishop(EnumBando.negro, 0, 2);
		this._tablero2[0][3] = new Queen(EnumBando.negro, 0, 3);
		this._tablero2[0][4] = new King(EnumBando.negro, 0, 4);
		this._tablero2[0][5] = new Bishop(EnumBando.negro, 0, 5);
		this._tablero2[0][6] = new Knight(EnumBando.negro, 0, 6);
		this._tablero2[0][7] = new Rook(EnumBando.negro, 0, 7);
		for (int i=0; i < 8; i++)
			this._tablero2[1][i] = new Pawn(EnumBando.negro, 1, i);
		for (int i=0; i < 8; i++)
			this._tablero2[6][i] = new Pawn(EnumBando.blanco, 6, i);
		this._tablero2[7][0] = new Rook(EnumBando.blanco, 7, 0);
		this._tablero2[7][1] = new Knight(EnumBando.blanco, 7, 1);
		this._tablero2[7][2] = new Bishop(EnumBando.blanco, 7, 2);
		this._tablero2[7][3] = new Queen(EnumBando.blanco, 7, 3);
		this._tablero2[7][4] = new King(EnumBando.blanco, 7, 4);
		this._tablero2[7][5] = new Bishop(EnumBando.blanco, 7, 5);
		this._tablero2[7][6] = new Knight(EnumBando.blanco, 7, 6);
		this._tablero2[7][7] = new Rook(EnumBando.blanco, 7, 7);
		
		/*
		rnbqk.nr
		ppp..ppp
		....p...
		...p....
		.bPP....
		.....N..
		PP..PPPP
		RNBQKB.R
		*/
		this._tablero3 = new Pieza[8][8];
		
		this._tablero3[0][0] = new Rook(EnumBando.negro, 0, 0);
		this._tablero3[0][1] = new Knight(EnumBando.negro, 0, 1);
		this._tablero3[0][2] = new Bishop(EnumBando.negro, 0, 2);
		this._tablero3[0][3] = new Queen(EnumBando.negro, 0, 3);
		this._tablero3[0][4] = new King(EnumBando.negro, 0, 4);
		this._tablero3[0][5] = null;
		this._tablero3[0][6] = new Knight(EnumBando.negro, 0, 6);
		this._tablero3[0][7] = new Rook(EnumBando.negro, 0, 7);
		
		for (int i=0; i < 8; i++)
			this._tablero3[1][i] = new Pawn(EnumBando.negro, 1, i);
		this._tablero3[1][3] = null;
		this._tablero3[1][4] = null;

		this._tablero3[2][4] = new Pawn(EnumBando.negro, 2, 4);
		this._tablero3[3][3] = new Pawn(EnumBando.negro, 3, 3);
		
		this._tablero3[4][1] = new Pawn(EnumBando.negro, 4, 1);
		
		
		for (int i=0; i < 8; i++)
			this._tablero3[6][i] = new Pawn(EnumBando.blanco, 6, i);
		this._tablero3[6][2] = null;
		this._tablero3[6][3] = null;
				
		this._tablero3[7][0] = new Rook(EnumBando.blanco, 7, 0);
		this._tablero3[7][1] = new Knight(EnumBando.blanco, 7, 1);
		this._tablero3[7][2] = new Bishop(EnumBando.blanco, 7, 2);
		this._tablero3[7][3] = new Queen(EnumBando.blanco, 7, 3);
		this._tablero3[7][4] = new King(EnumBando.blanco, 7, 4);
		this._tablero3[7][5] = new Bishop(EnumBando.blanco, 7, 5);
		this._tablero3[7][6] = null;
		this._tablero3[7][7] = new Rook(EnumBando.blanco, 7, 7);
	}
	
	@Test
	public void locateKingsTest() {
		Tablero tablero = new Tablero(this._tablero1);
		
		tablero.locateKings();
		
		int[] posReyBlanco = tablero.getPosicionReyBlanco();
		int[] posReyNegro = tablero.getPosicionReyNegro();
		
		Assert.assertEquals(0, posReyBlanco[0]);
		Assert.assertEquals(2, posReyBlanco[1]);
		Assert.assertEquals(7, posReyNegro[0]);
		Assert.assertEquals(0, posReyNegro[1]);		
		
	}

	@Test
	public void reyEnJaque() {
		Tablero tablero1 = new Tablero(this._tablero1);
		Assert.assertTrue(tablero1.reyEnJaque(EnumBando.blanco));
		Assert.assertFalse(tablero1.reyEnJaque(EnumBando.negro));
		
		Tablero tablero2 = new Tablero(this._tablero2);
		Assert.assertFalse(tablero2.reyEnJaque(EnumBando.blanco));
		Assert.assertFalse(tablero2.reyEnJaque(EnumBando.negro));
	}
}
