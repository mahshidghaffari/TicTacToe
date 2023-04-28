import java.util.Scanner;

/**
 * This is the human player class.
 * It contains all the functions the human player will need.
 * It is a child class of the Player class:{@link #Player}
 */
public class HumanPlayer extends Player{
    /**
     * This constructor retrieves the name and symbol of the player from the parent class.
     * @param name of player, not null
     * @param symbol of player, not null
     */
    public HumanPlayer(String name, char symbol){
        super(name, symbol);
    }
    /**
     * This class allows the player to occupy a position.
     * It takes the player's inputs using a scanner.
     * This method overrides the move method from the parent class.
     * It checks if the position is already occupied using the isValidMove method from the Board class{@code Board.isValidMove}
     * If the position is occupied the method repeats.
     * It then occupies the position using the takeMove method from the Board class:{@code Board.takeMove}
     * @param board, not null
     * @return the position that the player has chosen, not null
     */
    @Override
    public int[][] move(Board board) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What position would you like to occupy");
        int x = scan.nextInt() - 1;
        int y =  scan.nextInt() - 1;
        if (board.isValidMove(x,y)){
            board.takeMove(getSymbol(),x,y);
        }else{
            System.out.println("Position is already occupied!");
            return move(board);
        }

        return new int[x][y];
    }
}
