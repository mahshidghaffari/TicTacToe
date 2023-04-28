import java.util.Random;

/**
 * This class is the computer player.
 * It's a child class of the Player class:{@link #Player}
 */
public class RandomPlayer extends Player{
    /**
     * This constructor retrieves the name and symbol of the computer from the parent class.
     * @param name of computer, not null
     * @param symbol of computer, not null
     */
    public RandomPlayer(String name, char symbol) {
        super(name, symbol);
    }

    /**
     * This class allows the computer to occupy a position.
     * It chooses the position using a random number generator.
     * This method overrides the move method from the parent class.
     * It checks if the position is already occupied using the isValidMove method from the Board class{@code Board.isValidMove}
     * If the position is occupied the method repeats.
     * It then occupies the position using the takeMove method from the Board class:{@code Board.takeMove}
     * @param board, not null
     * @return the position that the computer has chosen, not null
     */
    @Override
    public int[][] move(Board board) {
        Random rand = new Random();
        int x = rand.nextInt(3);
        int y = rand.nextInt(3);
       if (board.isValidMove(x,y)){
           board.takeMove(getSymbol(),x,y);
       }else {
           return move(board);
       }

        return new int[x][y];
    }
}
