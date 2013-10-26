package futbol.tests;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import futbol.FutbolParser;
import futbol.Torneo;

public class FutbolParserTest
{
	private List<String> _data;
	
	@Before
	public void setUp() {
		
		this._data = new ArrayList<String>();
		
		this._data.add("3");
		this._data.add("6");
		this._data.add("portugal#grecia#4#1");
		this._data.add("españa#rusia#3#1");
		this._data.add("portugal#rusia#3#0");
		this._data.add("españa#grecia#1#2"); 
		this._data.add("portugal#españa#1#3"); 
		this._data.add("grecia#rusia#7#0"); 
		this._data.add("6"); 
		this._data.add("portugal#grecia#4#1");
		this._data.add("españa#rusia#1#3"); 
		this._data.add("portugal#rusia#3#0");
		this._data.add("españa#grecia#1#2"); 
		this._data.add("portugal#españa#1#3");
		this._data.add("grecia#rusia#7#0");
		this._data.add("1"); 
		this._data.add("brasil#francia#0#0");
	}
	
	@Test
	public void constructorTest() {
		FutbolParser parser = new FutbolParser();
		Assert.assertNotNull(parser);
	}	
	
	@Test
	public void cantidadTorneosTest() {
		FutbolParser parser = new FutbolParser();
		
		parser.setCantidadTorneos(7);
		Assert.assertEquals(7, parser.getCantidadTorneos());
		
		parser.setCantidadTorneos(2);
		Assert.assertEquals(2, parser.getCantidadTorneos());
	}
	
	@Test
	public void parseTorneoTest() {
		FutbolParser parser = new FutbolParser();
		String[] partidos = new String[6];
		partidos[0] = "portugal#grecia#4#1";
		partidos[1] = "españa#rusia#3#1";
		partidos[2] = "portugal#rusia#3#0";
		partidos[3] = "españa#grecia#1#2";
		partidos[4] = "portugal#españa#1#3";
		partidos[5] = "grecia#rusia#7#0";
		
		Torneo torneo = null;
		try {
			torneo = parser.parseTorneo(6, partidos);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Assert.assertNotNull(torneo);
		
	}
	
	@Test
	public void parseTorneoEmptyLineTest() {
		FutbolParser parser = new FutbolParser();
		String[] partidos = new String[7];
		partidos[0] = "";
		partidos[1] = "españa#rusia#3#1";
		partidos[2] = "portugal#rusia#3#0";
		partidos[3] = "españa#grecia#1#2";
		partidos[4] = "portugal#españa#1#3";
		partidos[5] = "grecia#rusia#7#0";
		partidos[6] = "portugal#grecia#4#1";

		
		Torneo torneo = null;
		try {
			torneo = parser.parseTorneo(7, partidos);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Assert.assertNotNull(torneo);
		Assert.assertEquals(6, torneo.getCantidadPartidos());
		
	}
	
	@Test
	public void executeTest()
	{
		FutbolParser parser = new FutbolParser();
		parser.execute(this._data);
		
		List<Torneo> torneos = parser.getTorneos();
		Assert.assertNotNull(torneos);
		
		for (Torneo torneo : torneos) {
			Assert.assertEquals(torneo.getCantidadPartidos(), torneo.getPartidos().size());
		}
	}
	
	@Test
	public void getResultsTableTest()
	{
		FutbolParser parser = new FutbolParser();
		parser.execute(this._data);
		
		List<String> resultsTable = parser.getResultsTable();
		
		Assert.assertNotNull(resultsTable);
	}

}
