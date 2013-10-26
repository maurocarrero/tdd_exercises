package futbol;

public class Partido
{
	private Equipo _equipo1;
	private Equipo _equipo2;
	private int _golesEquipo1;
	private int _golesEquipo2;
	
	public Partido(Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
		this._equipo1 = equipo1;
		this._equipo2 = equipo2;
		this._golesEquipo1 = (golesEquipo1 >= 0) ? golesEquipo1 : 0;
		this._golesEquipo2 = (golesEquipo2 >= 0) ? golesEquipo2 : 0;
	}

	public Equipo getEquipo1() {
		return _equipo1;
	}
	
	public Equipo getEquipo2() {
		return _equipo2;
	}

	public int getGolesEquipo1() {
		return _golesEquipo1;
	}
	
	public int getGolesEquipo2() {
		return _golesEquipo2;
	}
	
	public void processResults()
	{
		if (this._golesEquipo1 >= this._golesEquipo2) {
			if (this._golesEquipo1 == this._golesEquipo2) {
				this._equipo1.processResult(ResultEnum.EMPATE, this._golesEquipo1, this._golesEquipo2);
				this._equipo2.processResult(ResultEnum.EMPATE, this._golesEquipo2, this._golesEquipo1);
			} else {
				this._equipo1.processResult(ResultEnum.VICTORIA, this._golesEquipo1, this._golesEquipo2);
				this._equipo2.processResult(ResultEnum.DERROTA, this._golesEquipo2, this._golesEquipo1);
			}	
		} else {
			this._equipo1.processResult(ResultEnum.DERROTA, this._golesEquipo1, this._golesEquipo2);
			this._equipo2.processResult(ResultEnum.VICTORIA, this._golesEquipo2, this._golesEquipo1);
		}
	}
}
