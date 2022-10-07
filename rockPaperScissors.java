package Hackerrankproblems;

import java.util.Scanner;

public class rockPaperScissors {

    public static void main(String[] args) {
        System.out.println(" 0 is rock, 1 is paper, 2 is scissor ");

        int min = 0; int max = 2;
        int computerInput = (int) (min+ Math.random() * (max-min));

        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        if(userInput == 0) {
            System.out.println("You chose rock");
        }
        else if(userInput == 1) {
            System.out.println("You chose Paper");
        }
        else if(userInput == 2){
            System.out.println("You chose scissor");
        }
        else{
            System.out.println("Sad You chose nothing");
        }

        if (userInput == computerInput) {
            System.out.println("Draw");
        }
        else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
                || userInput == 2 && computerInput == 1) {
            System.out.println("You Win!");
        } else {
            System.out.println("Computer Win!");
        }

        if(computerInput==0){
            System.out.println("Computer choice: Rock");
        }
        else if(computerInput==1){
            System.out.println("Computer choice: Paper");
        }
        else if(computerInput==2){
            System.out.println("Computer choice: Scissors");
        }

        System.out.println("THANKS FOR PLAYING");
    }
}
