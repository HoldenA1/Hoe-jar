package iambread.hi.bye.helper;

import iambread.hi.bye.display.*;
import iambread.hi.bye.listeners.*;

public class Corruption {
	
	public static int finalCount;
	public static int temp = 0;
	public static int possibleCount;
	
	public static int calculateCorruption() {
		finalCount = 0;
		temp = 0;
		possibleCount = 0;
		char[] array = Display.txt.toCharArray();
		for (char r : array) {
			if (r == 'a') temp += 1;
			else if (r == 'b') temp += 2;
			else if (r == 'c') temp += 3;
			else if (r == 'd') temp += 4;
			else if (r == 'e') temp += 5;
			else if (r == 'f') temp += 6;
			else if (r == 'g') temp += 7;
			else if (r == 'h') temp += 8;
			else if (r == 'i') temp += 9;
			else if (r == 'j') temp += 10;
			else if (r == 'k') temp += 11;
			else if (r == 'l') temp += 12;
			else if (r == 'm') temp += 13;
			else if (r == 'n') temp += -1;
			else if (r == 'o') temp += -2;
			else if (r == 'p') temp += -3;
			else if (r == 'q') temp += -4;
			else if (r == 'r') temp += -5;
			else if (r == 's') temp += -6;
			else if (r == 't') temp += -7;
			else if (r == 'u') temp += -8;
			else if (r == 'v') temp += -9;
			else if (r == 'w') temp += -10;
			else if (r == 'x') temp += -11;
			else if (r == 'y') temp += -12;
			else if (r == 'z') temp += -13;
			else temp += Actions.random.nextInt(12);
		}
		if (temp < 0) {
			temp *= -1;
		}
		
		possibleCount = array.length * 13;
		finalCount = (temp * 320) / possibleCount;
		Actions.pp = (temp * 100) / possibleCount;
		
		return finalCount;		
	}

}
