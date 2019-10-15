/*
 * CLASS CONSTANTS: TOWER_HEIGHT (adjusts the height of the tower)
 * 					STEEPLE_HEIGHT (adjusts the height of the antenna on top)
 * 					UPPER_TOWER_HEIGHT (adjusts the height of the upper part of the tower)
 * 
 * IN MAIN:
 * 
 */

public class ExtraCredit {
	
	public static final int STEEPLE_HEIGHT = 4;

	public static void main(String[] args) {
		steeple();
	}
	
	public static void steeple() {
		for(int i = 1; i <= STEEPLE_HEIGHT; i++) {
			for(int j = 0; j <= 12; j++) {
				System.out.print(" ");
			}
			System.out.println("||");
		}
	}
	
	public static void topChunk() {
		for(int i = 0; i < 4; i++) {
			System.out.print("__/");
			for(int j = 0; j <= 3*i; j++) {
				System.out.print(":");
			}
			System.out.print("||");
			
		}
	}

}
