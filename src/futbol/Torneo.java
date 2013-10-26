package futbol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Torneo
{
	private int _cantidadPartidos;
	private List<Partido> _partidos;
	private List<Equipo> _equipos;
	
	public Torneo(int cantidadPartidos, String[] lineasPartido) {		
		this._cantidadPartidos = cantidadPartidos;
		this._partidos = new ArrayList<Partido>();
		this._equipos = new ArrayList<Equipo>();
		
		for (String lineaPartido : lineasPartido) {
			if (lineaPartido.trim().length() > 0)
				this._partidos.add(parsePartido(lineaPartido));
			else
				this._cantidadPartidos--;
		}

	}
	
	public int getCantidadPartidos() {
		return this._cantidadPartidos;
	}

	public List<Partido> getPartidos() {
		return _partidos;
	}

	public List<Equipo> getEquipos() {
		return _equipos;
	}

	public Equipo getEquipo(String nombre) {
		for (Equipo equipo : this._equipos) {
			if (equipo.getNombre().equals(nombre))
				return equipo;
		}
		return null;
	}
	
	public void processResults() {
		for (Partido partido : this._partidos) {
			partido.processResults();
		}
		
		Collections.sort(this._equipos);
	}
	
	public Partido parsePartido(String partido) {
		String[] splittedPartido = partido.split("#");
		
		Equipo equipo1 = processEquipo(splittedPartido[0]);
		Equipo equipo2 = processEquipo(splittedPartido[1]);
		
		int golesEquipo1 = Integer.parseInt(splittedPartido[2]);
		int golesEquipo2 = Integer.parseInt(splittedPartido[3]);
		
		return new Partido(equipo1, equipo2, golesEquipo1, golesEquipo2);
	}
	
	public Equipo processEquipo(String nombre)
	{
		Equipo equipo = new Equipo(nombre);
		
		for (Equipo aux : this._equipos) {
			if (aux.getNombre().equals(nombre))
				return aux;
		}
		
		this._equipos.add(equipo);
		return equipo;
	}
	
}
