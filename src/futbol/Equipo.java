package futbol;

public class Equipo implements Comparable<Equipo>
{
	private String _nombre;
	private int _puntos;
	private int _partidosGanados;
	private int _partidosEmpatados;
	private int _partidosPerdidos;
	private int _golesFavor;
	private int _golesContra;
	
	public Equipo(String nombre) {
			this._nombre = nombre.toLowerCase();
			this._golesContra = 0;
			this._golesFavor = 0;
			this._partidosEmpatados = 0;
			this._partidosGanados = 0;
			this._partidosPerdidos = 0;
	}
	
	public String getNombre() {
		return _nombre;
	}
	
	public int getPuntos() {
		return _puntos;
	}

	public int getPartidosGanados() {
		return _partidosGanados;
	}

	public int getPartidosEmpatados() {
		return _partidosEmpatados;
	}
	
	public int getPartidosPerdidos() {
		return _partidosPerdidos;
	}

	public int getGolesFavor() {
		return _golesFavor;
	}

	public int getGolesContra() {
		return _golesContra;
	}
	
	public void processResult(ResultEnum result, int golesFavor, int golesContra) {
		if (result == ResultEnum.EMPATE) {
			this._puntos += 1;
			this._partidosEmpatados++;
		}
		else if (result == ResultEnum.VICTORIA) {
			this._puntos += 3;
			this._partidosGanados++;
		}
		else {
			this._partidosPerdidos++;
		}			
		this._golesFavor += golesFavor;
		this._golesContra += golesContra;
	}

	@Override
	public int compareTo(Equipo o) {
		if (o.getPuntos() >= this.getPuntos()) {
			if (o.getPuntos() == this.getPuntos()) {
				if (o.getPartidosGanados() >= this._partidosGanados) {
					if (o.getPartidosGanados() == this._partidosGanados) {
						if (o.getDiferenciaGoles() >= this.getDiferenciaGoles()) {
							if (o.getDiferenciaGoles() == this.getDiferenciaGoles()) {
								if (o.getGolesFavor() >= this.getGolesFavor()) {
									if (o.getGolesFavor() == this.getGolesFavor()) {
										if (o.getGolesContra() >= this.getGolesContra()) {
											if (o.getGolesContra() == this.getGolesContra()) {
												return this.getNombre().compareTo(o.getNombre());
											}
											return 1;
										}
										return -1;
									}
									return 1;
								}
								return -1;
							}
							return 1;
						}
						return -1;
					}
					return 1;
				}
				return -1;
			}
			return 1;
		}
		return -1;
	}
	
	public int getDiferenciaGoles() {
		return this._golesFavor - this._golesContra;
	}	

}
