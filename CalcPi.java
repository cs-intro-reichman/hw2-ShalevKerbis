// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int input = Integer.parseInt(args[0]);
		double sum = 0;
		double difference = 0;
		int differenceDenominator = 3;
		int sumDenominator = 1;

		//for even input:
		if (input % 2 == 0){
			for (int i = 0 ; i < input / 2 ; i++){
				difference = difference + ((double) 1 / differenceDenominator);
				differenceDenominator = differenceDenominator + 4;
			}
			for (int i = 0 ; i < input / 2 ; i++){
				sum = sum + ((double) 1 / sumDenominator);
				sumDenominator = sumDenominator + 4;
			}
		} else {
		//for odd input:
			for (int i = 0 ; i < input / 2 ; i++){
				difference = difference + ((double) 1 / differenceDenominator);
				differenceDenominator = differenceDenominator + 4;
			}
			for (int i = 0 ; i <= input / 2 ; i++){
				sum = sum + ((double) 1 / sumDenominator);
				sumDenominator = sumDenominator + 4;
			}
		}
		double piApproximated = 4 * (double) (sum - difference);
		System.out.println("pi, according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + piApproximated);
	}
}
