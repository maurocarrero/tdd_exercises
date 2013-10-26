package checkthecheck.tests;

import java.util.List;

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

public class QueenTest {

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
		Pieza queen = new Queen(EnumBando.blanco, 3, 5);
		Assert.assertNotNull(queen);
	}
	
	@Test
	public void posiblesMovimientosReinaTest() {
		Pieza reina = new Queen(EnumBando.blanco, 3, 5);
		
		List<int[]> movs = reina.getPosiblesMovimientos();
		
		Assert.assertEquals(25, movs.size());
		
		int[] expectedMov1 = {4, 4};
		int[] expectedMov2 = {5, 3};
		int[] expectedMov3 = {6, 2};
		int[] expectedMov4 = {7, 1};
		int[] expectedMov5 = {4, 6};
		int[] expectedMov6 = {5, 7};
		int[] expectedMov7 = {2, 4};
		int[] expectedMov8 = {1, 3};
		int[] expectedMov9 = {0, 2};
		int[] expectedMov10 = {2, 6};
		int[] expectedMov11 = {1, 7};
		int[] expectedMov12 = {3, 4};
		int[] expectedMov13 = {3, 3};
		int[] expectedMov14 = {3, 2};
		int[] expectedMov15 = {3, 1};
		int[] expectedMov16 = {3, 0};
		int[] expectedMov17 = {3, 6};
		int[] expectedMov18 = {3, 7};
		int[] expectedMov19 = {2, 5};
		int[] expectedMov20 = {1, 5};
		int[] expectedMov21 = {0, 5};
		int[] expectedMov22 = {4, 5};
		int[] expectedMov23 = {5, 5};
		int[] expectedMov24 = {6, 5};
		int[] expectedMov25 = {7, 5};
		
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
		int[] mov15 = movs.get(14);
		int[] mov16 = movs.get(15);
		int[] mov17 = movs.get(16);
		int[] mov18 = movs.get(17);
		int[] mov19 = movs.get(18);
		int[] mov20 = movs.get(19);
		int[] mov21 = movs.get(20);
		int[] mov22 = movs.get(21);
		int[] mov23 = movs.get(22);
		int[] mov24 = movs.get(23);
		int[] mov25 = movs.get(24);
		
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
		Assert.assertEquals(expectedMov15[0], mov15[0]);
		Assert.assertEquals(expectedMov15[1], mov15[1]);
		Assert.assertEquals(expectedMov16[0], mov16[0]);
		Assert.assertEquals(expectedMov16[1], mov16[1]);
		Assert.assertEquals(expectedMov17[0], mov17[0]);
		Assert.assertEquals(expectedMov17[1], mov17[1]);
		Assert.assertEquals(expectedMov18[0], mov18[0]);
		Assert.assertEquals(expectedMov18[1], mov18[1]);
		Assert.assertEquals(expectedMov19[0], mov19[0]);
		Assert.assertEquals(expectedMov19[1], mov19[1]);
		Assert.assertEquals(expectedMov20[0], mov20[0]);
		Assert.assertEquals(expectedMov20[1], mov20[1]);
		Assert.assertEquals(expectedMov21[0], mov21[0]);
		Assert.assertEquals(expectedMov21[1], mov21[1]);
		Assert.assertEquals(expectedMov22[0], mov22[0]);
		Assert.assertEquals(expectedMov22[1], mov22[1]);
		Assert.assertEquals(expectedMov23[0], mov23[0]);
		Assert.assertEquals(expectedMov23[1], mov23[1]);
		Assert.assertEquals(expectedMov24[0], mov24[0]);
		Assert.assertEquals(expectedMov24[1], mov24[1]);
		Assert.assertEquals(expectedMov25[0], mov25[0]);
		Assert.assertEquals(expectedMov25[1], mov25[1]);
		
		reina = new Queen(EnumBando.negro, 6, 2);
		movs = reina.getPosiblesMovimientos();
		
		Assert.assertEquals(23, movs.size());
		
		int[] expectedMov1_2 = {7, 1};
		int[] expectedMov2_2 = {7, 3};
		int[] expectedMov3_2 = {5, 1};
		int[] expectedMov4_2 = {4, 0};
		int[] expectedMov5_2 = {5, 3};
		int[] expectedMov6_2 = {4, 4};
		int[] expectedMov7_2 = {3, 5};
		int[] expectedMov8_2 = {2, 6};
		int[] expectedMov9_2 = {1, 7};
		int[] expectedMov10_2 = {6, 1};
		int[] expectedMov11_2 = {6, 0};
		int[] expectedMov12_2 = {6, 3};
		int[] expectedMov13_2 = {6, 4};
		int[] expectedMov14_2 = {6, 5};
		int[] expectedMov15_2 = {6, 6};
		int[] expectedMov16_2 = {6, 7};
		int[] expectedMov17_2 = {5, 2};
		int[] expectedMov18_2 = {4, 2};
		int[] expectedMov19_2 = {3, 2};
		int[] expectedMov20_2 = {2, 2};
		int[] expectedMov21_2 = {1, 2};
		int[] expectedMov22_2 = {0, 2};
		int[] expectedMov23_2 = {7, 2};
		
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
		mov15 = movs.get(14);
		mov16 = movs.get(15);
		mov17 = movs.get(16);
		mov18 = movs.get(17);
		mov19 = movs.get(18);
		mov20 = movs.get(19);
		mov21 = movs.get(20);
		mov22 = movs.get(21);
		mov23 = movs.get(22);
		
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
		Assert.assertEquals(expectedMov15_2[0], mov15[0]);
		Assert.assertEquals(expectedMov15_2[1], mov15[1]);
		Assert.assertEquals(expectedMov16_2[0], mov16[0]);
		Assert.assertEquals(expectedMov16_2[1], mov16[1]);
		Assert.assertEquals(expectedMov17_2[0], mov17[0]);
		Assert.assertEquals(expectedMov17_2[1], mov17[1]);
		Assert.assertEquals(expectedMov18_2[0], mov18[0]);
		Assert.assertEquals(expectedMov18_2[1], mov18[1]);
		Assert.assertEquals(expectedMov19_2[0], mov19[0]);
		Assert.assertEquals(expectedMov19_2[1], mov19[1]);
		Assert.assertEquals(expectedMov20_2[0], mov20[0]);
		Assert.assertEquals(expectedMov20_2[1], mov20[1]);
		Assert.assertEquals(expectedMov21_2[0], mov21[0]);
		Assert.assertEquals(expectedMov21_2[1], mov21[1]);
		Assert.assertEquals(expectedMov22_2[0], mov22[0]);
		Assert.assertEquals(expectedMov22_2[1], mov22[1]);
		Assert.assertEquals(expectedMov23_2[0], mov23[0]);
		Assert.assertEquals(expectedMov23_2[1], mov23[1]);
	}

	@Test
	public void attackTest() {
		Pieza reina = new Queen(EnumBando.negro, 3, 5);
		int[] posicionReyBlanco = { 0, 2 };
		Assert.assertTrue(reina.attack(posicionReyBlanco, this._tablero1));
		
		posicionReyBlanco[0] = 1;
		posicionReyBlanco[1] = 7;
		
		Assert.assertTrue(reina.attack(posicionReyBlanco, this._tablero1));
		
		posicionReyBlanco[0] = 3;
		posicionReyBlanco[1] = 0;
		
		Assert.assertFalse(reina.attack(posicionReyBlanco, this._tablero1));
		
		posicionReyBlanco[0] = 2;
		posicionReyBlanco[1] = 3;
		
		Assert.assertFalse(reina.attack(posicionReyBlanco, this._tablero1));
		
		posicionReyBlanco[0] = 4;
		posicionReyBlanco[1] = 5;
		
		Assert.assertTrue(reina.attack(posicionReyBlanco, this._tablero1));
		
		posicionReyBlanco[0] = 4;
		posicionReyBlanco[1] = 6;
		
		Assert.assertTrue(reina.attack(posicionReyBlanco, this._tablero1));
		
		posicionReyBlanco[0] = 7;
		posicionReyBlanco[1] = 1;
		
		Assert.assertFalse(reina.attack(posicionReyBlanco, this._tablero1));
		
		posicionReyBlanco[0] = 0;
		posicionReyBlanco[1] = 5;
		
		Assert.assertFalse(reina.attack(posicionReyBlanco, this._tablero1));
		
		posicionReyBlanco[0] = 7;
		posicionReyBlanco[1] = 5;
		
		Assert.assertFalse(reina.attack(posicionReyBlanco, this._tablero1));
		
		posicionReyBlanco[0] = 7;
		posicionReyBlanco[1] = 3;
		
		Assert.assertFalse(reina.attack(posicionReyBlanco, this._tablero1));
	}
	
	
	
}