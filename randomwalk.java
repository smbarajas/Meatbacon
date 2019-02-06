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