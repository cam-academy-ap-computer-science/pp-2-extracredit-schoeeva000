/*
 * CLASS CONSTANTS: TOWER_HEIGHT (adjusts the height of the tower)
 * 					STEEPLE_HEIGHT (adjusts the height of the antenna on top)
 * 					UPPER_TOWER_HEIGHT (adjusts the height of the upper part of the tower)
 * 
 * IN MAIN:
 * call a steeple function
 * print a top half
 * print a line of " marks
 * print a lower half
 * print an upper, thinner tower
 * print a lower, thicker tower
 * print another top half for the base
 * print another quote line
 * 
 * STEEPLE:
 * Print spaces and than ||
 * 
 * TOP CHUNK:
 * Print spaces and a /, and than periods
 * Print the middle portion, than more periods and a \
 * 
 * QUOTE LINE:
 * Print a line of quotes bounded by | characters
 * 
 * LOWER CHUNK:
 * shorten the following line by 2 each time loop runs:
 * Print \_ than repeat /\ until the end where _/ is printed
 * 
 * UPPER TOWER: 
 * Same as steeple function but is a different height so needs a different method
 * 
 * MAIN TOWER:
 * Prints the bulk of the tower, |%%||%%| as many times as the class constant specifies
 * 
 */

public class ExtraCredit {
	
	
	
	public static final int STEEPLE_HEIGHT = 4;
	public static final int UPPER_TOWER_HEIGHT = 4;
	public static final int TOWER_HEIGHT = 16;
	//Default values: 4, 4, and 16

	public static void main(String[] args) {
		steeple();
		topChunk();
		quoteLine();
		lowerChunk();
		upperTower();
		mainTower();
		topChunk();
		quoteLine();
		
	}
	
	public static void steeple() { // print the steeple at the top
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
	}
	
	public static void lowerChunk() {
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
	
	public static void upperTower() { // prints the thinner part of the tower
		for(int i = 1; i <= UPPER_TOWER_HEIGHT; i++) {
			System.out.println("             ||");
		}
	}
	
	public static void mainTower() { // prints the thicker part of the tower
		for(int i = 1; i < TOWER_HEIGHT; i++) {
			System.out.println("          |%%||%%|");
		}
	}
	

}
