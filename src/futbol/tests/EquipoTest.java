package futbol.tests;

import junit.framework.Assert;

import org.junit.Test;

import futbol.Equipo;
import futbol.ResultEnum;

public class EquipoTest {

	@Test
	public void constructorTest() {
		Equipo uruguay = new Equipo("Uruguay");
		Equipo paraguay = new Equipo("PARAGUAY");
		
		Assert.assertNotNull(uruguay);
		Assert.assertEquals("uruguay", uruguay.getNombre());
		
		Assert.assertNotNull(paraguay);
		Assert.assertEquals("paraguay", paraguay.getNombre());
	}
	
	@Test
	public void processVictoriaTest() {
		Equipo equipo = new Equipo("uruguay");
		
		equipo.processResult(ResultEnum.VICTORIA, 3, 1);
		Assert.assertEquals(3, equipo.getPuntos());
		Assert.assertEquals(3, equipo.getGolesFavor());
		Assert.assertEquals(1, equipo.getGolesContra());
	}
	
	@Test
	public void processDerrotaTest() {
		Equipo equipo = new Equipo("uruguay");
		
		equipo.processResult(ResultEnum.DERROTA, 1, 3);
		Assert.assertEquals(0, equipo.getPuntos());
		Assert.assertEquals(1, equipo.getGolesFavor());
		Assert.assertEquals(3, equipo.getGolesContra());
	}
	
	@Test
	public void processEmpateTest() {
		Equipo equipo = new Equipo("uruguay");
		
		equipo.processResult(ResultEnum.EMPATE, 2, 2);
		Assert.assertEquals(1, equipo.getPuntos());
		Assert.assertEquals(2, equipo.getGolesFavor());
		Assert.assertEquals(2, equipo.getGolesContra());
	}
	
	@Test
	public void puntosTest() {
		Equipo equipo = new Equipo("uruguay");
		
		equipo.processResult(ResultEnum.VICTORIA, 3, 1);		
		equipo.processResult(ResultEnum.DERROTA, 1, 3);
		equipo.processResult(ResultEnum.EMPATE, 2, 2);

		Assert.assertEquals(4, equipo.getPuntos());
		Assert.assertEquals(6, equipo.getGolesFavor());
		Assert.assertEquals(6, equipo.getGolesContra());
		
		equipo.processResult(ResultEnum.VICTORIA, 2, 0);		
		equipo.processResult(ResultEnum.DERROTA, 0, 1);
		equipo.processResult(ResultEnum.EMPATE, 1, 1);
		
		Assert.assertEquals(8, equipo.getPuntos());
		Assert.assertEquals(9, equipo.getGolesFavor());
		Assert.assertEquals(8, equipo.getGolesContra());
	}
}
