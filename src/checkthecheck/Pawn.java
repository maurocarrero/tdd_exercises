package checkthecheck;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends Pieza {
	
	public Pawn(EnumBando bando, int x, int y) {
		super(bando, x, y);
	}

	@Override
	public List<int[]> posiblesMovimientos(int x, int y) {
		List<int[]> movs = new ArrayList<int[]>();
		int[] mov1 = new int[2]; 
		int[] mov2 = new int[2];
		
		if (this.getBando() == EnumBando.blanco){
			if (x-1 >= 0 && y-1 >= 0) {
				mov1[0] = x-1;
				mov1[1] = y-1;
			} else
				mov1 = null;
			if (x-1 >= 0 && y+1 < 8) {
				mov2[0] = x-1;
				mov2[1] = y+1;
			} else
				mov2 = null;
		} else 
			if (this.getBando() == EnumBando.negro) {
				if (x+1 < 8 && y-1 >= 0) {
					mov1[0] = x+1;
					mov1[1] = y-1;
				} else
					mov1 = null;
				if (x+1 < 8 && y+1 < 8) {
					mov2[0] = x+1;
					mov2[1] = y+1;
				} else
					mov2 = null;
			}
		if (mov1 != null)
			movs.add(mov1);
		if (mov2 != null)
			movs.add(mov2);
		
		return movs;
	}

	@Override
	public boolean attack(int[] posicionRey, Pieza[][] tablero) {
		if (kingAtSight(posicionRey))
			return true;
		return false;
	}

}
