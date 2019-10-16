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
		topChunk();
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
		for(int lines = 0; lines < 4; lines++) { // this whole for loop prints the sloped portion of the tower
			for(int i = 9 - lines * 3; i >= 0; i--) { // prints fewer and fewer spaces as lines gets larger
				System.out.print(" ");
			}
			System.out.print("__/");
			for(int j = 0; j <= 3 * lines - 1; j++) { // prints the colins in the "meat" 
				System.out.print(".");
			}
			System.out.print("||"); // prints the center portion
			for(int k = 0; k < 3 * lines; k++) { // does the same thing as the above for loop
				System.out.print(".");
			}
			System.out.println("\\__");
			
		}
		quoteLine();
		
		for(int lines = 0; lines < 4; lines++) { // prints the bottom half of the cafe area
			for(int i = lines * 2; i >= 0; i--) { // increases number of spaces based on what line is being written
				System.out.print(" ");
			}
			System.out.print("\\_");
			for(int j = 10 - (2 * lines); j >= 0; j--) {
				System.out.print("/\\"); // prints the "meat" of the lower half: /\
			}
			System.out.println("_/");
		}
	}
	
	public static void quoteLine() { // this prints the line of quotation marks surrounded by | characters
		System.out.print(" |");
		for(int i = 1; i <= 24; i++) {
			System.out.print("\"");
		}
		System.out.println("|");
	}
	

}
