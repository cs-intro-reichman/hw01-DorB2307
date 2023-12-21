public class GenThree {
   public static void main(String[] args) {
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);
        int range = max - min + 1;
	int minRand = max;
        for (int i = 0; i < 3; i++) {
                int rand = (int)(Math.random() * range) + min;
		System.out.println(rand);
		if (minRand > rand) {
			minRand = rand;
		}
	}
	System.out.println("The minimal generated number was " + minRand);	
   }
} 