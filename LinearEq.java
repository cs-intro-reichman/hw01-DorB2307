public class LinearEq {
    public static void main(String[] args) {
	double a = Double.valueOf(args[0]);
	double b = Double.valueOf(args[1]);
	double c = Double.valueOf(args[2]);
	double x = (c - b)/a;
    System.out.println(a + " * x + " + b + " = "+ c);
	System.out.println("x = " + x);
    }
}