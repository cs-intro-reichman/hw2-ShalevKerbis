public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);

        int hours;
        int minutes;

        //getting the hours value
        if (time.charAt(0) == 0){
            hours = Integer.parseInt("" + time.charAt(1));
        } else {
            hours = Integer.parseInt("" + time.charAt(0) + time.charAt(1));
        }

        //getting the minutes value
        if (time.charAt(3) == 0){
            minutes = Integer.parseInt("" + time.charAt(4));
        } else {
            minutes = Integer.parseInt("" + time.charAt(3) + time.charAt(4));
        }

        //calculating the new futers valus in order to solve the problem

        int totalMinutes = (hours * 60) + minutes + minutesToAdd;
        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours * 60);

        if (newHours < 10){
            System.out.print("0" + newHours + ":");
        } else {
            System.out.print(newHours + ":");
        }

        if (newMinutes < 10){
            System.out.println("0" + newMinutes);
        } else {
            System.out.println(newMinutes);
        }
    }
}
