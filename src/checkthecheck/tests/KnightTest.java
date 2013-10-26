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

public class KnightTest {

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
		Pieza caballo = new Knight(EnumBando.blanco, 1, 2);
		Assert.assertNotNull(caballo);
	}
	
	@Test
	public void posiblesMovimientosCaballoTest() {
		Pieza caballo = new Knight(EnumBando.blanco, 3, 5);
		List<int[]> movs = caballo.getPosiblesMovimientos();
		
		int[] expectedMov1 = {4, 3};
		int[] expectedMov2 = {5, 4};
		int[] expectedMov3 = {5, 6};
		int[] expectedMov4 = {4, 7};
		int[] expectedMov5 = {2, 7};
		int[] expectedMov6 = {1, 6};
		int[] expectedMov7 = {1, 4};
		int[] expectedMov8 = {2, 3};
		
		int[] mov1 = movs.get(0);
		int[] mov2 = movs.get(1);
		int[] mov3 = movs.get(2);
		int[] mov4 = movs.get(3);
		int[] mov5 = movs.get(4);
		int[] mov6 = movs.get(5);
		int[] mov7 = movs.get(6);
		int[] mov8 = movs.get(7);
		
		Assert.assertEquals(8, movs.size());
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
		
		caballo = new Knight(EnumBando.blanco, 5, 2);
		movs = caballo.getPosiblesMovimientos();
		
		int[] expectedMov2_1 = {6, 0};
		int[] expectedMov2_2 = {7, 1};
		int[] expectedMov3_2 = {7, 3};
		int[] expectedMov4_2 = {6, 4};
		int[] expectedMov5_2 = {4, 4};
		int[] expectedMov6_2 = {3, 3};
		int[] expectedMov7_2 = {3, 1};
		int[] expectedMov8_2 = {4, 0};
		
		mov1 = movs.get(0);
		mov2 = movs.get(1);
		mov3 = movs.get(2);
		mov4 = movs.get(3);
		mov5 = movs.get(4);
		mov6 = movs.get(5);
		mov7 = movs.get(6);
		mov8 = movs.get(7);
		
		Assert.assertEquals(8, movs.size());
		Assert.assertEquals(expectedMov2_1[0], mov1[0]);
		Assert.assertEquals(expectedMov2_1[1], mov1[1]);
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
	}

}
