import java.util.Scanner;

public class HumanPlayer extends Player{
    public HumanPlayer(String name, char symbol){
        super(name, symbol);
    }

    @Override
    public int[][] move(Board board) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What position would you like to occupy");
        int x = scan.nextInt() - 1;
        int y =  scan.nextInt() - 1;
        if (board.isValidMove(x,y)){ //Won't check for player who's symbol is X
            board.takeMove(getSymbol(),x,y);
        }else{
            System.out.println("Position is already occupied!");
            return move(board);
        }

        return new int[x][y];
    }
}
