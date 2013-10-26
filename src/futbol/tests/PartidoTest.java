package futbol.tests;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import futbol.Equipo;
import futbol.Partido;

public class PartidoTest
{
	private Equipo _equipo1;
	private Equipo _equipo2;
	
	@Before
	public void setUp() {
		this._equipo1 = new Equipo("Uruguay");
		this._equipo2 = new Equipo("Ecuador");		
	}
	
	@Test
	public void basicDataTest()
	{
		Partido partido = new Partido(this._equipo1, this._equipo2, 3, 2);
		
		Assert.assertNotNull(partido);
		Assert.assertEquals("uruguay", partido.getEquipo1().getNombre());
		Assert.assertEquals("ecuador", partido.getEquipo2().getNombre());
		Assert.assertEquals(3, partido.getGolesEquipo1());
		Assert.assertEquals(2, partido.getGolesEquipo2());
	}
	
	@Test
	public void processResultTest()
	{
		Partido partido = new Partido(this._equipo1, this._equipo2, 3, 2);		
		partido.processResults();
		
		Assert.assertEquals(partido.getEquipo1().getGolesFavor(), partido.getGolesEquipo1());
		Assert.assertEquals(partido.getEquipo2().getGolesFavor(), partido.getGolesEquipo2());
		Assert.assertEquals(partido.getEquipo1().getGolesContra(), partido.getGolesEquipo2());
		Assert.assertEquals(partido.getEquipo2().getGolesContra(), partido.getGolesEquipo1());
	}
	
	@Test
	public void processEmpateTest()
	{
		Partido partido = new Partido(this._equipo1, this._equipo2, 5, 5);		
		partido.processResults();
		
		Assert.assertEquals(partido.getGolesEquipo1(), partido.getGolesEquipo2());
		Assert.assertEquals(partido.getEquipo1().getGolesFavor(), partido.getEquipo2().getGolesFavor());
		Assert.assertEquals(partido.getEquipo1().getGolesFavor(), partido.getGolesEquipo1());
		Assert.assertEquals(partido.getEquipo2().getGolesFavor(), partido.getGolesEquipo2());
		Assert.assertEquals(partido.getEquipo1().getGolesContra(), partido.getGolesEquipo2());
		Assert.assertEquals(partido.getEquipo2().getGolesContra(), partido.getGolesEquipo1());
	}
}
