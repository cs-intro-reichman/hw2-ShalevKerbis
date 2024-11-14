// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String word = args[0];
            String wordUpperCase = word.toUpperCase();
            int howManyTimes = Integer.parseInt(args[1]);

            
            //printing the first lines
            for (int i = 0 ; i < word.length() ; i++){
            //checking if we need to use a or an
                if ("AEFHILMNORSX".indexOf(wordUpperCase.charAt(i)) != -1){
                        System.out.println("Give me an " + wordUpperCase.charAt(i) + ": " + wordUpperCase.charAt(i) + "!");
                } else {
                        System.out.println("Give me a " + wordUpperCase.charAt(i) + ": " + wordUpperCase.charAt(i) + "!");
                }
            }

            //printing the middle line
            System.out.println("What does that spell?");

            //printing the last lines
            for (int i = 0 ; i < howManyTimes ; i++){
                System.out.println(wordUpperCase + "!!!");
            }
        }
}
