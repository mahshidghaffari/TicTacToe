public class Board {
    public char [][] board = new char[3][3];

    public void instructBoard(){
        System.out.println("| - | - | - |");
        System.out.println("| 1 | 2 | 3 |");
        System.out.println("| - | - | - |");
        System.out.println("| 4 | 5 | 6 |");
        System.out.println("| - | - | - |");
        System.out.println("| 7 | 8 | 9 |");
        System.out.println("| - | - | - |");
    }

    public void  displayBoard(){
        System.out.println("| - | - | - |");
        System.out.println(printBoardRow(0));
        System.out.println("| - | - | - |");
        System.out.println(printBoardRow(1));
        System.out.println("| - | - | - |");
        System.out.println(printBoardRow(2));
        System.out.println("| - | - | - |");
    }

    private String printBoardRow(int row){
    return "| "+ board[row][0]+" | "+ board[row][1]+board[row][2]+" |";
    }

    public char[][] getBoard(){
        return board;
    }

    public boolean isValidMove(int row, int col){
        return (board[row][col] !='X' && board[row][col] !='O');
    }
    public void takeMove(char symbol, int row, int col){
        board[row][col] = symbol;
    }

}
