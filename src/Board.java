/**
 * This is the Board class.
 * It contains the board and its methods.
 */
public class Board {
    /**
     * This is the board.
     */
    public char[][] board = new char[3][3];

    /**
     * This method displays the board using the printBoardRow method: {@link #printBoardRow(int)}
     */
    public void displayBoard() {
        System.out.println(printBoardRow(0));
        System.out.println(printBoardRow(1));
        System.out.println(printBoardRow(2));
    }

    /**
     * This method returns the row of the board to the displayBoard method in order to be displayed:{@link #displayBoard()}
     * @param row number, not null
     * @return the row of the board, not null
     */
    private String printBoardRow(int row) {
        return "| " + board[row][0] + " | " + board[row][1] + " | " + board[row][2] + " |";
    }

    /**
     * This method checks if the position specified by the player is empty.
     * @param row number, not null
     * @param col number, not null
     * @return is the position empty
     */
    public boolean isValidMove(int row, int col) {
        return (board[row][col] != 'X' && board[row][col] != 'O');
    }

    /**
     * This method occupies the position the player has requested with his symbol.
     * @param symbol of player, not null
     * @param row number, not null
     * @param col number, not null
     */
    public void takeMove(char symbol, int row, int col) {
        board[row][col] = symbol;
    }

    /**
     * This method check's if the board is full.
     * @return if the board is full
     */
    public boolean isFull() {
        int c = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 'X' || board[i][j] == 'O') {
                    c++;
                }
            }
        }
        return (c == 9);
    }

    /**
     * This method check's which of the player has won.
     * If none of the player has won it will return a blank space.
     * @return the symbol of the player who won or blank space,not null
     */
    public char whoWon() {
        char s = ' ';
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                if (board[i][0] == 'X') {
                    s = 'X';
                } else if (board[i][0] == 'O') {
                    s = 'O';
                }
            } else if (board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                if (board[0][i] == 'X') {
                    s = 'X';
                } else if (board[0][i] == 'O') {
                    s = 'O';
                }
            }
        }
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            if (board[0][0] == 'X') {
                s = 'X';
            } else if (board[0][0] == 'O') {
                s = 'O';
            }
        } else if (board[2][0] == board[1][1] && board[2][0] == board[0][2]) {
            if (board[2][0] == 'X') {
                s = 'X';
            } else if (board[2][0] == 'O') {
                s = 'O';
            }
        }

        return s;
    }
}
