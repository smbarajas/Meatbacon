/* Write a randomWalk method that preforms steps of a random one-dimensional walk.
The walk begins at 0 and will either increase or decrease the postion by one.
There will be an equal probability for it to decrease and increase.
It will continue making steps until a position of 3 or -3 is reached.
It will then report the max position. */

import java.util.Random;
class Main {
	public static void main(String[] args) {
		int steps = 0;
		int max = steps;
		for (int i = 0 ; i < 100 ; i ++) {
			steps += randomWalk();
			if (max < steps)
				max = steps;
			System.out.println("position" + i + " = " + steps);
      if (steps == 3 || steps == -3){
        break;
      }
		}
		System.out.println("max position = " + max);
	}
	
	public static int randomWalk() {
		Random rnd = new Random();
		int number = rnd.nextInt(2);
		if (number == 1) {
			return -1;
		}
		return 1;
	}
}
