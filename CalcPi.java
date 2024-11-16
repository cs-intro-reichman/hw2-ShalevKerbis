// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int input = Integer.parseInt(args[0]);
		double sum = 0;
		boolean plusMin = true;
		int denominator = 1;

		for (int i = 0 ; i < input ; i++){
			if (plusMin){
				sum = sum + (double) 1 / denominator;
				plusMin = false;
			} else {
				sum = sum - (double) 1 / denominator;
				plusMin = true;
			}
			denominator = denominator + 2;
		}

		double piApproximated = 4 * sum;
		System.out.println("pi, according to Java: " + Math.PI);
		System.out.println("pi, approximated:      " + piApproximated);
	}
}