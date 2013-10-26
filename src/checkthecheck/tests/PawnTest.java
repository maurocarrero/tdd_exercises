package checkthecheck.tests;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import checkthecheck.EnumBando;
import checkthecheck.Pawn;
import checkthecheck.Pieza;

public class PawnTest {

	@Test
	public void constructTest() {
		Pieza pawn = new Pawn(EnumBando.blanco, 1, 2);
		Assert.assertNotNull(pawn);
	}
	
	@Test
	public void posiblesMovimientosPeonBlancoTest() {
		Pieza peonBlanco = new Pawn(EnumBando.blanco, 1, 2);
		List<int[]> movs = peonBlanco.getPosiblesMovimientos();
		
		int[] expectedMov1 = {0, 1};
		int[] expectedMov2 = {0, 3};
		int[] mov1 = movs.get(0);
		int[] mov2 = movs.get(1);
		
		Assert.assertEquals(2, movs.size());
		Assert.assertEquals(expectedMov1[0], mov1[0]);
		Assert.assertEquals(expectedMov1[1], mov1[1]);
		Assert.assertEquals(expectedMov2[0], mov2[0]);
		Assert.assertEquals(expectedMov2[1], mov2[1]);
		
		peonBlanco = new Pawn(EnumBando.blanco, 6, 6);
		movs = peonBlanco.getPosiblesMovimientos();
		
		int[] expectedMov2_1 = {5, 5};
		int[] expectedMov2_2 = {5, 7};
		int[] mov2_1 = movs.get(0);
		int[] mov2_2 = movs.get(1);
		
		Assert.assertEquals(2, movs.size());
		Assert.assertEquals(expectedMov2_1[0], mov2_1[0]);
		Assert.assertEquals(expectedMov2_1[1], mov2_1[1]);
		Assert.assertEquals(expectedMov2_2[0], mov2_2[0]);
		Assert.assertEquals(expectedMov2_2[1], mov2_2[1]);
	}
	
	@Test
	public void posiblesMovimientosPeonNegroTest() {
		Pieza peonNegro = new Pawn(EnumBando.negro, 6, 2);
		List<int[]> movs = peonNegro.getPosiblesMovimientos();
		
		int[] expectedMov1 = {7, 1};
		int[] expectedMov2 = {7, 3};
		int[] mov1 = movs.get(0);
		int[] mov2 = movs.get(1);
		
		Assert.assertEquals(2, movs.size());
		Assert.assertEquals(expectedMov1[0], mov1[0]);
		Assert.assertEquals(expectedMov1[1], mov1[1]);
		Assert.assertEquals(expectedMov2[0], mov2[0]);
		Assert.assertEquals(expectedMov2[1], mov2[1]);
		
		peonNegro = new Pawn(EnumBando.negro, 2, 6);
		movs = peonNegro.getPosiblesMovimientos();
		
		int[] expectedMov2_1 = {3, 5};
		int[] expectedMov2_2 = {3, 7};
		int[] mov2_1 = movs.get(0);
		int[] mov2_2 = movs.get(1);
		
		Assert.assertEquals(2, movs.size());
		Assert.assertEquals(expectedMov2_1[0], mov2_1[0]);
		Assert.assertEquals(expectedMov2_1[1], mov2_1[1]);
		Assert.assertEquals(expectedMov2_2[0], mov2_2[0]);
		Assert.assertEquals(expectedMov2_2[1], mov2_2[1]);
	}
	
	@Test
	public void posiblesMovimientosFallidosPeonBlancoTest() {
		Pieza peonBlanco = new Pawn(EnumBando.blanco, 1, 0);
		List<int[]> movs = peonBlanco.getPosiblesMovimientos();
		
		Assert.assertEquals(1, movs.size());
		
		int[] mov1 = movs.get(0);
		int[] expectedMov1 = {0,1};
		
		Assert.assertEquals(expectedMov1[0], mov1[0]);
		Assert.assertEquals(expectedMov1[1], mov1[1]);

		peonBlanco = new Pawn(EnumBando.blanco, 1, 7);
		movs = peonBlanco.getPosiblesMovimientos();
		
		Assert.assertEquals(1, movs.size());
		
		int[] mov1_2 = movs.get(0);
		int[] expectedMov1_2 = {0,6};
		
		Assert.assertEquals(expectedMov1_2[0], mov1_2[0]);
		Assert.assertEquals(expectedMov1_2[1], mov1_2[1]);
		
		peonBlanco = new Pawn(EnumBando.blanco, 0, 5);
		movs = peonBlanco.getPosiblesMovimientos();
		
		Assert.assertEquals(0, movs.size());
	}
	
	@Test
	public void posiblesMovimientosFallidosPeonNegroTest1() {
		Pieza peonNegro = new Pawn(EnumBando.negro, 1, 0);
		List<int[]> movs = peonNegro.getPosiblesMovimientos();
		
		Assert.assertEquals(1, movs.size());
		
		int[] mov1 = movs.get(0);
		int[] expectedMov1 = {2,1};
		
		Assert.assertEquals(expectedMov1[0], mov1[0]);
		Assert.assertEquals(expectedMov1[1], mov1[1]);

		peonNegro = new Pawn(EnumBando.negro, 1, 7);
		movs = peonNegro.getPosiblesMovimientos();
		
		Assert.assertEquals(1, movs.size());

		int[] mov1_2 = movs.get(0);
		
		int[] expectedMov1_2 = {2,6};
		
		Assert.assertEquals(expectedMov1_2[0], mov1_2[0]);
		Assert.assertEquals(expectedMov1_2[1], mov1_2[1]);
		
		peonNegro = new Pawn(EnumBando.negro, 7, 3);
		movs = peonNegro.getPosiblesMovimientos();
		
		Assert.assertEquals(0, movs.size());
	}

}
