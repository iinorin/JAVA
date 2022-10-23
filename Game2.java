package Hackerrankproblems;

public class Game2 extends game{

    public static void main(String[] args) {

        game g = new game();

        boolean bool = false;
        while(!bool){
            g.takeuserinput();
            bool = g.isCorrectNumber();
        }

    }
}
