package Hackerrankproblems;

import java.util.Random;
import java.util.Scanner;
class game2 {
   public int num;
    static int userinput;
    public int guesses=0;

    public int getGuesses() {
        return guesses;
    }

    public void setGuesses(int guesses) {
        this.guesses = guesses;
    }

    game2() {
       Random rand = new Random();
       this.num = rand.nextInt(100);
    }

    public void takeuserinput(){
        System.out.println("Type your number to play  guess the number");
       Scanner sc = new Scanner(System.in);
       userinput = sc.nextInt();
}

boolean isCorrectNumber(){
        guesses++;
        if(num == userinput){
            System.out.printf("Congrats you guessed the number in %d Guesses. \nThe number was %d\n", guesses, num);
        }
        else if (num > userinput) {
            System.out.println("Too low... pick a higher number");
        }
        else if (num < userinput) {
            System.out.println("Too high... pick a Lower number");

        }
        return false;
    }
}

public class game extends game2{

    public static void main(String[] args) {

        game g = new game();

        boolean bool = false;
        while(!bool){
            g.takeuserinput();
            bool = g.isCorrectNumber();
        }

    }
}

