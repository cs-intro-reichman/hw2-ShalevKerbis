// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int n = Integer.parseInt(args[0]);
		String mood = args[1];
		int quantity = 0;

		if (mood.equals("v")){
			for (int i = 1 ; i <= n ; i++){
				int newNumber = i;
				int sumOfSteps = 1;
				System.out.print(i + " ");
				sumOfSteps++;
				newNumber = newNumber % 2 == 0 ? newNumber / 2 : newNumber * 3 + 1;
				System.out.print(newNumber + " ");
	
				while (newNumber > 1){
					newNumber = newNumber % 2 == 0 ? newNumber / 2 : newNumber * 3 + 1;
					sumOfSteps++;
					System.out.print(newNumber + " ");
				}
				System.out.println("(" + sumOfSteps + ")");
				quantity++;
			}
		} else {
			for (int i = 1 ; i <= n ; i++){
				int newNumber = i;
				newNumber = newNumber % 2 == 0 ? newNumber / 2 : newNumber * 3 + 1;
	
				while (newNumber > 1){
					newNumber = newNumber % 2 == 0 ? newNumber / 2 : newNumber * 3 + 1;
				}
				quantity++;
			}
		}
		System.out.println("Every one of the first " + quantity + " hailstone sequences reached 1.");
	}
}	
