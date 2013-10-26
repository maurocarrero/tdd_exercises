package checkthecheck;

import java.util.List;

public abstract class Pieza
{	
	private int _x;
	private int _y;
	private EnumBando _bando;
	protected List<int[]> _posiblesMovimientos;
	
	Pieza(EnumBando bando, int x, int y) {
		this._bando = bando;
		this._x = x;
		this._y = y;
		this._posiblesMovimientos = posiblesMovimientos(x, y);
	}
	
	public abstract List<int[]> posiblesMovimientos(int x, int y);
	public abstract boolean attack(int[] posicionRey, Pieza[][] tablero);

	protected boolean kingAtSight(int[] posicionRey) {
		List<int[]> tablero = this.getPosiblesMovimientos();
		for (int[] pos : tablero) {
			if (pos[0] == posicionRey[0] && pos[1] == posicionRey[1])
				return true;
		}
		return false;
	}
	
	public EnumBando getBando() {
		return _bando;
	}

	public List<int[]> getPosiblesMovimientos() {
		return _posiblesMovimientos;
	}

	public int getX() {
		return this._x;
	}

	public int getY() {
		return this._y;
	}

}
