package checkthecheck;

import java.util.ArrayList;
import java.util.List;

public class Knight extends Pieza {

	public Knight(EnumBando bando, int x, int y) {
		super(bando, x, y);
	}

	@Override
	public List<int[]> posiblesMovimientos(int x, int y) {
		List<int[]> movs = new ArrayList<int[]>();
		int[] mov1 = { x+1, y-2 };
		int[] mov2 = { x+2, y-1 };
		int[] mov3 = { x+2, y+1 };
		int[] mov4 = { x+1, y+2 };
		int[] mov5 = { x-1, y+2 };
		int[] mov6 = { x-2, y+1 };
		int[] mov7 = { x-2, y-1 };
		int[] mov8 = { x-1, y-2 };
		
		movs.add(mov1);
		movs.add(mov2);
		movs.add(mov3);
		movs.add(mov4);
		movs.add(mov5);
		movs.add(mov6);
		movs.add(mov7);
		movs.add(mov8);
		
		return movs;
	}

	@Override
	public boolean attack(int[] posicionRey, Pieza[][] tablero) {
		if (kingAtSight(posicionRey)) {				
			return true;
		}
		return false;
	}

}
