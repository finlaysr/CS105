import java.util.Scanner;
/**
 * Write a description of class game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    // instance variables - replace the example below with your own
    private boolean done;
    private Board board;
    private int shots;
    private int size;
    Scanner getInput = new Scanner(System.in);

    /**
     * Constructor for objects of class game
     */
    public Game()
    {
        // initialise instance variables
        done = false;
        System.out.println("\nWelcome to Knots and Crosses. First choose a ");
        System.out.print("board size: ");
        size = getInput.nextInt(); 
        
        while (Math.sqrt(size)%1 != 0 || size < 4){
            System.out.print("Must be a square!: ");
            size = getInput.nextInt();
        }// Read user input
        
        board = new Board(size);
        board.printBoard();
        System.out.println("This is your board, and the numbers that represent each piece");
        System.out.println("Type in a number to place a piece.");
        
        play();
    }

    private void play(){
        char currentShot = 'X';
        int state;
        
        
        while (!done && shots < size){
            System.out.print("\n" + currentShot + "'s Shot: ");
            int pos = getInput.nextInt()-1;
            
            while (pos > size || board.getPiece(pos) != 0){
                System.out.print("Invalid Shot, try again: ");
                pos = getInput.nextInt()-1;
            }
            
            state = board.placePiece(pos, currentShot);
            board.printBoard();
            if (state == 0) {
                shots ++;
            }
            else{
                System.out.println(currentShot + " won!");
                done = true;
            }
            
            if (currentShot == 'X') {
                currentShot = 'O';
            }else{
                currentShot = 'X';
            }
            
        }
    }
}
