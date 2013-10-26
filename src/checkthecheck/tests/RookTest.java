package checkthecheck.tests;

import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import checkthecheck.Bishop;
import checkthecheck.King;
import checkthecheck.Knight;
import checkthecheck.Pawn;
import checkthecheck.Queen;
import checkthecheck.Rook;
import checkthecheck.EnumBando;
import checkthecheck.Pieza;

public class RookTest {

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
		this._tablero2[0][0] = new Rook(EnumBando.blanco, 0, 0);
		this._tablero2[0][1] = new Knight(EnumBando.blanco, 0, 1);
		this._tablero2[0][2] = new Bishop(EnumBando.blanco, 0, 2);
		this._tablero2[0][3] = new Queen(EnumBando.blanco, 0, 3);
		this._tablero2[0][4] = new King(EnumBando.blanco, 0, 4);
		this._tablero2[0][5] = new Bishop(EnumBando.blanco, 0, 5);
		this._tablero2[0][6] = new Knight(EnumBando.blanco, 0, 6);
		this._tablero2[0][7] = new Rook(EnumBando.blanco, 0, 7);
		
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
				
		this._tablero3[0][0] = new Rook(EnumBando.blanco, 0, 0);
		this._tablero3[0][1] = new Knight(EnumBando.blanco, 0, 1);
		this._tablero3[0][2] = new Bishop(EnumBando.blanco, 0, 2);
		this._tablero3[0][3] = new Queen(EnumBando.blanco, 0, 3);
		this._tablero3[0][4] = new King(EnumBando.blanco, 0, 4);
		this._tablero3[0][5] = new Bishop(EnumBando.blanco, 0, 5);
		this._tablero3[0][6] = null;
		this._tablero3[0][7] = new Rook(EnumBando.blanco, 0, 7);
	}
	
	@Test
	public void constructTest() {
		Pieza rook = new Rook(EnumBando.blanco, 3, 5);
		Assert.assertNotNull(rook);
	}
	
	@Test
	public void posiblesMovimientosTorreTest() {
		Pieza torre = new Rook(EnumBando.blanco, 3, 5);
		
		List<int[]> movs = torre.getPosiblesMovimientos();
		
		Assert.assertEquals(14, movs.size());
		
		int[] expectedMov1 = {3, 4};
		int[] expectedMov2 = {3, 3};
		int[] expectedMov3 = {3, 2};
		int[] expectedMov4 = {3, 1};
		int[] expectedMov5 = {3, 0};
		int[] expectedMov6 = {3, 6};
		int[] expectedMov7 = {3, 7};
		int[] expectedMov8 = {2, 5};
		int[] expectedMov9 = {1, 5};
		int[] expectedMov10 = {0, 5};
		int[] expectedMov11 = {4, 5};
		int[] expectedMov12 = {5, 5};
		int[] expectedMov13 = {6, 5};
		int[] expectedMov14 = {7, 5};

		int[] mov1 = movs.get(0);
		int[] mov2 = movs.get(1);
		int[] mov3 = movs.get(2);
		int[] mov4 = movs.get(3);
		int[] mov5 = movs.get(4);
		int[] mov6 = movs.get(5);
		int[] mov7 = movs.get(6);
		int[] mov8 = movs.get(7);
		int[] mov9 = movs.get(8);
		int[] mov10 = movs.get(9);
		int[] mov11 = movs.get(10);
		int[] mov12 = movs.get(11);
		int[] mov13 = movs.get(12);
		int[] mov14 = movs.get(13);
		
		Assert.assertEquals(expectedMov1[0], mov1[0]);
		Assert.assertEquals(expectedMov1[1], mov1[1]);
		Assert.assertEquals(expectedMov2[0], mov2[0]);
		Assert.assertEquals(expectedMov2[1], mov2[1]);
		Assert.assertEquals(expectedMov3[0], mov3[0]);
		Assert.assertEquals(expectedMov3[1], mov3[1]);
		Assert.assertEquals(expectedMov4[0], mov4[0]);
		Assert.assertEquals(expectedMov4[1], mov4[1]);
		Assert.assertEquals(expectedMov5[0], mov5[0]);
		Assert.assertEquals(expectedMov5[1], mov5[1]);
		Assert.assertEquals(expectedMov6[0], mov6[0]);
		Assert.assertEquals(expectedMov6[1], mov6[1]);
		Assert.assertEquals(expectedMov7[0], mov7[0]);
		Assert.assertEquals(expectedMov7[1], mov7[1]);
		Assert.assertEquals(expectedMov8[0], mov8[0]);
		Assert.assertEquals(expectedMov8[1], mov8[1]);
		Assert.assertEquals(expectedMov9[0], mov9[0]);
		Assert.assertEquals(expectedMov9[1], mov9[1]);
		Assert.assertEquals(expectedMov10[0], mov10[0]);
		Assert.assertEquals(expectedMov10[1], mov10[1]);
		Assert.assertEquals(expectedMov11[0], mov11[0]);
		Assert.assertEquals(expectedMov11[1], mov11[1]);
		Assert.assertEquals(expectedMov12[0], mov12[0]);
		Assert.assertEquals(expectedMov12[1], mov12[1]);
		Assert.assertEquals(expectedMov13[0], mov13[0]);
		Assert.assertEquals(expectedMov13[1], mov13[1]);
		Assert.assertEquals(expectedMov14[0], mov14[0]);
		Assert.assertEquals(expectedMov14[1], mov14[1]);
		
		torre = new Rook(EnumBando.negro, 6, 2);
		movs = torre.getPosiblesMovimientos();
		
		Assert.assertEquals(14, movs.size());
		
		int[] expectedMov1_2 = {6, 1};
		int[] expectedMov2_2 = {6, 0};
		int[] expectedMov3_2 = {6, 3};
		int[] expectedMov4_2 = {6, 4};
		int[] expectedMov5_2 = {6, 5};
		int[] expectedMov6_2 = {6, 6};
		int[] expectedMov7_2 = {6, 7};
		int[] expectedMov8_2 = {5, 2};
		int[] expectedMov9_2 = {4, 2};
		int[] expectedMov10_2 = {3, 2};
		int[] expectedMov11_2 = {2, 2};
		int[] expectedMov12_2 = {1, 2};
		int[] expectedMov13_2 = {0, 2};
		int[] expectedMov14_2 = {7, 2};

		mov1 = movs.get(0);
		mov2 = movs.get(1);
		mov3 = movs.get(2);
		mov4 = movs.get(3);
		mov5 = movs.get(4);
		mov6 = movs.get(5);
		mov7 = movs.get(6);
		mov8 = movs.get(7);
		mov9 = movs.get(8);
		mov10 = movs.get(9);
		mov11 = movs.get(10);
		mov12 = movs.get(11);
		mov13 = movs.get(12);
		mov14 = movs.get(13);
		
		Assert.assertEquals(expectedMov1_2[0], mov1[0]);
		Assert.assertEquals(expectedMov1_2[1], mov1[1]);
		Assert.assertEquals(expectedMov2_2[0], mov2[0]);
		Assert.assertEquals(expectedMov2_2[1], mov2[1]);
		Assert.assertEquals(expectedMov3_2[0], mov3[0]);
		Assert.assertEquals(expectedMov3_2[1], mov3[1]);
		Assert.assertEquals(expectedMov4_2[0], mov4[0]);
		Assert.assertEquals(expectedMov4_2[1], mov4[1]);
		Assert.assertEquals(expectedMov5_2[0], mov5[0]);
		Assert.assertEquals(expectedMov5_2[1], mov5[1]);
		Assert.assertEquals(expectedMov6_2[0], mov6[0]);
		Assert.assertEquals(expectedMov6_2[1], mov6[1]);
		Assert.assertEquals(expectedMov7_2[0], mov7[0]);
		Assert.assertEquals(expectedMov7_2[1], mov7[1]);
		Assert.assertEquals(expectedMov8_2[0], mov8[0]);
		Assert.assertEquals(expectedMov8_2[1], mov8[1]);
		Assert.assertEquals(expectedMov9_2[0], mov9[0]);
		Assert.assertEquals(expectedMov9_2[1], mov9[1]);
		Assert.assertEquals(expectedMov10_2[0], mov10[0]);
		Assert.assertEquals(expectedMov10_2[1], mov10[1]);
		Assert.assertEquals(expectedMov11_2[0], mov11[0]);
		Assert.assertEquals(expectedMov11_2[1], mov11[1]);
		Assert.assertEquals(expectedMov12_2[0], mov12[0]);
		Assert.assertEquals(expectedMov12_2[1], mov12[1]);
		Assert.assertEquals(expectedMov13_2[0], mov13[0]);
		Assert.assertEquals(expectedMov13_2[1], mov13[1]);
		Assert.assertEquals(expectedMov14_2[0], mov14[0]);
		Assert.assertEquals(expectedMov14_2[1], mov14[1]);
	}

	@Test
	public void attackTest() {
		Pieza torre = new Rook(EnumBando.negro, 3, 5);
		
		int[] posicionReyBlanco = { 0, 2 };
		Assert.assertFalse(torre.attack(posicionReyBlanco, this._tablero1));
		
		posicionReyBlanco[0] = 1;
		posicionReyBlanco[1] = 7;
		
		Assert.assertFalse(torre.attack(posicionReyBlanco, this._tablero1));
		
		posicionReyBlanco[0] = 3;
		posicionReyBlanco[1] = 0;
		
		Assert.assertFalse(torre.attack(posicionReyBlanco, this._tablero1));
		
		posicionReyBlanco[0] = 2;
		posicionReyBlanco[1] = 3;
		
		Assert.assertFalse(torre.attack(posicionReyBlanco, this._tablero1));
		
		posicionReyBlanco[0] = 4;
		posicionReyBlanco[1] = 5;
		
		Assert.assertTrue(torre.attack(posicionReyBlanco, this._tablero1));
		
		posicionReyBlanco[0] = 4;
		posicionReyBlanco[1] = 6;
		
		Assert.assertFalse(torre.attack(posicionReyBlanco, this._tablero1));
		
		posicionReyBlanco[0] = 7;
		posicionReyBlanco[1] = 1;
		
		Assert.assertFalse(torre.attack(posicionReyBlanco, this._tablero1));
	}
	
}
