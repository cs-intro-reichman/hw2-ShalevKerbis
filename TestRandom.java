// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
	    int howManyTimes = Integer.parseInt(args[0]);

		int greater = 0;
		int lessOrEqual = 0;

		//iterate the choosing of a random number as many as the user decide
		for (int i = 0 ; i < howManyTimes ; i++){
			double number = Math.random();
			if (number > 0.5){
				greater++;
			} else {
				lessOrEqual++;
			}
		}

		if (lessOrEqual == 0){
			System.out.println("Can't divide by 0.");
			return;
		}

		double ratio = (double) greater / (double) lessOrEqual;

		System.out.println(">0.5: " + greater);
		System.out.println("<=0.5: " + lessOrEqual);
		System.out.println("Ratio: " + ratio);
	}
}
