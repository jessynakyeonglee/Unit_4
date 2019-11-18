import java.util.Scanner;

public class Piglet {
    public static String Rolldice() {
        int dice = (int) (Math.random() * 6 + 1);
        int score = 0;
        Scanner scan = new Scanner(System.in);
        String choice = scan.next();


        while (dice != 1) {
            score += dice;
            return "You rolled a " + dice + "! \nRoll again?";
            if (choice.equals("no")) {
                return "You got " + score + "points.";
            }
            else

        }

    }
    public static void main (String[]args){

        System.out.println("Welcome to Piglet!");
        System.out.println(Rolldice());
    }
}
