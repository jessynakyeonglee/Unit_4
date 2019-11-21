import java.util.Scanner;
public class Piglet {
    public static void Rolldice() {
        int dice = 0;
        int score = 0;
        Scanner scan = new Scanner(System.in);
        while (true) {
            dice = (int) (Math.random() * 6 + 1);
            if (dice != 1) {
                score += dice;
                System.out.print("You rolled a " + dice + "\nRoll again?");
                if (scan.next().equals("no")) {
                    System.out.println("You got " + score + " points");
                    break;
                }
            }
            if (dice == 1) {
                System.out.print("You rolled 1!\nYou got 0 points!");
                break;
            }
        }
    }




    public static void main (String[]args){
        System.out.println("Welcome to Piglet!");
        Rolldice();
    }
}

