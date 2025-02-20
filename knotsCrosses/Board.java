import  java.util.Arrays;
/**
 * Write a description of class board here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Board
{
    // instance variables - replace the example below with your own
    private int size;
    private int[] board;

    /**
     * Constructor for objects of class board
     */
    public Board(int size){
        // initialise instance variables
        this.size = size;
        board = new int[size];
    }

    public void printBoard(){
        int dim;
        char[] convert = {'-', 'O', 'X'};
        dim = (int)Math.sqrt(board.length);
        
        for (int line = 0; line < dim; line ++ ){
            
            for (int cell = 0; cell < dim; cell++){
                
                System.out.print(convert[board[dim * line + cell]] + " ");
            }
            
            System.out.print(" |  ");
            for (int cell = 0; cell < dim; cell++){
                
                System.out.print((dim * line + cell + 1) + " ");
            }
            
            System.out.println(" ");
        }
    }
    
    public int placePiece(int pos, char type){
        if (type == 'X'){
            board[pos] = 2;
        } else {
            board[pos] = 1;
        }
        
        return checkWin();
    }
    
    private boolean win(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[0] != array[i] || array[0] == 0) {
                return false;
            }
        }
        return true;
    }
    
    private int checkWin(){
        
        int[] tempArray; //rows
        int[] tempArray2; //columns
        int sideSize = (int)Math.sqrt(size);
        
        //rows & columns
        for (int i = 0; i < sideSize; i++){
            tempArray = new int[sideSize];
            tempArray2 = new int[sideSize];
            
            for (int j = 0; j < sideSize; j++){
                
                tempArray[j] = board[i*sideSize+j];
                tempArray2[j] = board[j*sideSize+i];
                
            }
            
            if (win(tempArray) || win(tempArray2)) {
                return 1;
            }
            
            //System.out.println(Arrays.toString(tempArray) + win(tempArray));
            //System.out.println(Arrays.toString(tempArray2) + win(tempArray2));
            
        }
        
        //diaganals
        tempArray = new int[sideSize]; //diaganal negative
        tempArray2 = new int[sideSize]; //diaganal positive 
        for (int i = 0; i < sideSize; i++){
            tempArray[i] = board[i*sideSize+i];
            System.out.println((i*sideSize+i) + " - "+ (i*sideSize+(sideSize-i-1)));
            tempArray2[i] = board[i*sideSize+(sideSize-i-1)];
        }
        
        if (win(tempArray) || win(tempArray2)) {
                return 1;
            }
            
        return 0;
    }
    
    public int getPiece(int pos){
        return board[pos];
    }
}
