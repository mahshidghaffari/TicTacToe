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
       if (board.isValidMove(x,y)){
           board.takeMove(getSymbol(),x,y);
       }else {
           return move(board);
       }

        return new int[x][y];
    }
}
