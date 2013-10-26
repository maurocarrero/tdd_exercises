package futbol.tests;

import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import futbol.Equipo;
import futbol.Partido;
import futbol.Torneo;

public class TorneoTest
{
	private Torneo torneo1;
	private Torneo torneo2;
	
	@Before
	public void setUp() throws Exception {
		String[] lineasPartido = new String[6];
		lineasPartido[0] = "portugal#grecia#4#1";
		lineasPartido[1] = "españa#rusia#3#1";
		lineasPartido[2] = "portugal#rusia#3#0";
		lineasPartido[3] = "españa#grecia#1#2";
		lineasPartido[4] = "portugal#españa#1#3";
		lineasPartido[5] = "grecia#rusia#7#0";
		
		torneo1 = new Torneo(6, lineasPartido);
		
		lineasPartido = new String[2];
		lineasPartido[0] = "argentina#uruguay#10#-5";
		lineasPartido[1] = "argentina#uruguay#-3#10";
		
		torneo2 = new Torneo(2, lineasPartido);
	}
	
	@Test
	public void torneoTest() {
		
		List<Partido> partidos = torneo1.getPartidos();
		
		// portugal#grecia#4#1
		Assert.assertNotNull(torneo1);
		Assert.assertEquals("portugal", partidos.get(0).getEquipo1().getNombre());
		Assert.assertEquals("grecia", partidos.get(0).getEquipo2().getNombre());
		Assert.assertEquals(4, partidos.get(0).getGolesEquipo1());
		Assert.assertEquals(1, partidos.get(0).getGolesEquipo2());
		
		// españa#rusia#3#1
		Assert.assertEquals("españa", partidos.get(1).getEquipo1().getNombre());
		Assert.assertEquals("rusia", partidos.get(1).getEquipo2().getNombre());
		Assert.assertEquals(3, partidos.get(1).getGolesEquipo1());
		Assert.assertEquals(1, partidos.get(1).getGolesEquipo2());
		
		// portugal#rusia#3#0
		Assert.assertEquals("portugal", partidos.get(2).getEquipo1().getNombre());
		Assert.assertEquals("rusia", partidos.get(2).getEquipo2().getNombre());
		Assert.assertEquals(3, partidos.get(2).getGolesEquipo1());
		Assert.assertEquals(0, partidos.get(2).getGolesEquipo2());
		
		// españa#grecia#1#2
		Assert.assertEquals("españa", partidos.get(3).getEquipo1().getNombre());
		Assert.assertEquals("grecia", partidos.get(3).getEquipo2().getNombre());
		Assert.assertEquals(1, partidos.get(3).getGolesEquipo1());
		Assert.assertEquals(2, partidos.get(3).getGolesEquipo2());
		
		// portugal#españa#1#3
		Assert.assertEquals("portugal", partidos.get(4).getEquipo1().getNombre());
		Assert.assertEquals("españa", partidos.get(4).getEquipo2().getNombre());
		Assert.assertEquals(1, partidos.get(4).getGolesEquipo1());
		Assert.assertEquals(3, partidos.get(4).getGolesEquipo2());
		
		// grecia#rusia#7#0
		Assert.assertEquals("grecia", partidos.get(5).getEquipo1().getNombre());
		Assert.assertEquals("rusia", partidos.get(5).getEquipo2().getNombre());
		Assert.assertEquals(7, partidos.get(5).getGolesEquipo1());
		Assert.assertEquals(0, partidos.get(5).getGolesEquipo2());		
	}
	
	@Test
	public void getEquipoTest() {
		Equipo equipo1 = torneo1.getEquipo("portugal");
		Equipo equipo2 = torneo1.getEquipo("españa");
		Equipo equipo3 = torneo1.getEquipo("grecia");
		Equipo equipo4 = torneo1.getEquipo("rusia");
		
		Assert.assertNotNull(equipo1);
		Assert.assertNotNull(equipo2);
		Assert.assertNotNull(equipo3);
		Assert.assertNotNull(equipo4);
	}
	
	@Test
	public void processResultsTest() {
		
		torneo1.processResults();
		
		Equipo portugal = torneo1.getEquipo("portugal");
		Equipo espania = torneo1.getEquipo("españa");
		Equipo grecia = torneo1.getEquipo("grecia");
		Equipo rusia = torneo1.getEquipo("rusia");
		
		Assert.assertNotNull(portugal);
		Assert.assertEquals(6, portugal.getPuntos());
		Assert.assertEquals(8, portugal.getGolesFavor());
		Assert.assertEquals(4, portugal.getGolesContra());
		Assert.assertEquals(0, portugal.getPartidosEmpatados());
		Assert.assertEquals(2, portugal.getPartidosGanados());
		Assert.assertEquals(1, portugal.getPartidosPerdidos());
		
		Assert.assertNotNull(espania);
		Assert.assertEquals(6, espania.getPuntos());
		Assert.assertEquals(7, espania.getGolesFavor());
		Assert.assertEquals(4, espania.getGolesContra());
		Assert.assertEquals(0, espania.getPartidosEmpatados());
		Assert.assertEquals(2, espania.getPartidosGanados());
		Assert.assertEquals(1, espania.getPartidosPerdidos());
		
		Assert.assertNotNull(grecia);
		Assert.assertEquals(6, grecia.getPuntos());
		Assert.assertEquals(10, grecia.getGolesFavor());
		Assert.assertEquals(5, grecia.getGolesContra());
		Assert.assertEquals(0, grecia.getPartidosEmpatados());
		Assert.assertEquals(2, grecia.getPartidosGanados());
		Assert.assertEquals(1, grecia.getPartidosPerdidos());
		
		Assert.assertNotNull(rusia);
		Assert.assertEquals(0, rusia.getPuntos());
		Assert.assertEquals(1, rusia.getGolesFavor());
		Assert.assertEquals(13, rusia.getGolesContra());
		Assert.assertEquals(0, rusia.getPartidosEmpatados());
		Assert.assertEquals(0, rusia.getPartidosGanados());
		Assert.assertEquals(3, rusia.getPartidosPerdidos());
		
		torneo2.processResults();
		Equipo argentina = torneo2.getEquipo("argentina");
		Equipo uruguay = torneo2.getEquipo("uruguay");
		
		Assert.assertNotNull(uruguay);
		Assert.assertEquals(3, uruguay.getPuntos());
		Assert.assertEquals(10, uruguay.getGolesFavor());
		Assert.assertEquals(10, uruguay.getGolesContra());
		Assert.assertEquals(0, uruguay.getPartidosEmpatados());
		Assert.assertEquals(1, uruguay.getPartidosGanados());
		Assert.assertEquals(1, uruguay.getPartidosPerdidos());
		
		Assert.assertNotNull(argentina);
		Assert.assertEquals(3, argentina.getPuntos());
		Assert.assertEquals(10, argentina.getGolesFavor());
		Assert.assertEquals(10, argentina.getGolesContra());
		Assert.assertEquals(0, argentina.getPartidosEmpatados());
		Assert.assertEquals(1, argentina.getPartidosGanados());
		Assert.assertEquals(1, argentina.getPartidosPerdidos());
		
		
	}
}
