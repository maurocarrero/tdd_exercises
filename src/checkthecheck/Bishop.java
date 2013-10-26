package checkthecheck;

import java.util.ArrayList;
import java.util.List;

public class Bishop extends Pieza {

	public Bishop(EnumBando bando, int x, int y) {
		super(bando, x, y);
	}

	@Override
	public List<int[]> posiblesMovimientos(int x, int y) {
		List<int[]> movs = new ArrayList<int[]>();

		for (int i=x+1, j=y-1; i < 8 && j >= 0; i++, j--) {
			int[] mov = { i, j };
			movs.add(mov);
		}
		for (int i=x+1, j=y+1; i < 8 && j < 8; i++, j++) {
			int[] mov = { i, j };
			movs.add(mov);
		}
		for (int i=x-1, j=y-1; i >= 0 && j >= 0; i--, j--) {
			int[] mov = { i, j };
			movs.add(mov);
		}
		for (int i=x-1, j=y+1; i >= 0 && j < 8; i--, j++) {
			int[] mov = { i, j };
			movs.add(mov);
		}
		
		return movs;
	}

	@Override
	public boolean attack(int[] posicionRey, Pieza[][] tablero) {
		int x = this.getX();
		int y = this.getY();
		
		if (kingAtSight(posicionRey)) {
			if (posicionRey[0] > x && posicionRey[1] < y) {
				for (int i=x+1, j=y-1; i < posicionRey[0] && j > posicionRey[1]; i++, j--) {
					if (tablero[i][j] != null)
						return false;
				}
			}
			if (posicionRey[0] > x && posicionRey[1] > y) {
				for (int i=x+1, j=y+1; i < posicionRey[0] && j < posicionRey[1]; i++, j++) {
					if (tablero[i][j] != null)
						return false;
				}
			}
			if (posicionRey[0] < x && posicionRey[1] < y) {
				for (int i=x-1, j=y-1; i > posicionRey[0] && j >= posicionRey[1]; i--, j--) {
					if (tablero[i][j] != null)
						return false;
				}
			}
			if (posicionRey[0] < x && posicionRey[1] > y) {
				for (int i=x-1, j=y+1; i > posicionRey[0] && j < posicionRey[0]; i--, j++) {
					if (tablero[i][j] != null)
						return false;
				}
			}
			return true;
		}
		return false;
	}

}
