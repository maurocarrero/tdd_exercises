package checkthecheck;

public class Tablero
{
	private Pieza[][] _tablero;
	private int[] _posicionReyBlanco = {-1, -1};
	private int[] _posicionReyNegro = {-1, -1};
	
	public Tablero(Pieza[][] tablero) {
		this._tablero = tablero;
		locateKings();
	}

	public Pieza[][] getTablero() {
		return _tablero;
	}

	public int[] getPosicionReyBlanco() {
		return _posicionReyBlanco;
	}

	public int[] getPosicionReyNegro() {
		return _posicionReyNegro;
	}

	public void locateKings() {
		for (int x = 0; x < 8; x++) {
			for (int y = 0; y < 8; y++) {
				if (this._tablero[x][y] instanceof King) {
					Pieza king = (King) this._tablero[x][y];
					if (king.getBando() == EnumBando.blanco) {
						this._posicionReyBlanco[0] = x;
						this._posicionReyBlanco[1] = y;
					} else 
						if (king.getBando() == EnumBando.negro) {
							this._posicionReyNegro[0] = x;
							this._posicionReyNegro[1] = y;
					}
				}
			}
		}
	}

	public boolean reyEnJaque(EnumBando bando) {
		for (int x = 0; x < 8; x++) {
			for (int y = 0; y < 8; y++) {
				if (this._tablero[x][y] != null) {
					Pieza pieza = this._tablero[x][y];
					if (pieza.getBando() != bando)
						if (pieza.getBando() == EnumBando.negro) {
							if (pieza.attack(this.getPosicionReyBlanco(), this.getTablero()))
								return true;
						} else {
							if (pieza.attack(this.getPosicionReyNegro(), this.getTablero()))
								return true;
						}
				}
			}
		}
		return false;
	}	
}
