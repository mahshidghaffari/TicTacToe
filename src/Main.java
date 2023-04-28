import java.util.Scanner;

public class Main {
    /**
     * This is the main method
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        System.out.println("TicTacToe!");
        System.out.println();
        System.out.println("Nr of players(1/2):");
        int o = scan2.nextInt();
        Board board = new Board();
        if (o == 1) {
            System.out.println("What's your name:");
            String name = scan.nextLine();
            System.out.println("What symbol do you want(X/O):");
            char symbol = scan2.next().charAt(0);
            HumanPlayer player1 = new HumanPlayer(name, symbol);
            char symbol2;
            if (symbol == 'X') {
                symbol2 = 'O';
            } else {
                symbol2 = 'X';
            }
            RandomPlayer comp = new RandomPlayer("Computer", symbol2);
            board.displayBoard();
            if (player1.getSymbol() == 'X') {
                while (!board.isFull()) {
                    player1.move(board);
                    board.displayBoard();
                    if (board.whoWon() != ' ' || board.isFull()) {
                        break;
                    }
                    System.out.println("Now is " + comp.getName() + "'s turn.");
                    comp.move(board);
                    board.displayBoard();
                    if (board.whoWon() != ' ') {
                        break;
                    }
                }
            } else {
                while (!board.isFull()) {
                    System.out.println("Now is " + comp.getName() + "'s turn.");
                    comp.move(board);
                    board.displayBoard();
                    if (board.whoWon() != ' '|| board.isFull()) {
                        break;
                    }
                    player1.move(board);
                    board.displayBoard();
                    if (board.whoWon() != ' ') {
                        break;
                    }
                }
            }
            if (board.isFull() && board.whoWon() == ' ') {
                System.out.println("It's a draw!");
            }
            if (board.whoWon() == player1.getSymbol()) {
                System.out.println(player1.getName() + " has won!");
                System.out.println("Congratulations!");
            } else if (board.whoWon() == comp.getSymbol()){
                System.out.println(comp.getName() + " has won!");
                System.out.println("Better luck next time!");
            }
        } else if (o == 2) {
            System.out.println("Player 1 name:");
            String name1 = scan.nextLine();
            System.out.println("Player 1 symbol:");
            char symbol1 = scan2.next().charAt(0);
            HumanPlayer player1 = new HumanPlayer(name1, symbol1);
            System.out.println("Player 2 name:");
            String name2 = scan.nextLine();
            char symbol2;
            if (symbol1 == 'X') {
                symbol2 = 'O';
            } else {
                symbol2 = 'X';
            }
            HumanPlayer player2 = new HumanPlayer(name2, symbol2);
            System.out.println("Player 2 symbol: " + player2.getSymbol());
            board.displayBoard();
            if (player1.getSymbol() == 'X') {
                while (!board.isFull()) {
                    System.out.println("Now is " + player1.getName() + "'s turn.");
                    player1.move(board);
                    board.displayBoard();
                    if (board.whoWon() != ' '|| board.isFull()) {
                        break;
                    }
                    System.out.println("Now is " + player2.getName() + "'s turn.");
                    player2.move(board);
                    board.displayBoard();
                    if (board.whoWon() != ' ') {
                        break;
                    }
                }
            }
            else {
                while (!board.isFull()) {
                    System.out.println("Now is " + player2.getName() + "'s turn.");
                    player2.move(board);
                    board.displayBoard();
                    if (board.whoWon() != ' '|| board.isFull()) {
                        break;
                    }
                    System.out.println("Now is " + player1.getName() + "'s turn.");
                    player1.move(board);
                    board.displayBoard();
                    if (board.whoWon() != ' ') {
                        break;
                    }
                }
            }
            if (board.isFull() && board.whoWon() == ' ') {
                System.out.println("It's a draw!");
            }else {
                if (board.whoWon() == player1.getSymbol()) {
                    System.out.println(player1.getName() + " has won!");
                } else if (board.whoWon() == player2.getSymbol()){
                    System.out.println(player2.getName() + " has won!");
                }
                System.out.println("Congratulations!");
            }
        }
    }
}