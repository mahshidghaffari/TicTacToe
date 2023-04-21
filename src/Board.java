public class Board {
    public char[][] board = new char[3][3];

    public void displayBoard() {
        System.out.println(printBoardRow(0));
        System.out.println(printBoardRow(1));
        System.out.println(printBoardRow(2));
    }

    private String printBoardRow(int row) {
        return "| " + board[row][0] + " | " + board[row][1] + " | " + board[row][2] + " |";
    }

    public boolean isValidMove(int row, int col) {
        return (board[row][col] != 'X' && board[row][col] != 'O');
    }

    public void takeMove(char symbol, int row, int col) {
        board[row][col] = symbol;
    }

    public boolean isFull() { //Dosen't work
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] != 'X' && board[i][j] != '0') {
                    return (false);
                }
            }
        }
        return (true);
    }

    public char whoWon() {
        char s = ' ';
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                if (board[i][0] == 'X') {
                    s = 'X';
                } else if (board[i][0] == '0') {
                    s = '0';
                }
            } else if (board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                if (board[0][i] == 'X') {
                    s = 'X';
                } else if (board[0][i] == '0') {
                    s = '0';
                }
            }
        }
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            if (board[0][0] == 'X') {
                s = 'X';
            } else if (board[0][0] == '0') {
                s = '0';
            }
        } else if (board[2][0] == board[1][1] && board[2][0] == board[0][2]) {
            if (board[2][0] == 'X') {
                s = 'X';
            } else if (board[2][0] == '0') {
                s = '0';
            }
        }

        return s;
    }
}
