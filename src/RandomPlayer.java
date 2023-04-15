import java.util.Random;
public class RandomPlayer extends Player{
    public RandomPlayer(String name, char symbol) {
        super(name, symbol);
    }

    @Override
    public int[][] move(Board board) {
        Random rand = new Random();
        int x = rand.nextInt(3);
        int y = rand.nextInt(3);
        char [][] myBoard = board.getBoard();
       if (board.isValidMove(x,y)){
           board.takeMove(symbol,x,y);
       }

        return new int[x][y];
    }
}
