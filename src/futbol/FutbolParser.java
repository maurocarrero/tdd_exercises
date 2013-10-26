package futbol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class FutbolParser
{
	private int _cantidadTorneos;
	private List<Torneo> _torneos;
	
	public FutbolParser() {
		this._cantidadTorneos = 0;
		this._torneos = new ArrayList<Torneo>();
	}
	
	public void addTorneo(Torneo torneo) {
		if (this._torneos.size() < 1000) 
			this._torneos.add(torneo);
	}
	
	public List<Torneo> getTorneos() {
		return _torneos;
	}

	public int getCantidadTorneos() {
		return _cantidadTorneos;
	}

	public void setCantidadTorneos(int _cantidadTorneos) {
		this._cantidadTorneos = _cantidadTorneos;
	}

	public boolean execute(List<String> data) {
		
		int cantidadTorneos = -1;
		
		try {
			cantidadTorneos = Integer.parseInt(data.get(0));
			if (cantidadTorneos < 1000) {
				
				int cantidadPartidos = 0;
				String[] lineasPartido = null;
				boolean torneoEnCurso = false;
				int cont = 0;
				
				for (int i = 1; i < data.size(); i++) {
 					if (!torneoEnCurso) {
						cantidadPartidos = Integer.parseInt(data.get(i));
						if (cantidadPartidos <= 0)
							throw new CantidadPartidosException();
						lineasPartido = new String[cantidadPartidos];
						torneoEnCurso = true;
						cont = 0;
					}
					else
						lineasPartido[cont++] = data.get(i);
						
					if (cont == cantidadPartidos) {
						torneoEnCurso = false;
						Torneo torneo = parseTorneo(cantidadPartidos, lineasPartido);
						this._torneos.add(torneo);
					}
				}
			}
		} catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch(CantidadPartidosException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public Torneo parseTorneo(int cantidadPartidos, String[] lineasPartido) throws Exception {		
		
		if (lineasPartido.length != cantidadPartidos)
			throw new CantidadPartidosException();
		
		return new Torneo(cantidadPartidos, lineasPartido);
	}

	public List<String> getResultsTable()
	{
		List<String> lineas = new ArrayList<String>();
		for (Torneo torneo : this._torneos) {
			torneo.processResults();
			List<Equipo> equipos = torneo.getEquipos();
			Collections.sort(equipos);
			int posicion = 1;
			for (Equipo equipo : equipos) {
				StringBuffer nuevaLinea = new StringBuffer();
				nuevaLinea.append(posicion + "\t");
				nuevaLinea.append(StringUtils.rightPad(equipo.getNombre(), 15) + "\t");
				nuevaLinea.append(equipo.getPuntos() + "\t");
				nuevaLinea.append(equipo.getPartidosGanados() + "\t");
				nuevaLinea.append(equipo.getDiferenciaGoles() + "\t");
				nuevaLinea.append(equipo.getGolesFavor() + "\t");
				nuevaLinea.append(equipo.getGolesContra());
				lineas.add(nuevaLinea.toString());
				posicion++;
			}
			lineas.add("****************************************");
		}
		return lineas;
	}
	

}
