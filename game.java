package Hackerrankproblems;

import java.util.Random;
import java.util.Scanner;

public class game {
   public int num;
    static int userinput;
    public int guesses=0;

    public int getGuesses() {
        return guesses;
    }

    public void setGuesses(int guesses) {
        this.guesses = guesses;
    }

    game() {
       Random rand = new Random();
       this.num = rand.nextInt(100);
    }

    public void takeuserinput(){
        System.out.println("Taking user input for guessing the number");
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
