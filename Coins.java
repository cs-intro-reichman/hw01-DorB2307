public class Coins {
    public static void main(String[] args) {
	int cents = Integer.parseInt(args[0]);
	int quarter = 25;
    System.out.println("Use " + cents/quarter + " quarters and " + cents%quarter + " cents.");
    }
}